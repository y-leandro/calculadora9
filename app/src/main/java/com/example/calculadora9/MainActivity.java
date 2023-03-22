package com.example.calculadora9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText N1, N2;
    TextView Ttl;
    int n1, n2, t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        N1 = findViewById(R.id.num1);
        N2 = findViewById(R.id.num2);
        Ttl  = findViewById(R.id.total);
    }


    public void numero() {
        n1 = Integer.parseInt(N1.getText().toString());
        n2 = Integer.parseInt(N2.getText().toString());
        t  = Integer.parseInt(Ttl.getText().toString());
    }

    public void menos (View v){
        numero();
        t = n1 - n2;
    }
    public void mais (View v){
        numero();
        t = n1 + n2;
    }

    public void ir_frase(View v){
        Intent i = new Intent(this, errado.class);
        startActivity(i);
    }

    public void resetar(View v){
        N1.setText("");
        N2.setText("");
        Ttl.setText("");
    }
}