public class ChessPieceFactory extends GamePieceFactory {
    public Piece createPiece(String color, String type) {
        Piece piece = null;
        
        if (type.equals("Pawn")) {
            piece = new Pawn(color, type);
        }
        else if (type.equals("Rook")) {
            piece = new Rook(color, type);
        }
        else if (type.equals("Knight")) {
            piece = new Knight(color, type);
        }
        else if (type.equals("Bishop")) {
            piece = new Bishop(color, type);
        }
        else if (type.equals("Queen")) {
            piece = new Queen(color, type);
        }
        else if (type.equals("King")) {
            piece = new King(color, type);
        }
        
        return piece;
    }
}
