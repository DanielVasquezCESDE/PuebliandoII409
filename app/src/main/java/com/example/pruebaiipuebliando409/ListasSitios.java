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

        listaSitios.add(new MoldeSitio("Parroquia San Juan de la Tasajera", R.drawable.sitioparroquiasanjuandelat, "Casimiro Godinez", "3336663636", "0", "Una joya arquitectónica en el corazón de Copacabana, esta parroquia es un testimonio vivo de la historia local. Sus altos techos y detalles ornamentales evocan una atmósfera de serenidad. Un lugar de encuentro espiritual y un punto emblemático en el paisaje urbano de Copacabana."));
        listaSitios.add(new MoldeSitio("Charchos Piedras Blancas", R.drawable.sitiopiedrasblancassinveri, "Juanma", "3005698189", "0", "Un oasis natural en medio de la exuberante vegetación de Copacabana. Estos charcos cristalinos son pequeños tesoros escondidos donde puedes disfrutar de un refrescante baño en aguas puras y relajarte rodeado de la naturaleza. Un rincón perfecto para desconectar del bullicio urbano."));
        listaSitios.add(new MoldeSitio("Sendero de la virgen", R.drawable.sitiovirgenensendero, "Jorge 'El patiquebrao'", "3075698989", "0", "Un camino que te guía hacia lo más alto de Copacabana, donde encontrarás una vista impresionante de la ciudad y sus alrededores. El Sendero de la Virgen es una experiencia enriquecedora para los amantes de la naturaleza y los devotos, culminando en un santuario dedicado a la Virgen María, ofreciendo un momento de paz y contemplación."));

    }
}