package program

import robot.Robot
import program.AbstractProgram

class RightProgram extends AbstractProgram implements Program {
	public RightProgram() {
		this(1)
	}
	
	public RightProgram(int repeatCount) {
		super(repeatCount)
	}
	
	protected final void basicExecuteWith(Robot robot) {
		robot.executeCommand(0x88);
	}
}
