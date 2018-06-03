package com.utsman.kucingapes.viewpagerfragmentcontih;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Utama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);

        // tesss
    }

    public void slide1(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("slide", "slide1");
        startActivity(intent);
    }

    public void slide2(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("slide", "slide2");
        startActivity(intent);
    }
}
