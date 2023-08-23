package com.example.pruebaiipuebliando409;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pruebaiipuebliando409.adaptadores.AdaptadorRestaurantes;
import com.example.pruebaiipuebliando409.moldes.MoldeRestaurante;

import java.util.ArrayList;

public class ListaRestaurantes extends AppCompatActivity {

    ArrayList<MoldeRestaurante> listaRestaurantes = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);

        recyclerView = findViewById((R.id.recyclerViewRestaurantes));
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        llenarListaConDatos();
        AdaptadorRestaurantes adaptadorRestaurantes = new AdaptadorRestaurantes(listaRestaurantes);
        recyclerView.setAdapter(adaptadorRestaurantes);
    }
    public void llenarListaConDatos () {

        listaRestaurantes.add(new MoldeRestaurante("Donde aide", R.drawable.platoasados, "$26000", "3005698989", "Asado tradicional"));
        listaRestaurantes.add(new MoldeRestaurante("Parador Santa Rosa", R.drawable.platocazuela, "$31000", "3005698989", "Cazuela sencilla"));
        listaRestaurantes.add(new MoldeRestaurante("Fonda y Pesebrera La Mazorca", R.drawable.platochorizo, "$14000", "3005698989", "Choriza de la casa"));
        listaRestaurantes.add(new MoldeRestaurante("Restaurante Bar La Portada", R.drawable.platomondongo, "$34000", "3005698989", "Mondongo completo"));
        listaRestaurantes.add(new MoldeRestaurante("Restaurante Meraki", R.drawable.platotilapia, "$27000", "3005698989", "Tilapia"));

    }
}