package com.example.pruebaiipuebliando409;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;
import com.example.pruebaiipuebliando409.moldes.MoldeHotel;

public class AmpliadoHotel extends AppCompatActivity {

    MoldeHotel moldeDelHotel;
    ImageView fotoHotelAmpliado;
    TextView nombreHotelAmpliado;
    TextView precioHotelAmpliado;
    TextView telefonoHotelAmpliado;
    TextView descripHotelAmpliado;
    RatingBar valoraHotelAmpliado;
    TextView comentarioHotelAmp;
    TextView usercomentaHotelAmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliado_hotel);
        



        fotoHotelAmpliado = findViewById(R.id.logo);
        nombreHotelAmpliado = findViewById(R.id.nombrehotelampliado);
        precioHotelAmpliado = findViewById(R.id.preciohotelampliado);
        telefonoHotelAmpliado = findViewById(R.id.telefonohotelampliado);
        descripHotelAmpliado = findViewById(R.id.descripcionAmpliH);
        valoraHotelAmpliado = findViewById(R.id.valorahotelampliado);
        comentarioHotelAmp = findViewById(R.id.comentariotexto);
        usercomentaHotelAmp = findViewById(R.id.nombreUser);


        //La clase que mandamos
        moldeDelHotel = (MoldeHotel)getIntent().getSerializableExtra("datoshotel");

        //Cargando la info. en los componentes
        fotoHotelAmpliado.setImageResource(moldeDelHotel.getFoto());
        nombreHotelAmpliado.setText(moldeDelHotel.getNombre());
        precioHotelAmpliado.setText(moldeDelHotel.getPrecio());
        telefonoHotelAmpliado.setText(moldeDelHotel.getTel());
        descripHotelAmpliado.setText(moldeDelHotel.getDescrip());
        valoraHotelAmpliado.setRating(moldeDelHotel.getValoraH());
        comentarioHotelAmp.setText(moldeDelHotel.getComentarioH());
        usercomentaHotelAmp.setText(moldeDelHotel.getNombreUserH());
    }
}