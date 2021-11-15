public abstract class Piece {
    protected String type;
    protected String color;
    
    public String toString() {
        char c = color.charAt(0);
        char t;
        if(!type.equals(""))
            t = type.charAt(0);
        else
            return Character.toString(c);
        
        return Character.toString(c) + Character.toString(t);
    }
}
