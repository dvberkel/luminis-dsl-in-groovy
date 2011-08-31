package program

import robot.Robot

class LeftProgram implements Program {
	public void executeWith(Robot robot) {
		robot.executeCommand(0x51);
	}
}
