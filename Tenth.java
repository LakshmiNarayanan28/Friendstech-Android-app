package com.example.friendstech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Tenth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void open29(View view) {
        Intent browserIntent29 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nammakalvi.org/10th-sslc-new-syllabus-study-materials-and-guides-download.html"));
        startActivity(browserIntent29);
    }
    public void open30(View view) {
        Intent browserIntent30 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nammakalvi.org/11th-study-materials.html"));
        startActivity(browserIntent30);
    }
    public void open31(View view) {
        Intent browserIntent31 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nammakalvi.org/12th-plus-two-new-syllabus-study-material-and-guides-download.html"));
        startActivity(browserIntent31);
    }
    public void open32(View view) {
        Intent browserIntent32 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.padasalai.net/2019/06/whatsapp.html"));
        startActivity(browserIntent32);
    }
    public void open33(View view) {
        Intent browserIntent33 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://dge1.tn.nic.in"));
        startActivity(browserIntent33);
    }
    public void open34(View view) {
        Intent browserIntent34 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tn10th.in/p/tamilnadu-10th-syllabus.html?m=1"));
        startActivity(browserIntent34);
    }



}
