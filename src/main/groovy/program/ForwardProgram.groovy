package program

import robot.Robot

class ForwardProgram implements Program {
	public void executeWith(Robot robot) {
		robot.executeCommand(0x37);
	}
}
