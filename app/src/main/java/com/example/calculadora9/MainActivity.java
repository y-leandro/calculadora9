package com.example.calculadora9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText eH1, eM1, eH2, eM2;
    TextView SH, SM;
    int h1, m1, h2, m2, ht, mt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        eH1 = findViewById(R.id.num1);
        eM1 = findViewById(R.id.min1);
        eH2 = findViewById(R.id.num2);
        eM2 = findViewById(R.id.min2);
        SH = findViewById(R.id.mostraH);
        SM = findViewById(R.id.mostraM);
    }

    public void arrumaHora(){
        h1 = Integer.parseInt(eH1.getText().toString());
        m1 = Integer.parseInt(eM1.getText().toString());
        h2 = Integer.parseInt(eH2.getText().toString());
        m2 = Integer.parseInt(eM2.getText().toString());

        while(m1 > 59){
            h1 ++;
            m1 = m1 - 60;
        }
        while(m2 >59){
            h2 ++;
            m2 = m2 -60;
        }
    }

    public void menos(View v){
        arrumaHora();
        if(h2 > h1){
            ht = h2 - h1;
            mt = m2 - m1;
        }
        else {
            ht = h1 - h2;
            if (m2 > m1) {
                mt = m2 - m1;

            } else {
                mt = m1 - m2;
            }
        }
        while(mt < 0){
            ht --;
            mt = mt +60;
        }
        SH.setText(ht+"");
        SM.setText(mt+"");
    }

    public void mais(View v){
        arrumaHora();
        ht = h1 + h2;
        mt = m1 +m2;
        while(mt >59){
            ht ++;
            mt = mt -60;
        }
        SH.setText(ht+"");
        SM.setText(mt+"");
    }

    public void resetar(View v){
        SH.setText("SH");
        SM.setText("SM");
        eH1.setText("");
        eH2.setText("");
        eM1.setText("");
        eM2.setText("");
    }
}