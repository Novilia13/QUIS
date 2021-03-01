package com.example.bankquis;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class HasilKuis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_kuis);
        TextView hasil = (TextView)findViewById(R.id.hasil);
        TextView nilai = (TextView)findViewById(R.id.nilai);

        hasil.setText("Jawaban Benar :"+MainActivity.benar+"\nJawaban Salah :"+MainActivity.salah);
        nilai.setText(""+MainActivity.hasil);
    }

    public void ulangi(View view){
        finish();
        Intent a = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(a);
    }
    public void intent (View view)
    {
        Intent i = new Intent (HasilKuis.this,halamanutama.class);
        startActivity(i);

    }
}