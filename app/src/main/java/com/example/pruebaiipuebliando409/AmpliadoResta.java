package com.example.pruebaiipuebliando409;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;
import com.example.pruebaiipuebliando409.moldes.MoldeHotel;
import com.example.pruebaiipuebliando409.moldes.MoldeRestaurante;

public class AmpliadoResta extends AppCompatActivity {

    MoldeRestaurante moldeDelResta;
    ImageView imagenRestaAmpliado;
    TextView nombreRestaAmpliado;
    TextView precioPlatoAmpliado;
    TextView telefonoRestaAmpliado;
    TextView descripRestaAmpliado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliado_resta);

        ImageView logoImageView = findViewById(R.id.logo2);
        Glide.with(this)
                .load(R.drawable.imagenampliandoresta)
                .apply(RequestOptions.bitmapTransform(new CircleCrop()))
                .into(logoImageView);

        imagenRestaAmpliado = findViewById(R.id.logo2);
        nombreRestaAmpliado = findViewById(R.id.nombreRESTAampliado);
        precioPlatoAmpliado = findViewById(R.id.precioRESTAampliado);
        telefonoRestaAmpliado = findViewById(R.id.telefonoRESTAampliado);
        descripRestaAmpliado = findViewById(R.id.descripcionAmpliRESTA);

        moldeDelResta = (MoldeRestaurante) getIntent().getSerializableExtra("datosRestaurante");

        imagenRestaAmpliado.setImageResource(moldeDelResta.getFotoR());
        nombreRestaAmpliado.setText(moldeDelResta.getNombreR());
        precioPlatoAmpliado.setText(moldeDelResta.getPrecioR());
        telefonoRestaAmpliado.setText(moldeDelResta.getContactoR());
        descripRestaAmpliado.setText(moldeDelResta.getDescripR());
    }
}