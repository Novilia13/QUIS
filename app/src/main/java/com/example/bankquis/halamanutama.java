package com.example.bankquis;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class halamanutama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halamanutama);
    }

    public void intent1(View view) {
        Intent i = new Intent (halamanutama.this,MainActivity.class);
        startActivity(i);
    }

    public void intent2(View view) {
        Intent i = new Intent (halamanutama.this,MainActivity2.class);
        startActivity(i);
    }

    public void intent3(View view) {
        Intent i = new Intent (halamanutama.this,MainActivity3.class);
        startActivity(i);
    }
}