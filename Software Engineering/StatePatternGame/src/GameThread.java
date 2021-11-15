import java.util.concurrent.TimeUnit;

public class GameThread implements Runnable {
    Hero hero;
    int sleep;
    String threadName;
    
    public GameThread (int sleep, String threadName, Hero hero) {
        this.sleep = sleep;
        this.threadName = threadName;
        this.hero = hero;
    }
    
    public void run() {
        while (true) {
            try {
                TimeUnit.SECONDS.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            hero.timeExpired();
            break;
        }
    }
}