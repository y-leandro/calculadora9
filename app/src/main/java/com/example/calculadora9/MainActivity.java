package com.example.calculadora9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText N1, N2;
    TextView T;
    int n1, n2, t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        N1 = findViewById(R.id.num1);
        N2 = findViewById(R.id.num2);
        T = findViewById(R.id.total);
    }

    public void arrumaHora(){
        n1 = Integer.parseInt(N1.getText().toString());
        n2 = Integer.parseInt(N2.getText().toString());

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