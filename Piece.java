public class Piece {
    int rank;
    int file;
    boolean color;
    public Piece[][] newBoard() {
        Piece[][] result = new Piece[8][8];
        result[0] = {new Rook(1, 1, true), new Knight(1, 2, true), new Bishop(1, 3, true), new Queen(1, 4, true), new King(1, 5, true), new Bishop(1, 6, true), new Knight(1, 7, true), new Rook(1, 8, true)};
        result[7] = {new Rook(8, 1, false), new Knight(8, 2, false), new Bishop(8, 3, false), new Queen(8, 4, false), new King(8, 5, falsee), new Bishop(8, 6, false), new Knight(8, 7, false), new Rook(8, 8, false)};
        for(int i = 0; i < 8; i++) {
            result[1][i] = new Pawn(2, i+1, true);
            result[6][i] = new Pawn(7, i+1, false);
        }
    }
    
    public Piece(int r, int f, boolean c) {
        rank = r;
        file = f;
        color = c;
    }
}
