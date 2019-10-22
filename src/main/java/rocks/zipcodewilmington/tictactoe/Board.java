package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    private Character[][] board;

    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    public Boolean isInFavorOfX() {
        if (testCols('X') || testRows ('X') || testDiagonals('X')) {
            return true;
        }
        return false;
    }

    public Boolean testCols(Character player) {
        for (int i = 0; i < 3; i++) {
            if (this.board[i][0] == player && this.board[i][1] == player && this.board[i][2] == player) {
                return true;
            }
        }

        return false;
    }

    public Boolean testRows(Character player) {
        for (int i = 0; i < 3; i++) {
            if (this.board[0][i] == player && this.board[1][i] == player && this.board[2][i] == player) {
                return true;
            }
        }

        return false;
    }

    public Boolean testDiagonals(Character player) {

        if ((this.board[0][0] == player && this.board[1][1] == player && this.board[2][2] == player) || (this.board[0][2] == player && this.board[1][1] == player && this.board[2][0] == player)) {
            return true;
        }

        return false;
    }

    public Boolean isInFavorOfO() {
        if (testCols('O') || testRows ('O') || testDiagonals('O')) {
            return true;
        }
        return false;
    }

    public Boolean isTie() {
        if (!isInFavorOfX() && ! isInFavorOfO()) {
            return true;
        }
        return false;
    }

    public String getWinner() {
        if (isInFavorOfO()) {
            return "O";
        } else if (isInFavorOfX()) {
            return "X";
        } else {
            return "";
        }
    }

}
