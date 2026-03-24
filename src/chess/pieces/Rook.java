package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public boolean isThereAnyPossibleMove() {
        // TODO Auto-generated method stub
        return super.isThereAnyPossibleMove();
    }

    @Override
    public boolean possibleMove(Position position) {
        // TODO Auto-generated method stub
        return super.possibleMove(position);
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }

    @Override
    public String toString() {
        return "R";
    }
}
