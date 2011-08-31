package program

import robot.Robot
import program.AbstractProgram

class DoProgram extends AbstractProgram implements Program {
	List<Program> programs = []
	
	public DoProgram() {
		this(1)
	}
	
	public DoProgram(int repeatCount) {
		super(repeatCount)
	}
	
	public final void add(Program program) {
		programs << program
	}
	
	protected final void basicExecuteWith(Robot robot) {
		programs.each { program ->
			program.executeWith(robot)
		}
	}
}
