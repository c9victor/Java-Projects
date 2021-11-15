
public class DisplayLog implements Command
{
    private RemoteControl rc;
    
    public DisplayLog(RemoteControl rc) {
        this.rc = rc;
    }
    public void execute() {
        for (Command c: rc.commandLog) {
            System.out.println(c.display());
        }
    }
    public void undo() {}
}
