package org.example

import spock.lang.Specification

import org.junit.Test;

class HelloSpockSpec extends Specification {
	@Test
	def "length of Spock's and his friends' names"() {
		expect:
		name.size() == length

		where:
		name     | length
		"Spock"  | 5
		"Kirk"   | 4
		"Scotty" | 6
	}
}
