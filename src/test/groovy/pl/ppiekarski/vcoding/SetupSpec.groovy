package pl.ppiekarski.vcoding

import spock.lang.Specification

class SetupSpec extends Specification {

    def "Should find numbers"() {
        expect:
        new Main().solution(input as int[]) == expected

        where:
        input                    || expected
        [4, 3, 2, 7, 8, 2, 3, 1] || [5, 6]
        [1, 1]                   || [2]
    }


    def "Should strings"() {
        expect:
        new Main().isValid(input) == expected

        where:
        input      || expected
        "()"       || true
        "()[]{}"   || true
        "([])"     || true
        "{[()]}"   || true
        "(((())))" || true
        "{}([])"   || true

        "("        || false
        ")"        || false
        "(]"       || false
        "([)]"     || false
        "((())"    || false
        "(()))"    || false
        "{[(])}"   || false
    }


}
