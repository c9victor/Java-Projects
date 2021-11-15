public class Client {
    public static void main(String[] args) {
        Hero hero = new Hero("Bobert");
        
        hero.downPressed();
        hero.downReleased();
        hero.upPressed();
        hero.hitByRoll();
        hero.upReleased();
        hero.upPressed();
        hero.downPressed();
        hero.hitByFire();
        hero.downReleased();
        hero.upReleased();
        //hero.hitByThrow();
        //hero.hitByRoll();
        //hero.hitByFire();
        hero.escPressed();
        hero.escPressed();
        hero.hitByFire();
    }
}
