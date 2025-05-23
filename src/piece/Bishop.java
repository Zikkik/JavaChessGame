package piece;

import main.Type;

public class Bishop extends Piece {
    public Bishop(boolean color, int col, int row) {
        super(color, col, row);

        type = Type.BISHOP;

        if (color)
            image = getImage("/piece/bishop-white");
        else
            image = getImage("/piece/bishop-black");
    }

    public boolean canMove(int targetCol, int targetRow) {
        if(isWithinBoard(targetCol, targetRow) && !isSameSquare(targetCol, targetRow)){
            if(Math.abs(targetCol - preCol) == Math.abs(targetRow - preRow)){
                if(isValidSquare(targetCol, targetRow) && !pieceIsOnDiagonalLine(targetCol, targetRow))
                    return true;
            }
        }
        return false;
    }
}