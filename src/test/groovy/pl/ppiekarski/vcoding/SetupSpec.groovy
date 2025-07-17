package pl.ppiekarski.vcoding

import spock.lang.Specification

class SetupSpec extends Specification {

    def "Should work"() {
        given:
        var x = 5
        when:
        x = 4
        then:
        x == 4
    }
}
