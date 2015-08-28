package org.example

import groovy.transform.ToString
import groovy.util.logging.Slf4j

/**
 * A data object with properties and behavior
 */

// Writing toString by hand is just borring...
@ToString(includeNames = true, includePackage = false)
// Manual definition of a logger is just as borring as the above
@Slf4j
class Person {
	// Properties rule!
	String firstName
	String lastName
	Float age
	String city
	String street
	String phone
	Integer index

	static processors = [ new GreetingProcessor(), new XmlCommentingProcessor() ]

	void speak() {
		// Example log usage
		//
		// It is important to understand that if the given log level
		// (in this case it is "debug") is not enabled in the configuration
		// the statement producing the actual log message will not be
		// executed. For more information refer to 
		// http://marxsoftware.blogspot.com/2011/05/easy-groovy-logger-injection-and-log.html
		log.debug "Speaking..."

		// A little Groovy magic: first we take the processors and execute them
		// producing a list of Strings. Then we join those strings with a new line
		// character and print the output to standard input
		println processors
			.collect { processor -> processor.process("${firstName} ${lastName}") }
			.join("\n")
	}
}
