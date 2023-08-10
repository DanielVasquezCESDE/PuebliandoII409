package com.example.pruebaiipuebliando409;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SitiosHome extends AppCompatActivity {

    Button botonListaSitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitios_home);

        botonListaSitios = findViewById(R.id.botonvermasS);
        botonListaSitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentlistasites = new Intent(SitiosHome.this, ListasSitios.class);
                startActivity(intentlistasites);
            }
        });
    }
}