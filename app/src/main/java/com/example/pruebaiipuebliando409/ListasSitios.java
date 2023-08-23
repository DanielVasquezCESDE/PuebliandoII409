package com.example.pruebaiipuebliando409;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pruebaiipuebliando409.adaptadores.AdaptadorSitios;
import com.example.pruebaiipuebliando409.moldes.MoldeSitio;

import java.util.ArrayList;

public class ListasSitios extends AppCompatActivity {
    ArrayList<MoldeSitio> listaSitios = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listas_sitios);

        recyclerView = findViewById((R.id.recyclerViewSitios));
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        llenarListaConDatos();
        AdaptadorSitios adaptadorSitios = new AdaptadorSitios(listaSitios);
        recyclerView.setAdapter(adaptadorSitios);
    }
    public void llenarListaConDatos () {

        listaSitios.add(new MoldeSitio("Parroquia San Juan de la Tasajera", R.drawable.sitioparroquiasanjuandelat, "Casimiro Godinez", "3336663636", "0"));
        listaSitios.add(new MoldeSitio("Charchos Piedras Blancas", R.drawable.sitiopiedrasblancassinveri, "Juanma", "3005698189", "0"));
        listaSitios.add(new MoldeSitio("Sendero de la virgen", R.drawable.sitiovirgenensendero, "Jorge 'El patiquebrao'", "3075698989", "0"));

    }
}