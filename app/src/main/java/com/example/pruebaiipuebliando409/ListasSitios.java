package com.example.pruebaiipuebliando409;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.pruebaiipuebliando409.adaptadores.AdaptadorSitios;
import com.example.pruebaiipuebliando409.moldes.MoldeSitio;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class ListasSitios extends AppCompatActivity {
    ArrayList<MoldeSitio> listaSitios = new ArrayList<>();
    RecyclerView recyclerView;

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listas_sitios);

        recyclerView = findViewById((R.id.recyclerViewSitios));
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        db.collection("sitios")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                String nombreSitio = document.getString("nombre");
                                String precioSitio = document.getString("precio");
                                String contactoSitio = document.getString("contacto");
                                String encargado = document.getString("encargado");

                                Toast.makeText(ListasSitios.this, "Al sitio "+nombreSitio+" te lleva "+encargado+", llamale al" +contactoSitio, Toast.LENGTH_SHORT).show();
                                }
                        } else {
                        }
                    }
                });

        llenarListaConDatos();
        AdaptadorSitios adaptadorSitios = new AdaptadorSitios(listaSitios);
        recyclerView.setAdapter(adaptadorSitios);
    }
    public void llenarListaConDatos () {

        listaSitios.add(new MoldeSitio("Parroquia San Juan de la Tasajera", R.drawable.sitioparroquiasanjuandelat, "Casimiro Godinez", "3336663636", "0", 4.4f));
        listaSitios.add(new MoldeSitio("Charcos Piedras Blancas", R.drawable.sitiopiedrasblancassinveri, "Juanma", "3005698189", "0", 3.8f));
        listaSitios.add(new MoldeSitio("Sendero de la virgen", R.drawable.sitiovirgenensendero, "Jorge 'El patiquebrao'", "3075698989", "0", 4.7f));

    }
}