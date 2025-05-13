package com.assignment.tictactoe.tictactoece;

public interface Board {

    void initializeBoard();

    boolean isLegalMove(int row, int col);

    void updateMove(int row, int col, Piece piece);

    Winner checkWinner();

    boolean isFull();

}
