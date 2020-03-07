package com.example.samplestickerapp;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Window;
import android.widget.Button;

public class DialogClass extends Dialog {

    Button yesButton, noButton;

    public DialogClass(Context context) {
        // Adding your custom theme to it
        super(context, R.style.AppTheme);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Removing its original title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        // Getting reference to its window object
        Window window = getWindow();

        // Where in the screen your dialog pops up
        if (window != null) {
            window.setGravity(Gravity.CENTER);
        }
        // Setting its content view
        setContentView(R.layout.dialog_layout);

        yesButton = findViewById(R.id.yesButton);
        noButton = findViewById(R.id.noButton);

        show();

    }
}
