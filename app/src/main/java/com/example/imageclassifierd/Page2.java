package com.example.imageclassifierd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page2 extends AppCompatActivity {
    Button backButton, openWebsite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        backButton = findViewById(R.id.button4);
        openWebsite = findViewById(R.id.button3);


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Main = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(Main);
            }
        });

        openWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1z5pzYaGalvjoD6VtfqweQxghGqJ6Lzhg/view?fbclid=IwAR1xl5jsPE1vuNlrO3Fx77xxwLnsEFUFZ1x-l3mOb2aSMI-oyGXvfgEiDHc"));
                startActivity(browserIntent);
            }
        });
    }
}