package org.example;

/**
 * A processor that greets the input
 */
public class GreetingProcessor implements Processor {
	@Override
	public String process(String input) {
		return "Hello " + input + "!";
	}
}
