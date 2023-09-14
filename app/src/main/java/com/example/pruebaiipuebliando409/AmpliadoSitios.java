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
import com.example.pruebaiipuebliando409.moldes.MoldeRestaurante;
import com.example.pruebaiipuebliando409.moldes.MoldeSitio;

public class AmpliadoSitios extends AppCompatActivity {

    MoldeSitio moldeDelSitio;

    ImageView imagenSitiosAmpliado;
    TextView nombreStiosAmpliado;
    TextView telefonoSitiosAmpliado;
    TextView precioSitiosAmpliado;
    RatingBar valorSitioAmpliado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliado_sitios);

        ImageView logoImageView = findViewById(R.id.logo3);
        Glide.with(this)
                .load(R.drawable.imagenampliandoresta)
                .apply(RequestOptions.bitmapTransform(new CircleCrop()))
                .into(logoImageView);

        imagenSitiosAmpliado = findViewById(R.id.logo3);
        nombreStiosAmpliado = findViewById(R.id.nombresitioA);
        telefonoSitiosAmpliado = findViewById(R.id.telefonositioA);
        precioSitiosAmpliado = findViewById(R.id.preciositioA);
        valorSitioAmpliado = findViewById(R.id.valorampliadoSitios);


        moldeDelSitio = (MoldeSitio) getIntent().getSerializableExtra("datosSitios");

        imagenSitiosAmpliado.setImageResource(moldeDelSitio.getFotoS());
        nombreStiosAmpliado.setText(moldeDelSitio.getNombreS());
        telefonoSitiosAmpliado.setText(moldeDelSitio.getContacto());
        precioSitiosAmpliado.setText(moldeDelSitio.getPrecioS());
        valorSitioAmpliado.setRating(moldeDelSitio.getValorS());
    }
}