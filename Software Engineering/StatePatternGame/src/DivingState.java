public class DivingState implements State {
    Hero hero;
    
    public DivingState(Hero hero) {
        this.hero = hero;
    }
    
    public void upPressed() {
        System.out.println("Error; upPressed. Still diving.");
    }

    public void downPressed() {
        System.out.println("Error; downPressed. Still diving.");
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
        System.out.println("Up released. " + hero.getName() + " is ducking!");
        hero.setState(hero.getDuckingState());
    }

    public void downReleased() {
        System.out.println("Down released. " + hero.getName() + " is jumping!");
        hero.setState(hero.getJumpingState());
    }

    public void timeExpired() {
        System.out.println("Error; timeExpired called while not shielding.");
    }

    public void hitByRoll() {
        System.out.println(hero.getName() + " is hit mid-dive by a rolled object!");
        if (hero.getHealth() > 1)
            hero.setHealth(hero.getHealth() -1);
        else
            hero.setState(hero.getDeadState());
    }

    public void hitByThrow() {
        System.out.println("Object thrown. Luckily " + hero.getName() + " is diving!");
    }

    public void hitByFire() {
        System.out.println("Fire spewn. Luckily " + hero.getName() + " is diving!");
    }
}
