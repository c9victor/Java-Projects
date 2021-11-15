public class Hottub {
    final int min = 80;
    final int max = 110;
    
	boolean on;
	int temperature;

	public Hottub() {
	}

	public void on() {
	    setTemperature(105);
		on = true;
	}

	public void off() {
		on = false;
	}

	public void bubblesOn() {
		if (on) {
			System.out.println("Hottub is bubbling!");
		}
	}

	public void bubblesOff() {
		if (on) {
			System.out.println("Hottub is not bubbling");
		}
	}

	public void jetsOn() {
		if (on) {
			System.out.println("Hottub jets are on");
		}
	}

	public void jetsOff() {
		if (on) {
			System.out.println("Hottub jets are off");
		}
	}

	public void setTemperature(int temperature) {
	    if (temperature > 79 && temperature < 111)
	        this.temperature = temperature;
	}

    public int getTemperature() {
        return this.temperature;
    }
    
	public void heat() {
		temperature = 105;
		System.out.println("Hottub is heating to a steaming 105 degrees");
	}

	public void cool() {
		temperature = 98;
		System.out.println("Hottub is cooling to 98 degrees");
	}
}
