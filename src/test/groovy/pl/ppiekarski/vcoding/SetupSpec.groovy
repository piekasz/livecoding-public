package pl.ppiekarski.vcoding

import spock.lang.Specification

class SetupSpec extends Specification {

    def "Should work example 1"() {
        given:
        int[] input = [4,3,2,7,8,2,3,1].toArray()

        when:
        def result = new Main().solution(input)
        then:
        result == [5,6]
    }

    def "Should work example 2"() {
        given:
        int[] input = [1,1].toArray()

        when:
        def result = new Main().solution(input)
        then:
        result == [2]
    }


    def "Should work example s1"() {
        given:
        String input = "()[]{}"

        when:
        def result = new Main().isValid(input)
        then:
        result
    }

    def "Should work example s2"() {
        given:
        String input = "(([{}]))"

        when:
        def result = new Main().isValid(input)
        then:
        result
    }
    def "Should work example s3"() {
        given:
        String input = "([{]})"

        when:
        def result = new Main().isValid(input)
        then:
        !result
    }

    def "Should work example s4"() {
        given:
        String input = "([{})"

        when:
        def result = new Main().isValid(input)
        then:
        !result
    }


}
