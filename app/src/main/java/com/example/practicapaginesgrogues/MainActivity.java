package com.example.practicapaginesgrogues;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

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
    }

    @Override
    public void onClick(View v) {
        ImageView img = (ImageView)v;

        if(img == negocis)
        {
            Intent intent = new Intent(this, negocis.class);
            startActivity(intent);
        }
        else if(img == restaurants)
        {
            Intent intent = new Intent(this, restaurantes.class);
            startActivity(intent);
        }
        else if(img == cartellera)
        {
            Intent intent = new Intent(this, cartelera.class);
            startActivity(intent);
        }
        else if(img == temps)
        {
            Intent intent = new Intent(this, temps.class);
            startActivity(intent);
        }


    }
}