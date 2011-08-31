package Program

import groovy.util.GroovyTestCase

import program.Program
import program.ForwardProgram
import program.LeftProgram
import program.RightProgram
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

	public void testThatRightProgramExists() {
		Program program = new RightProgram()

		assert program != null
	}
	
	public void testThatRightProgramExecutesCorrectly() {
		Program program = new RightProgram()
		
		program.executeWith(robot)
		
		assert "R" == robot.toString()
	}
	
	public void testThatForwardProgramCanBeConstructedWithAMultiplier() {
		Program program = new ForwardProgram(3)
		
		program.executeWith(robot)
		
		assert "FFF" == robot.toString()
	}
	
	public void testThatLeftProgramCanBeConstructedWithAMultiplier() {
		Program program = new LeftProgram(2)
		
		program.executeWith(robot)
		
		assert "LL" == robot.toString()
	}
	
	public void testThatRightProgramCanBeConstructedWithAMultiplier() {
		Program program = new RightProgram(2)
		
		program.executeWith(robot)
		
		assert "RR" == robot.toString()
	}

}
