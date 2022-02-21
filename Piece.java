public class Piece {
    int rank;
    int file;
    boolean color;
    public Piece[][] newBoard() {
        Piece[][] result = new Piece[8][8];
        result[0] = {new Rook(1, 1), new Knight(2, 1), new Bishop(3, 1), new Queen(4, 1), new King(5, 1), new Bishop(6, 1), new Knight(7, 1), new Rook(8, 1)};
        result[7] = {new Rook(1, 8), new Knight(2, 8), new Bishop(3, 8), new Queen(4, 8), new King(5, 8), new Bishop(6, 8), new Knight(7, 8), new Rook(8, 8)};
    }
}
