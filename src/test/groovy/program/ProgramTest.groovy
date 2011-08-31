package Program

import groovy.util.GroovyTestCase

import program.Program
import program.ForwardProgram
import program.LeftProgram
import robot.Robot
import robot.LoggerRobot

class ProgramTest extends GroovyTestCase {
	Robot robot
	
	public void setUp() {
		robot = new LoggerRobot()
	}

	public void testThatForwardProgramExists() {
		Program program = new ForwardProgram()

		assert program != null
	}
	
	public void testThatForwardProgramExecutesCorrectly() {
		Program program = new ForwardProgram()
		
		program.executeWith(robot)
		
		assert "F" == robot.toString()
	}

	public void testThatLeftProgramExists() {
		Program program = new LeftProgram()

		assert program != null
	}
	
	public void testThatLeftProgramExecutesCorrectly() {
		Program program = new LeftProgram()
		
		program.executeWith(robot)
		
		assert "L" == robot.toString()
	}
}
