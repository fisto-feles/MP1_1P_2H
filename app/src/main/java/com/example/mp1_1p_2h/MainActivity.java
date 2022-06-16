package com.example.mp1_1p_2h;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtNombre, txtApellidos, txtEdad, txtEmail;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = (EditText) findViewById(R.id.txtNombre);
        txtApellidos = (EditText) findViewById(R.id.txtApellidos);
        txtEdad = (EditText) findViewById(R.id.txtEdad);
        txtEmail = (EditText) findViewById(R.id.txtEmail);

        btnEnviar = (Button) findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b = new Bundle();
                b.putString("NOMBRE", txtNombre.getText().toString());
                b.putString("APELLIDOS", txtApellidos.getText().toString());
                b.putString("EDAD", txtEdad.getText().toString());
                b.putString("EMAIL", txtEmail.getText().toString());

                Intent i = new Intent(getApplicationContext(), Resultado.class);
                i.putExtras(b);
                startActivity(i);
            }
        });
    }
}