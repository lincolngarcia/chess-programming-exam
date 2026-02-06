package chess.ChessPieceTypes;

import chess.ChessDirection;

public class Knight extends ChessPieceType {
    @Override
    void setMovementDirections() {
        this.movementDirections = new ChessDirection[] {
                ChessDirection.UP_LEFT_JUMP,
                ChessDirection.UP_RIGHT_JUMP,
                ChessDirection.LEFT_UP_JUMP,
                ChessDirection.RIGHT_UP_JUMP,
                ChessDirection.LEFT_DOWN_JUMP,
                ChessDirection.RIGHT_DOWN_JUMP,
                ChessDirection.DOWN_LEFT_JUMP,
                ChessDirection.DOWN_RIGHT_JUMP
        };
    }

    @Override
    void setMovementDistance() {
        this.movementDistance = 1;
    }
}