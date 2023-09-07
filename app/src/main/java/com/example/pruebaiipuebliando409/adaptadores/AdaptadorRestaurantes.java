package com.example.pruebaiipuebliando409.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pruebaiipuebliando409.AmpliadoHotel;
import com.example.pruebaiipuebliando409.AmpliadoResta;
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

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView nombreRestaurante;
        ImageView fotoRestaurante;
        TextView precioRestaurante;
        TextView contactoRestaurante;
        TextView platoRestaurante;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            nombreRestaurante = itemView.findViewById(R.id.nombreresta1);
            fotoRestaurante = itemView.findViewById(R.id.imagenresta1);
            precioRestaurante = itemView.findViewById(R.id.precios);
            contactoRestaurante = itemView.findViewById(R.id.numeroresta);
            platoRestaurante = itemView.findViewById(R.id.platorecom);
        }

        public void actualizarDatos(MoldeRestaurante moldeRestaurante) {
            nombreRestaurante.setText(moldeRestaurante.getNombreR());
            fotoRestaurante.setImageResource(moldeRestaurante.getFotoR());
            precioRestaurante.setText((moldeRestaurante.getPrecioR()));
            contactoRestaurante.setText(moldeRestaurante.getContactoR());
            platoRestaurante.setText(moldeRestaurante.getPlato());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentAmpliar = new Intent(itemView.getContext(), AmpliadoResta.class);
                    intentAmpliar.putExtra("datosRestaurante", moldeRestaurante);
                    itemView.getContext().startActivity(intentAmpliar);
                }
            });
        }
    }
}
