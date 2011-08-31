import program.DoProgram

class ProgramBuilder extends BuilderSupport {
	protected void setParent(Object parent, Object child) {}
    
    protected Object createNode(Object name){
    	return new DoProgram()
    }
    
    protected Object createNode(Object name, Object value){}
       	
    protected Object createNode(Object name, Map attributes){}
    
    protected Object createNode(Object name, Map attributes, Object value){}
    
    protected void nodeCompleted(Object parent, Object node) {}

}
