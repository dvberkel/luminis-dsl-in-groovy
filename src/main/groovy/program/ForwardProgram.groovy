package program

import robot.Robot
import program.AbstractProgram

class ForwardProgram extends AbstractProgram implements Program {
	public ForwardProgram() {
		this(1)
	}
	
	public ForwardProgram(int repeatCount) {
		super(repeatCount)
	}
		
	protected final void basicExecuteWith(Robot robot) {
		robot.executeCommand(0x37);
	}
}
