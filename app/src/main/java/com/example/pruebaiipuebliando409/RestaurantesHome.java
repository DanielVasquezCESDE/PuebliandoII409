package com.example.pruebaiipuebliando409;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RestaurantesHome extends AppCompatActivity {

    Button botonVerMas2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes_home);

        botonVerMas2 = findViewById(R.id.botonvermasR);
        botonVerMas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentlistaR = new Intent(RestaurantesHome.this, ListaRestaurantes.class);
                startActivity(intentlistaR);
            }
        });

    }
}