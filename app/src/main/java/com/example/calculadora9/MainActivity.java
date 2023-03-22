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

    public void resetar(View v){
        N1.setText("");
        N2.setText("");
        T.setText("");
    }
}