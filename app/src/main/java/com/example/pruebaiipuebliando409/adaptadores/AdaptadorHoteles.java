package com.example.pruebaiipuebliando409.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pruebaiipuebliando409.R;
import com.example.pruebaiipuebliando409.moldes.MoldeHotel;

import java.util.ArrayList;

//Aquí se está diciendo: es una clase especial, va a ser un adaptador de un recycler view (va a sacar copias de un molde)
public class AdaptadorHoteles extends /*hereda*/RecyclerView.Adapter<AdaptadorHoteles.viewHolder> {

    //LOS ADAPTADORES TIENE UNA LISTA DE ELEMENTOS
    public ArrayList<MoldeHotel> listaHoteles;

    //Se crea constructor vacío
    public AdaptadorHoteles() {
    }

    //Se crea constructor lleno
    public AdaptadorHoteles(ArrayList<MoldeHotel> listaHoteles) {
        this.listaHoteles = listaHoteles;
    }

    @NonNull
    @Override
    //Hay dos versiones de adaptadores, se usa como está la siguiente:
    public AdaptadorHoteles.viewHolder onCreateViewHolder /*Asociado a método que crea un elemento grafico y lo pone en la lista*/(@NonNull ViewGroup parent, int viewType) {
        //El siguiente fragmento permite crear n copias del molde:
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.moldehotel, null, false/*Nulo y falso porque no va a ver lista dentro de lista*/);/*Si hay X elementos en la lista se van a inflar X elementos en moldehotel*/
        return new parent(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorHoteles.viewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
