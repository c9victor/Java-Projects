public class HottubOffCommand implements Command {
	Hottub hottub;
	int prevTemp;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
	    prevTemp = hottub.getTemperature();
		hottub.cool();
		hottub.off();
	}
	
	public void undo() {
	    hottub.on();
	    hottub.setTemperature(prevTemp);
	}
}
