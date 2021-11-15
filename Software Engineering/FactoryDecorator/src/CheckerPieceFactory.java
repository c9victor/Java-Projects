public class CheckerPieceFactory extends GamePieceFactory
{
    public Piece createPiece(String color, String type) {
        Piece piece = null;
        
        piece = new CheckerPiece(color, type);
        
        return piece;
    }
}
