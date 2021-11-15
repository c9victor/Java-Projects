import java.io.*;

public class filterSpaces extends FilterInputStream
{
    public filterSpaces(InputStream in) {
        super(in);
    }
    
    public int read() throws IOException {
        int c = in.read();
        while (c == 32) c = in.read();
        
        return c;
    }
}
