import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {


    @Test
    public void testBoardInitialization() {
        Board board = new Board(7, 7);
        board.makeMove(1, 0,0,0, Cell.Black);
        board.makeMove(6, 5,6,6, Cell.Black);
        board.makeMove(6, 1,6, 0, Cell.White);
        board.makeMove(1, 6, 0, 6, Cell.White);
        assertEquals(Cell.Empty, board.getCell(3, 3));
        assertEquals(Cell.Black, board.getCell(0, 0));
        assertEquals(Cell.White, board.getCell(6, 0));
    }
    @Test
    public void testMakingRegularMove() {
        Board board = new Board(7, 7);
        board.makeMove(0, 0, 0, 1, Cell.Black);
        assertEquals(Cell.Black, board.getCell(0, 1));
        assertEquals(Cell.Black, board.getCell(0, 0));
    }
}
