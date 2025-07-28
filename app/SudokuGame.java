import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SudokuGame {
    public int [][] board;
    public int [][] solution;
    public boolean [][] initialCells;

    private Random random;

    public SudokuGame() {
        random = new Random();
        board = new int[9][9];
        solution = new int[9][9];
        initialCells = new boolean[9][9];
    }


}
