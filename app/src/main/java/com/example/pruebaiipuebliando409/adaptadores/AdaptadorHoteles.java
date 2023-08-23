package com.example.pruebaiipuebliando409.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pruebaiipuebliando409.R;
import com.example.pruebaiipuebliando409.moldes.MoldeHotel;

import java.util.ArrayList;

// Esta es una clase llamada AdaptadorHoteles que extiende (hereda de) RecyclerView.Adapter.
// Esto significa que va a ayudar a mostrar elementos en un RecyclerView utilizando un molde.
//Aquí se está diciendo: es una clase especial, va a ser un adaptador de un recycler view (va a sacar copias de un molde)
public class AdaptadorHoteles extends /*hereda*/RecyclerView.Adapter<AdaptadorHoteles.viewHolder> {

    // Aquí declaramos una lista que contendrá objetos del tipo MoldeHotel.
    //LOS ADAPTADORES TIENEN UNA LISTA DE ELEMENTOS
    public ArrayList<MoldeHotel> listaHoteles;

    // Constructor vacío que inicializa el adaptador sin elementos.
    //Se crea constructor vacío
    public AdaptadorHoteles() {
    }

    // Constructor que recibe una lista de objetos MoldeHotel y la asigna a la propiedad listaHoteles.
    //Se crea constructor lleno
    public AdaptadorHoteles(ArrayList<MoldeHotel> listaHoteles) {
        this.listaHoteles = listaHoteles;
    }
//Los siguientes elementos son métodos de JAVA, son los que 'pintan', crean un elemento gráfico:
    @NonNull
    @Override
    //Hay dos versiones de adaptadores, se usa como está la siguiente:
    public AdaptadorHoteles.viewHolder onCreateViewHolder /*Asociado a método que crea un elemento grafico y lo pone en la lista*/(@NonNull ViewGroup parent, int viewType) {
        // En este método creamos una vista basada en un layout llamado moldehotel.xml.
        // Este layout define cómo se verá cada elemento en la lista.
        //El siguiente fragmento permite crear n copias del molde:
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.moldehotel, null, false);/*Nulo y falso porque no va a ver lista dentro de lista*//*Si hay X elementos en la lista se van a inflar X elementos en moldehotel*/
        // Después, creamos y retornamos un objeto viewHolder, que manejará esta vista.

        return new viewHolder(vista);
    }

    @Override
    // Este método se llama cuando es necesario mostrar datos en un elemento específico
    public void onBindViewHolder(@NonNull AdaptadorHoteles.viewHolder holder, int position) {
        //A cada molde llevele la info del elemento de la lista (copia de un elemento gráfico)
        holder.actualizarDatos(listaHoteles.get(position));
    }

    @Override
    public int getItemCount() {
        return listaHoteles.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        //Se asocian los elementos que van a cambiar por cada molde
        ImageView fotoHotel;
        TextView nombreHotel;
        TextView precioHotel;
        TextView contactoHotel;

        public viewHolder(@NonNull View itemView) {
            //
            super(itemView);
            nombreHotel = itemView.findViewById(R.id.nombrehotel1);
            precioHotel = itemView.findViewById(R.id.preciohotel1);
            contactoHotel = itemView.findViewById(R.id.numerocontactoHotel);
            fotoHotel = itemView.findViewById(R.id.imagenhotel1);
        }

        public void actualizarDatos(MoldeHotel moldeHotel) {
            fotoHotel.setImageResource(moldeHotel.getFoto());
            nombreHotel.setText(moldeHotel.getNombre());
            precioHotel.setText((moldeHotel.getPrecio()));
            contactoHotel.setText(moldeHotel.getTel());
        }
    }
}
