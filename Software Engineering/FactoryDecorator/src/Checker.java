public class Checker
{
GamePieceFactory factory;
    
    public Checker (GamePieceFactory factory) {
        this.factory = factory;
    }
    
    public void play() {
        Piece piece;
        
        piece = factory.createPiece("Red", "");
        System.out.println(piece.toString());
        
        piece = factory.createPiece("Black", "");
        System.out.println(piece.toString());
    }
}
