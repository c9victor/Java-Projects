public class Chess
{
    GamePieceFactory factory;
    
    public Chess (GamePieceFactory factory) {
        this.factory = factory;
    }
    
    public void play() {
        Piece piece;
        
        piece = factory.createPiece("White", "Pawn");
        System.out.println(piece.toString());
        
        piece = factory.createPiece("White", "Rook");
        System.out.println(piece.toString());
        
        piece = factory.createPiece("White", "Bishop");
        System.out.println(piece.toString());
        
        piece = factory.createPiece("White", "Knight");
        System.out.println(piece.toString());
        
        piece = factory.createPiece("White", "Queen");
        System.out.println(piece.toString());
        
        piece = factory.createPiece("White", "King");
        System.out.println(piece.toString());
        
        
        piece = factory.createPiece("Black", "Pawn");
        System.out.println(piece.toString());
        
        piece = factory.createPiece("Black", "Rook");
        System.out.println(piece.toString());
        
        piece = factory.createPiece("Black", "Bishop");
        System.out.println(piece.toString());
        
        piece = factory.createPiece("Black", "Knight");
        System.out.println(piece.toString());
        
        piece = factory.createPiece("Black", "Queen");
        System.out.println(piece.toString());
        
        piece = factory.createPiece("Black", "King");
        System.out.println(piece.toString());       
    }
}
