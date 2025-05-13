package com.assignment.tictactoe.tictactoece;

public enum Piece {
    X, O, EMPTY;

    public String toString(){
        switch(this){
            case X: return "X";
            case O: return "O";
            case EMPTY: return " ";
        }
        return "";
    }
}
