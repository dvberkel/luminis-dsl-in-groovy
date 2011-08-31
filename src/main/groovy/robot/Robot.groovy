package robot

abstract class Robot {
	public Robot executeCommand(int commandCode) {
		switch(commandCode) {
			case(0x37): goForward(); break;
			case(0x51): turnLeft(); break;
			case(0x88): turnRight(); break;
		}
		return this
	}
	
	protected abstract void goForward();
	
	protected abstract void turnLeft();
	
	protected abstract void turnRight();
}
