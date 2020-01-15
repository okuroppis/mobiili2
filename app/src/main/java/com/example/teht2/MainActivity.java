package com.example.teht2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    private Button button1;
    private Button button2;
    private Button button3;
    private ImageView kuva;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.button1 = findViewById(R.id.button1);
        this.button2 = findViewById(R.id.button2);
        this.button3 = findViewById(R.id.button3);
        this.kuva = findViewById(R.id.image);

        this.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button2.setEnabled(!button2.isEnabled());
                button3.setEnabled(!button3.isEnabled());
            }
        });


        this.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            kuva.setVisibility(View.GONE);
            }
        });

        this.button3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                kuva.setVisibility(View.VISIBLE);
                return false;
            }
        });
    }
}
