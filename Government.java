package com.example.friendstech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Government extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_government);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void open20(View view) {
        Intent browserIntent20 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tnpscportal.in/p/tnpsc-online.html?m=1"));
        startActivity(browserIntent20);
    }
    public void open21(View view) {
        Intent browserIntent21 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://tnpsc.news/tnpsc-study-materials"));
        startActivity(browserIntent21);
    }
    public void open22(View view) {
        Intent browserIntent22 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cracku.in/free-mock-tests"));
        startActivity(browserIntent22);
    }
    public void open23(View view) {
        Intent browserIntent23 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://tnpsc.wordpress.com/downloads"));
        startActivity(browserIntent23);
    }
    public void open24(View view) {
        Intent browserIntent24 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://tamilcube.com/career/tnpsc/general-knowledge-tamil"));
        startActivity(browserIntent24);
    }
    public void open25(View view) {
        Intent browserIntent25 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tnpscrock.in/exam/tnpsc-group-1-2-4-vao-exam-online-test.html"));
        startActivity(browserIntent25);
    }
    public void open26(View view) {
        Intent browserIntent26 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tnpscguru.in/p/free-online-tests.html?m=1"));
        startActivity(browserIntent26);
    }
    public void open27(View view) {
        Intent browserIntent27 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://exam2win.com/online-tests/TNPSC-BANK-RRB-EXAM-question-papers.jsp"));
        startActivity(browserIntent27);
    }
    public void open28(View view) {
        Intent browserIntent28 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://recruitmentresult.com/online-quiz"));
        startActivity(browserIntent28);
    }
}
