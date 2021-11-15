
public class HottubIncrementCommand implements Command
{
    Hottub hottub;
    
    public HottubIncrementCommand(Hottub hottub) {
        this.hottub = hottub;
    }
    
    public void execute() {
        if (hottub.on) {
            if (hottub.getTemperature() > hottub.min && hottub.getTemperature() < hottub.max - 1) {
                hottub.setTemperature(hottub.getTemperature() + 1);
                System.out.println("Temperature increased by 1");
                System.out.println("Temperature: " + hottub.getTemperature());
            }
        }
    }
    
    public void undo() {
        if (hottub.on) {
            if (hottub.getTemperature() > hottub.min + 1 && hottub.getTemperature() < hottub.max) {
                hottub.setTemperature(hottub.getTemperature() - 1);
                System.out.println("Temperature decreased by 1");
                System.out.println("Temperature: " + hottub.getTemperature());
            }
        }
    }
}
