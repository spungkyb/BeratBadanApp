package com.spungkyb.beratbadanapp;//merupakan package

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //extend merupakan inheritance

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }
    //method onclick, View view sebagai paramater
    public void tentang(View view) {
        Toast.makeText(MainActivity.this,"Ini Layout Tentang",Toast.LENGTH_SHORT).show();
    }

    public void hitung(View view) {
        Intent intent = new Intent(MainActivity.this,HitungActivity.class);
        startActivity(intent);
    }
}