package com.example.friendstech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Arts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arts);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void open16(View view) {
        Intent browserIntent16 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3newspapers.com/india"));
        startActivity(browserIntent16);
    }

    public void open17(View view) {
        Intent browserIntent17 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paisabazaar.com/tax/gst-rates/amp"));
        startActivity(browserIntent17);
    }

    public void open18(View view) {
        Intent browserIntent18 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.raghu.braingame"));
        startActivity(browserIntent18);
    }

    public void open19(View view) {
        Intent browserIntent19 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/amp/s/m.wikihow.com/Make-a-Resume%3famp=1"));
        startActivity(browserIntent19);
    }
}
