public class DeadState implements State {
    Hero hero;
    
    public DeadState(Hero hero) {
        this.hero = hero;
    }
    
    public void upPressed() {
        System.out.println(hero.getName() + " is dead :(");
    }

    public void downPressed() {
        System.out.println(hero.getName() + " is dead :(");
    }

    public void escPressed() {
        System.out.println(hero.getName() + " is dead :(");
    }
    
    public void upReleased() {
        System.out.println(hero.getName() + " is dead :(");
    }

    public void downReleased() {
        System.out.println(hero.getName() + " is dead :(");
    }

    public void timeExpired() {
        System.out.println(hero.getName() + " is dead :(");
    }

    public void hitByRoll() {
        System.out.println(hero.getName() + " is dead :(");
    }

    public void hitByThrow() {
        System.out.println(hero.getName() + " is dead :(");
    }

    public void hitByFire() {
        System.out.println(hero.getName() + " is dead :(");
    }
}
