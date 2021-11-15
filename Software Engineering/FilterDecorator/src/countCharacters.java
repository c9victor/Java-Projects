import java.io.*;

public class countCharacters extends FilterInputStream
{
    private int count = 0;
    
    public countCharacters(InputStream in) {
        super(in);
    }
    
    
    public int read() throws IOException {
        int c = in.read();
        
        if (c != -1) {
            count++;
        }
        
        return c;
    }
    
    public void close() {
        System.out.println("\nTotal Characters Read: " + count);
    }
}
