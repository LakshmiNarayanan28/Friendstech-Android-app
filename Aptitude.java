package com.example.friendstech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Aptitude extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aptitude);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void open9(View view) {
        Intent browserIntent9 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://placement.freshersworld.com/aptitude-questions-and-answers"));
        startActivity(browserIntent9);
    }

    public void open10(View view) {
        Intent browserIntent10 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gyanbox.in/rs-aggarwal-quantitative-aptitude"));
        startActivity(browserIntent10);
    }

    public void open11(View view) {
        Intent browserIntent11 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gyanbox.in/rs-aggarwal-verbal-and-non-verbal-reasoning"));
        startActivity(browserIntent11);
    }

    public void open12(View view) {
        Intent browserIntent12 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.pdfdrive.com/cracking-the-coding-interview-books.html"));
        startActivity(browserIntent12);
    }

    public void open13(View view) {
        Intent browserIntent13 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.docdroid.net/ZPfHmS5/data-structures-and-algorithms-narasimha-karumanchi.pdf"));
        startActivity(browserIntent13);
    }

    public void open14(View view) {
        Intent browserIntent14 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.careerbless.com/aptitude/qa/home.php"));
        startActivity(browserIntent14);
    }

    public void open15(View view) {
        Intent browserIntent15 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bit.ly/2DkbLOU"));
        startActivity(browserIntent15);
    }


}
