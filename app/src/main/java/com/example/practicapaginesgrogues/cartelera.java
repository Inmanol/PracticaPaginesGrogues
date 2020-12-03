package com.example.practicapaginesgrogues;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cartelera extends AppCompatActivity implements View.OnClickListener {
    Button cAccion, cTerror, cComedia, cCienciaFiccion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartelera);

        cAccion = findViewById(R.id.cAccion);
        cAccion.setOnClickListener(this);
        cTerror = findViewById(R.id.cTerror);
        cTerror.setOnClickListener(this);
        cComedia = findViewById(R.id.cComedia);
        cComedia.setOnClickListener(this);
        cCienciaFiccion = findViewById(R.id.cCienciaFiccion);
        cCienciaFiccion.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Button b = (Button) v;

        if(b == cAccion)
        {
            Intent i = new Intent(this, carteleraAccion.class);
            startActivity(i);
        }
        else if(b == cTerror)
        {
            Intent i2 = new Intent(this, carteleraTerror.class);
            startActivity(i2);
        }
        else if(b == cComedia)
        {
            Intent i3 = new Intent(this, carteleraComedia.class);
            startActivity(i3);
        }
        else if(b == cCienciaFiccion)
        {
            Intent i4 = new Intent(this, carteleraCienciaFiccion.class);
            startActivity(i4);
        }
    }
}