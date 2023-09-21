package com.example.pruebaiipuebliando409;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.pruebaiipuebliando409.adaptadores.AdaptadorHoteles;
import com.example.pruebaiipuebliando409.adaptadores.AdaptadorSitios;
import com.example.pruebaiipuebliando409.moldes.MoldeHotel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {

    //De qué tipo es el arraylist, ¿de MoldeHotel?
    //Estructura de un arreglo o lista dinámica en java:
    ArrayList<MoldeHotel> listaHoteles = new ArrayList<>();
    RecyclerView recyclerView;

    //Inicializa una instancia de Cloud Firestore, un objeto de tipo database
    FirebaseFirestore db = FirebaseFirestore.getInstance();
/*
//LO SIGUIENTE SE SUGIRIÓ POR CHAT GPT
    private RecyclerView recyclerViewHoteles;
    private AdaptadorHoteles adaptadorHoteles;
    private ArrayList<MoldeHotel> listaHoteles;
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);

        recyclerView = findViewById((R.id.recyclerViewHoteles));
        //Se llama a un constructor de un layout, que va a ser de tipo lineal (Scroll vertical)
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));//Para que no active una lista dentro de otra


        //Tabla hoteles (UNA COLECCIÓN EN BD NO RELACIONAL ES UNA TABLA)
        //Va a buscar una colección en la nube que se llama hoteles
        db.collection("hoteles")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override   //"Mientras termina lo llama"
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            //Pasa por cada registro o DOCUMENTO usando un ciclo
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                                    //Aquí se extrae el dato registro
                                String nombreHotel = document.getString("nombre");
                                String precioHotel = document.getString("precio");
                                String telefonoHotel = document.getString("precio");

                                Toast.makeText(ListaHoteles.this, nombreHotel+" $"+precioHotel, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaHoteles.this, telefonoHotel, Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            //Log.w(TAG, "Error getting documents.", task.getException());
                        }
                    }
                });


        llenarListaConDatos();
        AdaptadorHoteles adaptadorHoteles = new AdaptadorHoteles(listaHoteles);
        recyclerView.setAdapter(adaptadorHoteles);
    }
    public void llenarListaConDatos () {
        //Después se a usar info. que venga de la base datos
        listaHoteles.add(new MoldeHotel("Hotel cabañal La Palma", "$1", "3005068890", R.drawable.hotelcabanialapalma, "Experimenta la tranquilidad de la naturaleza en nuestra hacienda con vistas panorámicas a las montañas. Disfruta de habitaciones acogedoras y actividades al aire libre. Ideal para escapadas románticas.", 2.7f));
        listaHoteles.add(new MoldeHotel("Hotel Copamar", "$2", "3234543232", R.drawable.hotelcopamar, "Sumérgete en la cultura cafetera en esta auténtica finca antioqueña. Rodeada de cafetales, ofrece alojamientos rústicos y recorridos por la plantación. Perfecta para amantes del café y la naturaleza.", 4.5f));
        listaHoteles.add(new MoldeHotel("Hotel Copacabana", "$3", "3234543232", R.drawable.hoteldecopacabana, "Enclavado en el corazón de un bosque encantado, nuestro hotel boutique ofrece elegantes habitaciones con vista al río. Relájate en el spa o aventúrate en senderos ecológicos. Una experiencia de lujo en la naturaleza.", 3.2f));
        listaHoteles.add(new MoldeHotel("Hotel LibertGHotel", "$5", "3234543232", R.drawable.hotellibertghotelsspa, "Vive la experiencia de alojarte en cabañas de madera rodeadas de exuberante vegetación. Perfecto para familias o grupos, con actividades como paseos a caballo y fogatas nocturnas. Un refugio acogedor en la montaña.", 2.2f));
        listaHoteles.add(new MoldeHotel("Hotel Villa Camila", "$8", "3234543232", R.drawable.hotelvillacamila, "Esta posada emana encanto rural en cada rincón. Con jardines floridos y piscina al aire libre, es el lugar ideal para desconectar. Ofrecemos deliciosa comida casera y un ambiente acogedor para toda la familia.", 1.5f));
    }
}