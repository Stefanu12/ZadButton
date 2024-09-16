package com.button.zadbutton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int disableCount = 0; // Zmienna do przechowywania Counter

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Znajdowanie id
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        TextView counterText = findViewById(R.id.counterText);

        // Przycisk do liczenia
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button1.setEnabled(false);
                disableCount++; // Zwiększenie Counter
                counterText.setText("Counter: " + disableCount); // Aktualizacja tekstu
            }
        });

        // Przycisk włączający
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button1.setEnabled(true);
            }
        });
    }
}
