public class JumpingState implements State {
    Hero hero;
    
    public JumpingState(Hero hero) {
        this.hero = hero;
    }
    
    public void upPressed() {
        System.out.println("Error; upPressed. Still jumping.");
    }

    public void downPressed() {
        System.out.println("Down pressed. " + hero.getName() + " is diving!");
        hero.setState(hero.getDivingState());
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
        System.out.println("Up released. " + hero.getName() + " is standing!");
        hero.setState(hero.getStandingState());
    }

    public void downReleased() {
        System.out.println("Error; downReleased. Still jumping.");
    }

    public void timeExpired() {
        System.out.println("Error; timeExpired called while not shielding.");
    }

    public void hitByRoll() {
        System.out.println(hero.getName() + " escaped a boulder by jumping!");
    }

    public void hitByThrow() {
        System.out.println(hero.getName() + " hit by a thrown object while jumping!");
        if (hero.getHealth() > 1)
            hero.setHealth(hero.getHealth() -1);
        else
            hero.setState(hero.getDeadState());
    }

    public void hitByFire() {
        System.out.println(hero.getName() + " hit by fire while jumping!");
        if (hero.getHealth() > 1)
            hero.setHealth(hero.getHealth() -1);
        else
            hero.setState(hero.getDeadState());
    }
}
