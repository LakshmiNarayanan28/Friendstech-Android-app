package com.example.friendstech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Engineering extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engineering);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void open(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.indiabix.com/online-test/categories"));
        startActivity(browserIntent);
    }
    public void open1(View view){
        Intent browserIntent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.crackaptitude.com"));
        startActivity(browserIntent1);}

    public void open2(View view){
        Intent browserIntent2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.careerride.com"));
        startActivity(browserIntent2);}

    public void open3(View view){
        Intent browserIntent3=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.allindiaexams.in"));
        startActivity(browserIntent3);}

    public void open4(View view){
        Intent browserIntent4=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.studytonight.com/tests"));
        startActivity(browserIntent4);}

    public void open5(View view){
        Intent browserIntent5=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.practiceaptitudetests.com"));
        startActivity(browserIntent5);}

    public void open6(View view){
        Intent browserIntent6=new Intent(Intent.ACTION_VIEW, Uri.parse("https://testpot.com/companies/tcs-online-test/5688c5142527e41dd99627dc"));
        startActivity(browserIntent6);}

    public void open7(View view){
        Intent browserIntent7=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geeksforgeeks.org/aptitude-gq"));
        startActivity(browserIntent7);}

    public void open8(View view){
        Intent browserIntent8=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.javatpoint.com/examaccess"));
        startActivity(browserIntent8);}
}
