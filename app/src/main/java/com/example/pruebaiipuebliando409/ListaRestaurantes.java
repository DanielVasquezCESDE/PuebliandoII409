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

        listaRestaurantes.add(new MoldeRestaurante("Donde aide", R.drawable.platoasados, "$26000", "3005698989", "Asado tradicional", "Este acogedor restaurante rural ofrece platos caseros preparados con ingredientes frescos de la zona. La especialidad de la casa es la trucha preparada de diversas maneras, siempre acompañada de sabores auténticos."));
        listaRestaurantes.add(new MoldeRestaurante("Parador Santa Rosa", R.drawable.platocazuela, "$31000", "3005698989", "Cazuela sencilla", "Este encantador restaurante colonial ofrece una experiencia gastronómica auténtica. Con platos tradicionales antioqueños y un ambiente acogedor, es el lugar perfecto para degustar la rica culinaria de la región."));
        listaRestaurantes.add(new MoldeRestaurante("Fonda y Pesebrera La Mazorca", R.drawable.platochorizo, "$14000", "3005698989", "Choriza de la casa", "Disfruta de auténtica comida antioqueña en un ambiente acogedor. Desde bandejas paisas hasta deliciosos tamales, este lugar te ofrece un festín de sabores locales."));
        listaRestaurantes.add(new MoldeRestaurante("Restaurante Bar La Portada", R.drawable.platomondongo, "$34000", "3005698989", "Mondongo completo", "Un paradero animado en el corazón de Copacabana. Aquí, podrás probar desde empanadas hasta chocoramo, pasando por caballerizas y minibar, todo en un ambiente lleno de vida y alegría."));
        listaRestaurantes.add(new MoldeRestaurante("Restaurante Meraki", R.drawable.platotilapia, "$27000", "3005698989", "Tilapia", "Para aquellos que prefieren opciones vegetarianas, este restaurante ofrece una variedad de platos deliciosos y nutritivos. Desde ensaladas frescas hasta opciones de comida caliente, aquí encontrarás sabores para todos los gustos"));

    }
}