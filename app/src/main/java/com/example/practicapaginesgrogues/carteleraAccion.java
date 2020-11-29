package com.example.practicapaginesgrogues;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class carteleraAccion extends AppCompatActivity implements View.OnClickListener {
    ImageView peli1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartelera_accion);

        peli1 = findViewById(R.id.peli1);
        peli1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        ImageView img = (ImageView)v;

    }
}