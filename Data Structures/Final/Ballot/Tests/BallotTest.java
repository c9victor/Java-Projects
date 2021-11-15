import java.util.Random;
import java.io.*;

public class BallotTest {
    private static String name[];
    private static String cand[];

    public static void main(String[] args) {
        name = new String[100];
        cand = new String[100];
        Random rand = new Random();
        rand.setSeed(40);
        
        for (int i = 0; i < name.length; i++) { 
            char n = (char)(rand.nextInt(57) + 65);
            if (rand.nextInt() % 2 == 0)
                cand[i] = "A";
            else
                cand[i] = "B";
            name[i] = Character.toString(n);
        }
        
        try {
            FileWriter test = new FileWriter("test.in");
            test.write("100\n");
            for (int i = 0; i < name.length; i++) {
                test.write(name[i] + "\n");
                test.write(cand[i] + "\n");
            }
            test.close();
        } catch (Exception e) {}
    }
}
