public class ShieldedState implements State {
    Hero hero;
    
    public ShieldedState(Hero hero) {
        this.hero = hero;
    }
    
    public void upPressed() {
        System.out.println("Error; upPressed. Still shielding.");
    }

    public void downPressed() {
        System.out.println("Error; downPressed. Still shielding.");
    }

    public void escPressed() {
        System.out.println("Error; escPressed. Already shielding!");
    }
    
    public void upReleased() {
        System.out.println("Error; upReleased. Still shielding.");
    }

    public void downReleased() {
        System.out.println("Error; downReleased. Still shielding.");
    }

    public void timeExpired() {
        System.out.println("Shield Expired! Hero Now Standing");
        hero.setState(hero.getStandingState());
    }

    public void hitByRoll() {
        System.out.println("Boulder blocked by shields!");
    }

    public void hitByThrow() {
        System.out.println("Javelion blocked by shields!");

    }

    public void hitByFire() {
        System.out.println("Fire blocked by shields!");

    }
}
