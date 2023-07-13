package com.example.pruebaiipuebliando409;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    //ATRIBUTOS: ELEMENTOS GRÁFICOS (FORMULARIOS)
    EditText usuarioCaja;
    EditText passwordCaja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usuarioCaja = findViewById(R.id.usuariocaja);
        passwordCaja = findViewById(R.id.clavecaja);

        //Capturando datos de las cajas(formularios EditTExt)

        String usarioingresado = usuarioCaja.getText().toString();
        String claveingresada = passwordCaja.getText().toString();
    }
}