public class StandingState implements State {
    Hero hero;
    
    public StandingState(Hero hero) {
        this.hero = hero;
    }
    
    public void upPressed() {
        System.out.println("Up pressed. " + hero.getName() + " is jumping!");
        hero.setState(hero.getJumpingState());
    }

    public void downPressed() {
        System.out.println("Down pressed. " + hero.getName() + " is ducking!");
        hero.setState(hero.getDuckingState());
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
        System.out.println("Error; upRealeased. Still standing.");
    }

    public void downReleased() {
        System.out.println("Error; downRealased. Stil standing.");
    }

    public void timeExpired() {
        System.out.println("Error; timeExpired called while not shielding.");
    }

    public void hitByRoll() {
        System.out.println(hero.getName() + " hit by a rolling object while standing!");
        if (hero.getHealth() > 1)
            hero.setHealth(hero.getHealth() -1);
        else
            hero.setState(hero.getDeadState());
    }

    public void hitByThrow() {
        System.out.println(hero.getName() + " hit by a thrown object while standing!");
        if (hero.getHealth() > 1)
            hero.setHealth(hero.getHealth() -1);
        else
            hero.setState(hero.getDeadState());
    }

    public void hitByFire() {
        System.out.println(hero.getName() + " hit by fire while standing!");
        if (hero.getHealth() > 1)
            hero.setHealth(hero.getHealth() -1);
        else
            hero.setState(hero.getDeadState());
    }
}
