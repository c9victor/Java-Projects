import java.io.*;

/*
 * Victor C Thompson
 */
public class InputTest
{
    public static void main(String[] args) throws IOException {
        int c;
        InputStream in = null;
        try {
            in =
                new countCharacters(
                    new filterSpaces(
                        new LowerCaseInputStream( 
                            new BufferedInputStream(
                                new FileInputStream("test.txt")))));

            while((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) { in.close(); }
        }
    }
}