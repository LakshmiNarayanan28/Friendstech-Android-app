package com.example.friendstech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Courses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void open35(View view) {
        Intent browserIntent35 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.guru99.com"));
        startActivity(browserIntent35);
    }
    public void open36(View view) {
        Intent browserIntent36 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tutorialspoint.com"));
        startActivity(browserIntent36);
    }
    public void open37(View view) {
        Intent browserIntent37 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.javatpoint.com"));
        startActivity(browserIntent37);
    }
    public void open38(View view) {
        Intent browserIntent38 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.com"));
        startActivity(browserIntent38);
    }
    public void open39(View view) {
        Intent browserIntent39 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.freecodecamp.org"));
        startActivity(browserIntent39);
    }
    public void open40(View view) {
        Intent browserIntent40 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.guru99.com/phoptoshop-tutorials.html"));
        startActivity(browserIntent40);
    }
    public void open41(View view) {
        Intent browserIntent41 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.studytonight.com/game-development-in-2D"));
        startActivity(browserIntent41);
    }
    public void open42(View view) {
        Intent browserIntent42 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.youtube.com/playlist?list=PLDz2DuTmsdaG-hcPNJaUO2QBZ1wRDX2T"));
        startActivity(browserIntent42);
    }

}
