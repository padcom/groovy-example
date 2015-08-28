package org.example

/**
 * A @Processor that wraps the input in XML comment
 */
class XmlCommentingProcessor implements Processor {
	@Override
	String process(String input) {
		"<!-- ${input} -->"
	}
}
