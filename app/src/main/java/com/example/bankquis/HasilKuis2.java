package com.example.bankquis;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class HasilKuis2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_kuis2);
        TextView hasil = (TextView)findViewById(R.id.hasil);
        TextView nilai = (TextView)findViewById(R.id.nilai);

        hasil.setText("Jawaban Benar :"+MainActivity2.benar+"\nJawaban Salah :"+MainActivity2.salah);
        nilai.setText(""+MainActivity2.hasil);
    }

    public void ulangi(View view){
        finish();
        Intent a = new Intent(getApplicationContext(),MainActivity2.class);
        startActivity(a);
    }
    public void intent (View view)
    {
        Intent i = new Intent (HasilKuis2.this,halamanutama.class);
        startActivity(i);

    }
}