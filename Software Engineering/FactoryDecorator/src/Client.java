/*
 * Victor C Thompson
 */

public class Client
{
    public static void main(String[] args) {
        GamePieceFactory factory = new ChessPieceFactory();
        Chess chess = new Chess(factory);
        
        chess.play();
        
        factory = new CheckerPieceFactory();
        Checker checker = new Checker(factory);
        
        checker.play();
    }
}
