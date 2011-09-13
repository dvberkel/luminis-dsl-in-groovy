import program.Program
import program.DoProgram
import program.ForwardProgram
import program.LeftProgram
import program.RightProgram

class ProgramBuilder extends BuilderSupport {
	private List<String> atomicProgramNames = ['forward', 'left', 'right']
	
	protected void setParent(Object parent, Object child) {
		parent.add(child)
	}
    
    protected Object createNode(Object name) {
    	createNode(name, 1)
    }
    
    protected Object createNode(Object name, Object value) {
    	if (isAtomic(name)) {
    		return createAtomicProgram(name, value)
    	}
    	return new DoProgram(value)
    }
    
    private boolean isAtomic(String name) {
    	return atomicProgramNames.contains(name)
    }
    
    private Program createAtomicProgram(name, repeatCount) {
    	switch(name) {
    		case 'forward' : return new ForwardProgram(repeatCount)
    		case 'left'    : return new LeftProgram(repeatCount)
    		case 'right'   : return new RightProgram(repeatCount)
    	}
    }
       	
    protected Object createNode(Object name, Map attributes) {
    	createNode(name)
    }
    
    protected Object createNode(Object name, Map attributes, Object value) {
    	createNode(name, value)
    }
}
