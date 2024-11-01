package com.example.tic_toe;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

class GameUI {
    private Button[] buttons;
    private Context context;

    public GameUI(Context context, Button[] buttons) {
        this.context = context;
        this.buttons = buttons;
    }

    public void updateButton(int position, String symbol) {
        buttons[position].setText(symbol);
    }

    public void showWinner(String winner) {
        Toast.makeText(context, "Winner: " + winner, Toast.LENGTH_SHORT).show();
    }

    public void showDraw() {
        Toast.makeText(context, "Game is draw!!!", Toast.LENGTH_SHORT).show();
    }

    public void resetButtons() {
        for (Button button : buttons) {
            button.setText("");
        }
    }
}
