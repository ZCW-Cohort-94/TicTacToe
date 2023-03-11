package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */

public class Board {

    private static Character[][] matrix;

    public Board(Character[][] matrix) {
        this.matrix = matrix;


    }

    public Boolean isInFavorOfX() {
        if(diagonalCheck('X') || horizontalCheck('X') || verticalCheck('X')){
            return true;
        }
        return false;
    }

    public Boolean isInFavorOfO() {
        if(diagonalCheck('O') || horizontalCheck('O') || verticalCheck('O')){
            return true;
        }
        else return false;
    }

    public Boolean isTie() {
        if(!isInFavorOfO() && !isInFavorOfX()){
            return true;
        }
        else return false;
    }

    public String getWinner() {
        if(isInFavorOfX() == true){
            return "X";
        } else if(isInFavorOfO() == true){
            return "O";
        }
        else return "";
    }


    public boolean diagonalCheck(char piece){
        if((piece == matrix[0][0] && piece == matrix[1][1] && piece == matrix[2][2])
        || piece == matrix[0][2] && piece == matrix[1][1] && piece == matrix[2][0]){
            return true;
        } else return false;
    }

    public boolean horizontalCheck(char piece){
        if((piece == matrix[0][0] && piece == matrix[0][1] && piece == matrix[0][2])
        || (piece == matrix[1][0] && piece == matrix[1][1] && piece == matrix[1][2])
        || (piece == matrix[2][0] && piece == matrix[2][1] && piece == matrix[2][2])){
            return true;
        }
        else return false;
    }

    public boolean verticalCheck(char piece){
        if((piece == matrix[0][0] && piece == matrix[1][0] && piece == matrix[2][0])
        || (piece == matrix[0][1] && piece == matrix[1][1] && piece == matrix[2][1])
        || (piece == matrix[0][2] && piece == matrix[1][2] && piece == matrix[2][2])){
            return true;
        }
        else return false;
    }
}
