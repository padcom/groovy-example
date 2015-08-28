package org.example

import java.util.Properties
import org.apache.log4j.PropertyConfigurator

/**
 * Main application entry point
 */
class Program {
	static void main(String[] args) {
		// Log4j initialization
		def config = new Properties()
		config.load(Program.classLoader.getResourceAsStream("log4j.properties"))
		PropertyConfigurator.configure(config)

		// main application
		def person = new Person(firstName: "John", lastName: "Doe", age: 32, city: "New York", street: "7th Avenue", phone: "55532656", index: 1)
		println person
		person.speak()
	}
}
