package org.ndx.agile.architecture.sequence.generator;

public interface SequenceGenerator {

	/**
	 * When set, the container having this property will have all its components code elements
	 * scanned and sequence diagrams built for them.
	 * This property also defines which other model elements should be scanned during source code reading.
	 * Associated value should be a ";" separated list of canonical names of containers to also scan
	 */
	String GENERATES_WITH = "agile.architecture.sequence.generator.with";

}
