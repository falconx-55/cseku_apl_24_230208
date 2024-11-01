package com.example.tic_toe;

class TicTacToeGame implements GameInterface {
    private String[] board = new String[9];
    private int moveCount = 0;
    private boolean xTurn = true;

    @Override
    public void makeMove(int position) {
        if (board[position] == null) {
            board[position] = xTurn ? "X" : "O";
            xTurn = !xTurn;
            moveCount++;
        }
    }

    @Override
    public String getWinner() {
        String[][] winPatterns = {
                {board[0], board[1], board[2]},
                {board[3], board[4], board[5]},
                {board[6], board[7], board[8]},
                {board[0], board[3], board[6]},
                {board[1], board[4], board[7]},
                {board[2], board[5], board[8]},
                {board[0], board[4], board[8]},
                {board[2], board[4], board[6]}
        };

        for (String[] pattern : winPatterns) {
            if (pattern[0] != null && pattern[0].equals(pattern[1]) && pattern[1].equals(pattern[2])) {
                return pattern[0];
            }
        }
        return null;
    }

    @Override
    public boolean isDraw() {
        return moveCount == 9 && getWinner() == null;
    }

    @Override
    public void reset() {
        board = new String[9];
        moveCount = 0;
        xTurn = true;
    }

    public boolean isXTurn() {
        return xTurn;
    }
}
