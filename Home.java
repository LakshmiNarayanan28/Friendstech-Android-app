package com.example.friendstech;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.io.File;

public class Home extends AppCompatActivity {
    private Button button;
    private Button butto1;
    private Button butto2;
    private Button butto3;
    private Button butto4;
    private Button butto5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        button=(Button)findViewById(R.id.button);
        butto1=(Button) findViewById(R.id.button2);
        butto2=(Button) findViewById(R.id.button3);
        butto3=(Button) findViewById(R.id.button4);
        butto4=(Button) findViewById(R.id.button5);
        butto5=(Button) findViewById(R.id.button6);

//button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEngineering();
            }
        });
//button2
        butto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAptitude();
            }
        });
        //button3
        butto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openArts();
            }
        });
        //button4
        butto3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGovernment();
            }
        });
        //button5
        butto4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTenth();
            }
        });
        //button6
        butto5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCourses();
            }
        });
    }
    public void openEngineering(){
        Intent intent=new Intent(this,Engineering.class);
        startActivity(intent);
    }
    public void openAptitude(){
        Intent intent=new Intent(this,Aptitude.class);
        startActivity(intent);
    }
    public void openArts(){
        Intent intent=new Intent(this,Arts.class);
        startActivity(intent);
    }
    public void openGovernment(){
        Intent intent=new Intent(this,Government.class);
        startActivity(intent);
    }
    public void openTenth(){
        Intent intent=new Intent(this,Tenth.class);
        startActivity(intent);
    }
    public void openCourses(){
        Intent intent=new Intent(this,Courses.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        //For Share
        if(id==R.id.share){
            ApplicationInfo api=getApplicationContext().getApplicationInfo();
            String apkpath=api.sourceDir;
            Intent intent=new Intent(Intent.ACTION_SEND);
            intent.setType("application/vnd.android.package-archive");
            intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new File(apkpath)));
            startActivity(Intent.createChooser(intent,"ShareVia"));

    }
        //For About
        if(id==R.id.action_new){
            Intent myintent=new Intent(Home.this,NewActivity.class);
            startActivity(myintent);
            return  false;
        }
        //For rate us
        if(id==R.id.action_rate){
        try{
            startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("market://details?id=" + getPackageName())));
        }catch (ActivityNotFoundException e){
            startActivity(new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://play.google.com/store/apps/details?id="+getPackageName())));
        }}
        //return true;
        return  super.onOptionsItemSelected(item);
}
@Override
    public void  onBackPressed(){
        final AlertDialog.Builder builder=new AlertDialog.Builder(Home.this);
        builder.setMessage("Are You Sure Want to Exit..Cool?");
        builder.setCancelable(true);
        builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
            builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();;
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();

}

}
