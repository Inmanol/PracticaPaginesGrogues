package com.example.practicapaginesgrogues;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class restaurantes extends AppCompatActivity implements View.OnClickListener {
    TextView rCarn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);

        rCarn = findViewById(R.id.rCarn);
        rCarn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        TextView tv = (TextView) v;

        if(tv == rCarn)
        {
            Intent i = new Intent(this, restauranteCarne.class);
            startActivity(i);
        }

    }
}