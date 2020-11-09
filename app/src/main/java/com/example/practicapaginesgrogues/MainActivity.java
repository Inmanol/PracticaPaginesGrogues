package com.example.practicapaginesgrogues;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView negocis, restaurants, cartellera, temps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        negocis = findViewById(R.id.negocis);
        restaurants = findViewById(R.id.restaurants);
        cartellera = findViewById(R.id.cartellera);
        temps = findViewById(R.id.temps);

        negocis.setOnClickListener(this);
        restaurants.setOnClickListener(this);
        cartellera.setOnClickListener(this);
        temps.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        ImageView img = (ImageView)v;

        if(img == negocis)
        {
            Intent intent = new Intent(this, Negocis.class);
            startActivity(intent);
        }
        else if(img == restaurants)
        {
            Intent intent2 = new Intent(this, restaurantes.class);
            startActivity(intent2);
        }
        else if(img == cartellera)
        {
            Intent intent3 = new Intent(this, cartelera.class);
            startActivity(intent3);
        }
        else if(img == temps)
        {
            Intent intent4 = new Intent(this, temps.class);
            startActivity(intent4);
        }


    }
}