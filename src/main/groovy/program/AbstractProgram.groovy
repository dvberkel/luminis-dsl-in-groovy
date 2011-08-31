package program

import robot.Robot
import program.AbstractProgram

abstract class AbstractProgram implements Program {
	private int repeatCount
	
	public AbstractProgram() {
		this(1)
	}
	
	public AbstractProgram(int repeatCount) {
		this.repeatCount = repeatCount
	}
	
	protected final Range repeat() {
		return (1..repeatCount)
	}
	
	public final void executeWith(Robot robot) {
		repeat().each {
			basicExecuteWith(robot);
		}
	}
	
	protected abstract void basicExecuteWith(Robot robot);
}
