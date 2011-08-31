package robot

import robot.Robot

class LoggerRobot extends Robot {
	private StringBuilder log = new StringBuilder();
	
	public LoggerRobot() {}
	
	protected void goForward() {
		log.append("F");
	}
	
	protected void turnLeft() {
		log.append("L");
	}
	
	protected void turnRight() {
		log.append("R");
	}
	
	public String toString() {
		return log.toString();
	}
}
