package com.example.android;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity  extends AppCompatActivity {

    TextView textView;
    Button button1;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        button1.setOnClickListener(v -> {
            textView.setText("Sveiki, Android!");
        });

        button2.setOnClickListener(v -> {
            textView.setTextColor(android.graphics.Color.RED);
        });

        button3.setOnClickListener(v -> {
            textView.setBackgroundColor(android.graphics.Color.YELLOW);
        });

        //Comment for revert

    }
}