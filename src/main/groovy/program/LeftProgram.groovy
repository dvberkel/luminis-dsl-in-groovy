package program

import robot.Robot
import program.AbstractProgram

class LeftProgram extends AbstractProgram implements Program {
	public LeftProgram() {
		this(1)
	}
	
	public LeftProgram(int repeatCount) {
		super(repeatCount)
	}
	
	protected final void basicExecuteWith(Robot robot) {
		robot.executeCommand(0x51);
	}
}
