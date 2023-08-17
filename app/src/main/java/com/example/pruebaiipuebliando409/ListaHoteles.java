package com.example.pruebaiipuebliando409;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pruebaiipuebliando409.adaptadores.AdaptadorHoteles;
import com.example.pruebaiipuebliando409.adaptadores.AdaptadorSitios;
import com.example.pruebaiipuebliando409.moldes.MoldeHotel;

import java.util.ArrayList;
//LO SIGUIENTE SE SUGIRIÓ POR CHAT GPT
public class ListaHoteles extends AppCompatActivity {

    private RecyclerView recyclerViewHoteles;
    private AdaptadorHoteles adaptadorHoteles;
    private ArrayList<MoldeHotel> listaHoteles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);

        recyclerViewHoteles = findViewById(R.id.recyclerViewHoteles);
        listaHoteles = new ArrayList<>();// Aquí debes agregar tus datos de sitios a la lista
        listaHoteles.add(new MoldeHotel("Hotel cabañal La Palma", "$5", "3005068890", R.drawable.hotelcabanialapalma));

        adaptadorHoteles = new AdaptadorHoteles(listaHoteles);
        recyclerViewHoteles.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewHoteles.setAdapter(adaptadorHoteles);
    }
}