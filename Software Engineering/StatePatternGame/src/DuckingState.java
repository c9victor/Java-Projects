public class DuckingState implements State {
    Hero hero;
    
    public DuckingState(Hero hero) {
        this.hero = hero;
    }
    
    public void upPressed() {
        System.out.println("Up pressed. " + hero.getName() + " is diving!");
        hero.setState(hero.getDivingState());
    }

    public void downPressed() {
        System.out.println("Error; downPressed. Still ducking.");
    }

    public void escPressed() {
        if (hero.getNumCreds() > 0) {
            System.out.println("Escape pressed. " + hero.getName() + " is shielding!");
            hero.setState(hero.getShieldedState());
            hero.setNumCreds(hero.getNumCreds() - 1);
            GameThread g1 = new GameThread(3, "T1", hero);
            Thread t1 = new Thread(g1);
            t1.start();
        }
    }
    
    public void upReleased() {
        System.out.println("Error; upReleased. Still ducking.");
    }

    public void downReleased() {
        System.out.println("Down released. " + hero.getName() + " is standing!");
        hero.setState(hero.getStandingState());
    }

    public void timeExpired() {
        System.out.println("Error; timeExpired called while not shielding.");
    }

    public void hitByRoll() {
        System.out.println(hero.getName() + " hit by a rolling object while ducking!");
        if (hero.getHealth() > 1)
            hero.setHealth(hero.getHealth() -1);
        else
            hero.setState(hero.getDeadState());
    }

    public void hitByThrow() {
        System.out.println(hero.getName() + " escapes a javelin by ducking!");
    }

    public void hitByFire() {
        System.out.println(hero.getName() + " hit by fire while ducking!");
        if (hero.getHealth() > 1)
            hero.setHealth(hero.getHealth() -1);
        else
            hero.setState(hero.getDeadState());
    }
}
