public class Board {
    private Cell[][] board;

    public Board(int rows, int cols) {
        this.board = new Cell[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = Cell.Empty;
            }
        }
        board[0][0] = Cell.Black;
        board[6][6] = Cell.Black;
        board[0][6] = Cell.White;
        board[6][0] = Cell.White;

    }
    public void makeMove(int startRow, int startCol, int destRow, int destCol, Cell cell) {
        if (board[startRow][startCol] != cell) {
            return;
        }
        if (board[destRow][destCol] != Cell.Empty) {
            return;
        }
        int rowDiff = destRow - startRow;
        int colDiff = destCol - startCol;
        if (rowDiff <= 1 && colDiff <= 1) {
            board[destRow][destCol] = cell;
        }
    }
    public Cell getCell(int row, int col) {
        return board[row][col];
    }

}
