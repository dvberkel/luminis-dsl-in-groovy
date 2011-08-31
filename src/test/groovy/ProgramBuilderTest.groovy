import groovy.util.GroovyTestCase

import program.Program
import robot.Robot
import robot.LoggerRobot

class ProgramBuilderTest extends GroovyTestCase {
	private ProgramBuilder builder
	private Robot robot
	
	public void setUp() {
		builder = new ProgramBuilder()
		robot = new LoggerRobot()
	}
	
	public void testThatProgramBuilderExists() {
		assert new ProgramBuilder() != null;
	}
	
	public void testThatProgramBuilderCanBuildAProgram() {
		Program program = builder.do()
		
		assert program != null
	}
	
	public void testThatAnEmptyProgramDoesNothingWithARobot() {
		Program program = builder.do()
		
		program.executeWith(robot)
		
		assert "" == robot.toString()
	}
}
