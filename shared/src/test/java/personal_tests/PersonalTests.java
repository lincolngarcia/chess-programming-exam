package personal_tests;

import chess.ChessBoard;
import chess.ChessGame;
import chess.ChessPiece;
import chess.ChessPieceTypes.Pawn;
import chess.ChessPosition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import passoff.chess.EqualsTestingUtility;
import passoff.chess.TestUtilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PersonalTests {
    @Test
    @DisplayName("Test Board Creation")
    public void constructChessBoard() {
        ChessBoard board = new ChessBoard();

        System.out.println(board);
    }

    @Test
    @DisplayName("Test Board Reset")
    public void resetBoard() {
        ChessBoard board = new ChessBoard();
        board.resetBoard();
        System.out.println(board);
    }

    @Test
    @DisplayName("Pawn A2 Test")
    public void pawnTest() {
        ChessBoard board = new ChessBoard();
        ChessPosition pos = new ChessPosition(2, 1);
        ChessPiece piece = new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.PAWN);
        board.addPiece(pos, piece);

        System.out.println(piece.pieceMoves(board, pos));

    }


}
