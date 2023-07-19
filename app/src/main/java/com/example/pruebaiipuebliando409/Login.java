package com.example.pruebaiipuebliando409;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    //ATRIBUTOS: ELEMENTOS GRÁFICOS (FORMULARIOS)
    EditText usuarioCaja;
    EditText passwordCaja;

    Button botoningreso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usuarioCaja = findViewById(R.id.usuariocaja);
        passwordCaja = findViewById(R.id.clavecaja);
        botoningreso = findViewById(R.id.botonlogueo);

        botoningreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Capturo los datos cuando le dé clic a ingresar

                //Capturando datos de las cajas(formularios EditTExt)

                String usarioingresado = usuarioCaja.getText().toString();
                String claveingresada = passwordCaja.getText().toString();

                //Se abre una nueva actividad
                Intent intentlogueo = new Intent(Login.this,Home.class);

                //Se pasa datos ingresados de una actividad a otra:
                intentlogueo.putExtra("Usuarionombre",usarioingresado);
                intentlogueo.putExtra("Usuarioclave",claveingresada);

                startActivity(intentlogueo);

            }
        });

    }
}