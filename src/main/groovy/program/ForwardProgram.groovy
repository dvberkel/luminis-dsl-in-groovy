package program

import robot.Robot

class ForwardProgram implements Program {
	private int repeatCount
	
	public ForwardProgram() {
		this(1)
	}
	
	public ForwardProgram(int repeatCount) {
		this.repeatCount = repeatCount
	}
	
	protected Range repeat() {
		return (1..repeatCount)
	}
	
	public void executeWith(Robot robot) {
		repeat().each {
			basicExecuteWith(robot);
		}
	}
	
	protected final basicExecuteWith(Robot robot) {
		robot.executeCommand(0x37);
	}
}
