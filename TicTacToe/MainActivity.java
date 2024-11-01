package com.example.tic_toe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private GameInterface game;
    private GameUI gameUI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button[] buttons = new Button[9];
        buttons[0] = findViewById(R.id.btn1);
        buttons[1] = findViewById(R.id.btn2);
        buttons[2] = findViewById(R.id.btn3);
        buttons[3] = findViewById(R.id.btn4);
        buttons[4] = findViewById(R.id.btn5);
        buttons[5] = findViewById(R.id.btn6);
        buttons[6] = findViewById(R.id.btn7);
        buttons[7] = findViewById(R.id.btn8);
        buttons[8] = findViewById(R.id.btn9);

        game = new TicTacToeGame();
        gameUI = new GameUI(this, buttons);

        // Set onClick listeners for each button
        for (int i = 0; i < buttons.length; i++) {
            final int position = i;
            buttons[i].setOnClickListener(v -> onButtonClick(position));
        }
    }

    private void onButtonClick(int position) {
        game.makeMove(position);
        gameUI.updateButton(position, ((TicTacToeGame) game).isXTurn() ? "O" : "X");

        String winner = game.getWinner();
        if (winner != null) {
            gameUI.showWinner(winner);
            resetGame();
        } else if (game.isDraw()) {
            gameUI.showDraw();
            resetGame();
        }
    }

    private void resetGame() {
        game.reset();
        gameUI.resetButtons();
    }
}
