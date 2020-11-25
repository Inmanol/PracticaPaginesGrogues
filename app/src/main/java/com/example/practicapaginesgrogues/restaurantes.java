package com.example.practicapaginesgrogues;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class restaurantes extends AppCompatActivity implements View.OnClickListener {
    Button rCarn, rItaliano, rMarisco, rJapo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);

        rCarn = findViewById(R.id.rCarn);
        rCarn.setOnClickListener(this);
        rItaliano = findViewById(R.id.rItaliano);
        rItaliano.setOnClickListener(this);
        rMarisco = findViewById(R.id.rMarisco);
        rMarisco.setOnClickListener(this);
        rJapo = findViewById(R.id.rJapo);
        rJapo.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Button b = (Button) v;

        if(b == rCarn)
        {
            Intent i = new Intent(this, restauranteCarne.class);
            startActivity(i);
        }
        else if(b == rItaliano)
        {
            Intent i2 = new Intent(this, restauranteItaliano.class);
            startActivity(i2);
        }
        else if(b == rMarisco)
        {
            Intent i3 = new Intent(this, restauranteMarisco.class);
            startActivity(i3);
        }
        else if(b == rJapo)
        {
            Intent i4 = new Intent(this, restauranteJapo.class);
            startActivity(i4);
        }

    }
}