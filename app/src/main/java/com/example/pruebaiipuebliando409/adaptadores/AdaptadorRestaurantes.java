package com.example.pruebaiipuebliando409.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pruebaiipuebliando409.R;
import com.example.pruebaiipuebliando409.moldes.MoldeRestaurante;

import java.util.ArrayList;

public class AdaptadorRestaurantes extends RecyclerView.Adapter<AdaptadorRestaurantes.viewHolder>{

    public ArrayList<MoldeRestaurante> listaRestaurantes;

    public AdaptadorRestaurantes() {
    }

    public AdaptadorRestaurantes(ArrayList<MoldeRestaurante> listaRestaurantes) {
        this.listaRestaurantes = listaRestaurantes;
    }

    @NonNull
    @Override
    public AdaptadorRestaurantes.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.molderestaurante, null, false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorRestaurantes.viewHolder holder, int position) {
        holder.actualizarDatos(listaRestaurantes.get(position));
    }

    @Override
    public int getItemCount() {
        return listaRestaurantes.size();
    }

    public class viewHolder {
        public viewHolder(View vista) {
        }
    }
}
