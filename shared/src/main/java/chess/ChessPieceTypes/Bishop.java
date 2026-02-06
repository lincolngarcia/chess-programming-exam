package chess.ChessPieceTypes;

import chess.ChessDirection;

public class Bishop extends ChessPieceType {
    @Override
    void setMovementDirections() {
        this.movementDirections = new ChessDirection[]{
                ChessDirection.LEFT_UP,
                ChessDirection.RIGHT_UP,
                ChessDirection.LEFT_DOWN,
                ChessDirection.RIGHT_DOWN
        };
    }

    @Override
    void setMovementDistance() {
        this.movementDistance = 7;
    }
}