package robot

import groovy.util.GroovyTestCase

import robot.LoggerRobot

class LoggerRobotTest extends GroovyTestCase {
	void testThatLoggerRobotExists() {
		assert new LoggerRobot() != null
	}
	
	void testThatNewLoggerRobotHasNotDoneAnythingYet() {
		assert "" == new LoggerRobot().toString()
	}
	
	void testThatExecutingAForwardCommandResultsInAF() {
		assert "F" == new LoggerRobot().executeCommand(0x37).toString()
	}
	
	void testThatExecutingALeftCommandResultsInAL() {
		assert "L" == new LoggerRobot().executeCommand(0x51).toString()
	}
	
	void testThatExecutingARightCommandResultsInAR() {
		assert "R" == new LoggerRobot().executeCommand(0x88).toString()
	}
	
	void testThatMultipleCommandsGetRecordedCorreclty() {
		Robot r = new LoggerRobot()
		
		r.executeCommand(0x37).executeCommand(0x88).executeCommand(0x37)
		
		assert "FRF" == r.toString()
	}
}
