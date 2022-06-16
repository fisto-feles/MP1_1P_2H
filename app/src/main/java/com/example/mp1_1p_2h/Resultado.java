package com.example.mp1_1p_2h;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Bundle b = getIntent().getExtras();

        lblResultado = (TextView) findViewById(R.id.lblResultado);
        lblResultado.setText("Cliente: " + b.getString("NOMBRE") + " " + b.getString("APELLIDOS") + "\nEdad: " + b.getString("EDAD") + "\nEMAIL: " + b.getString("EMAIL"));
    }
}