public interface Command {
	public void execute();
	public void undo();
	public default String display() {
	    return this.getClass().getName();
	}
}
