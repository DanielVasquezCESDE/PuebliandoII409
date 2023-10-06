package com.example.pruebaiipuebliando409;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.pruebaiipuebliando409.adaptadores.AdaptadorRestaurantes;
import com.example.pruebaiipuebliando409.moldes.MoldeRestaurante;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class ListaRestaurantes extends AppCompatActivity {

    ArrayList<MoldeRestaurante> listaRestaurantes = new ArrayList<>();
    RecyclerView recyclerView;

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);

        recyclerView = findViewById((R.id.recyclerViewRestaurantes));
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        db.collection("restaurantes")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                String nombreResta = document.getString("nombre");
                                String precioResta = document.getString("precio");
                                String contactoResta = document.getString("contacto");
                                String platoResta = document.getString("plato");

                                Toast.makeText(ListaRestaurantes.this, nombreResta, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaRestaurantes.this, precioResta, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaRestaurantes.this, contactoResta, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaRestaurantes.this, platoResta, Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            //Log.w(TAG, "Error getting documents.", task.getException());
                        }
                    }
                });

        llenarListaConDatos();
        AdaptadorRestaurantes adaptadorRestaurantes = new AdaptadorRestaurantes(listaRestaurantes);
        recyclerView.setAdapter(adaptadorRestaurantes);
    }
    public void llenarListaConDatos () {

        listaRestaurantes.add(new MoldeRestaurante("Donde aide", R.drawable.resta_aide, "$26000", "3005698989", "Asado tradicional",  4.2f));
        listaRestaurantes.add(new MoldeRestaurante("Parador Santa Rosa", R.drawable.resta_strosa, "$31000", "3005698989", "Cazuela sencilla", 4.6f));
        listaRestaurantes.add(new MoldeRestaurante("Fonda y Pesebrera La Mazorca", R.drawable.resta_mazorca, "$14000", "3005698989", "Choriza de la casa", 4.4f));
        listaRestaurantes.add(new MoldeRestaurante("Restaurante Bar La Portada", R.drawable.resta_portada, "$34000", "3005698989", "Mondongo completo", 3.8f));
        listaRestaurantes.add(new MoldeRestaurante("Restaurante Meraki", R.drawable.resta_rancherito, "$27000", "3005698989", "Tilapia", 4.1f));

    }
}