package com.example.tic_toe;

interface GameInterface {
    void makeMove(int position);
    String getWinner();
    boolean isDraw();
    void reset();
}
