package com.assignment.tictactoe.tictactoece;

public abstract class Player {
    protected BoardImpl board;

    public Player(BoardImpl board, Piece piece) {
        this.board = board;
    }

    public abstract void move(int row, int col);


}