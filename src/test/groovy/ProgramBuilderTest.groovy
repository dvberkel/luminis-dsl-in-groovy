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
	
	public void testThatAForwardProgramCanBeDescribed() {
		Program program = builder.do() {
			builder.forward()
		}
		
		program.executeWith(robot)
		
		assert "F" == robot.toString()
	}
	
	public void testThatMultipleLeftProgramCanBeDescribed() {
		Program program = builder.do() {
			builder.left(2)
		}
		
		program.executeWith(robot)
		
		assert "LL" == robot.toString()
	}
	
	public void testThatChainedProgramsCanBeDescribed() {
		Program program = builder.do(4) {
			builder.forward(2)
			builder.left()
		}
		
		program.executeWith(robot)
		
		assert "FFLFFLFFLFFL" == robot.toString()
	}
	
	public void testThatNestedProgramsCanBeDescribed() {
		Program program = builder.do(4) {
			builder.do(2) {
				builder.forward()
				builder.left()
			}
			builder.forward()
			builder.right()
		}
		
		program.executeWith(robot)
		
		assert "FLFLFRFLFLFRFLFLFRFLFLFR" == robot.toString()
	}
}
