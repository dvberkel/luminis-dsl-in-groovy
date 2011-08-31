package program

import robot.Robot

class RightProgram implements Program {
	public void executeWith(Robot robot) {
		robot.executeCommand(0x88);
	}
}
