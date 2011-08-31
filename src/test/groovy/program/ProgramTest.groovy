package Program

import groovy.util.GroovyTestCase
import program.Program
import program.ForwardProgram

class ProgramTest extends GroovyTestCase {
	public void testThatForwardProgramExists() {
		assert new ForwardProgram() != null;
	}
}
