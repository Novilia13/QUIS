package com.example.bankquis;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class HasilKuis3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_kuis3);
        TextView hasil = (TextView)findViewById(R.id.hasil);
        TextView nilai = (TextView)findViewById(R.id.nilai);

        hasil.setText("Jawaban Benar :"+MainActivity3.benar+"\nJawaban Salah :"+MainActivity3.salah);
        nilai.setText(""+MainActivity3.hasil);
    }

    public void ulangi(View view){
        finish();
        Intent a = new Intent(getApplicationContext(),MainActivity3.class);
        startActivity(a);
    }
    public void intent (View view)
    {
        Intent i = new Intent (HasilKuis3.this,halamanutama.class);
        startActivity(i);

    }
}