package com.example.pruebaiipuebliando409.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pruebaiipuebliando409.AmpliadoResta;
import com.example.pruebaiipuebliando409.AmpliadoSitios;
import com.example.pruebaiipuebliando409.R;
import com.example.pruebaiipuebliando409.moldes.MoldeSitio;

import java.util.ArrayList;

public class AdaptadorSitios extends RecyclerView.Adapter<AdaptadorSitios.viewHolder> {

    public ArrayList<MoldeSitio> listaSitios;

    public AdaptadorSitios() {
    }

    public AdaptadorSitios(ArrayList<MoldeSitio> listaSitios) {
        this.listaSitios = listaSitios;
    }

    @NonNull
    @Override
    public AdaptadorSitios.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.moldesitios, null, false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorSitios.viewHolder holder, int position) {
        holder.actualizarDatos(listaSitios.get(position));
    }

    @Override
    public int getItemCount() {
        return listaSitios.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView nombreSitio;
        ImageView fotoSitio;
        TextView encargadoSitio;
        TextView contactoSitio;
        TextView precioSitio;
        RatingBar valorSitio;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            nombreSitio = itemView.findViewById(R.id.nombresitioaquí);
            fotoSitio = itemView.findViewById(R.id.imagensitio);
            encargadoSitio = itemView.findViewById(R.id.nombrencargado);
            contactoSitio = itemView.findViewById(R.id.numeroEnc);
            precioSitio = itemView.findViewById(R.id.preciositio);
            valorSitio = itemView.findViewById(R.id.valorMoldeSitio);
        }

        public void actualizarDatos(MoldeSitio moldeSitio) {
            nombreSitio.setText(moldeSitio.getNombreS());
            fotoSitio.setImageResource(moldeSitio.getFotoS());
            encargadoSitio.setText((moldeSitio.getEncargadoS()));
            contactoSitio.setText(moldeSitio.getContacto());
            precioSitio.setText(moldeSitio.getPrecioS());
            valorSitio.setRating(moldeSitio.getValorS());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentAmpliar = new Intent(itemView.getContext(), AmpliadoSitios.class);
                    intentAmpliar.putExtra("datosSitios", moldeSitio);
                    itemView.getContext().startActivity(intentAmpliar);
                }
            });
        }
    }
}
