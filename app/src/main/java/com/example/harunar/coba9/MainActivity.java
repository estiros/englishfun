package com.example.harunar.coba9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void hewan(View view){
        Intent e = new Intent(MainActivity.this,Hewan.class);
        startActivity(e);
    }

    public void buah(View view){
        Intent e = new Intent(MainActivity.this,Buah.class);
        startActivity(e);
    }

    public void bunga(View view){
        Intent e = new Intent(MainActivity.this,Bunga.class);
        startActivity(e);
    }

    public void profesi(View view){
        Intent e = new Intent(MainActivity.this,Profesi.class);
        startActivity(e);
    }

    public void tubuh(View view){
        Intent e = new Intent(MainActivity.this,Tubuh.class);
        startActivity(e);
    }
}
//
//nhbhbhbhbhbhbhb
