package chess;

import java.util.Objects;

/**
 * Represents a single square position on a chess board
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessPosition {
    private final String[] rowLabels = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int Row;
    int Column;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChessPosition that = (ChessPosition) o;
        return Row == that.Row && Column == that.Column;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Row, Column);
    }

    @Override
    public String toString() {
        return this.rowLabels[this.Column - 1] + this.Row;
    }

    public ChessPosition(int index) {
        if (index < 0) return;
        this.Row = Math.floorDiv(index, 8) + 1;
        this.Column = (index % 8) + 1;
    }

    public ChessPosition(int row, int col) {
        this.Row = row;
        this.Column = col;
    }

    /**
     * @return which row this position is in
     * 1 codes for the bottom row
     */
    public int getRow() {
        return this.Row;
    }

    /**
     * @return which column this position is in
     * 1 codes for the left row
     */
    public int getColumn() {
        return this.Column;
    }

    /**
     * @return indices representing the current position
     */
    public int[] getIndices() {
        return new int[] {
                this.Row - 1,
                this.Column - 1
        };
    }

    /**
     * @return index for which the position represents
     */
    public int getBitboardIndex() {
        int[] indices = this.getIndices();
        return (indices[0] * 8) + indices[1];
    }
}
