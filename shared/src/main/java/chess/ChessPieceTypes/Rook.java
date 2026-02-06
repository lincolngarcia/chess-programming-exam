package chess.ChessPieceTypes;

import chess.ChessDirection;

public class Rook extends ChessPieceType{
    @Override
    void setMovementDirections() {
        this.movementDirections = new ChessDirection[]{
                ChessDirection.UP,
                ChessDirection.LEFT,
                ChessDirection.RIGHT,
                ChessDirection.DOWN,
        };
    }

    @Override
    void setMovementDistance() {
        this.movementDistance = 7;
    }
}