import groovy.util.GroovyTestCase

class ProgramBuilderTest extends GroovyTestCase {
	public void testThatProgramBuilderExists() {
		assert new ProgramBuilder() != null;
	}
	
	public void testThatProgramBuilderCanBuildAProgram() {
		Program program = new ProgramBuilder().program()
		
		assert program != null
	}
}
