package com.example.pruebaiipuebliando409;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    //Attributes zone
    Button botonHotel;
    Button botonRestaurant;
    Button botonTourism;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        /*a un botón aquí le lancé uno que cree en lo gráfico o simple, vinculación del botón con java*/
        botonHotel =findViewById(R.id.botonhoteles);
        //Tiene que exister para poder dar clic
        //Sobre quién voy a escuchar? Sobre la vista
        botonHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Qué se quiere que pase al detectar un clic
                Toast.makeText(Home.this, "Clic detectado", Toast.LENGTH_SHORT).show();
            }
        });

    }
}