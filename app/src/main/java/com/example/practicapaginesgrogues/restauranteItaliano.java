package com.example.practicapaginesgrogues;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class restauranteItaliano extends AppCompatActivity implements View.OnClickListener {
    ImageView telf1,telf2,telf3,url1,url2,url3;
    FloatingActionButton top;
    View scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante_italiano);

        url1 = findViewById(R.id.url1);
        url1.setOnClickListener(this);
        url2 = findViewById(R.id.url2);
        url2.setOnClickListener(this);
        url3 = findViewById(R.id.url3);
        url3.setOnClickListener(this);
        telf1 = findViewById(R.id.telf1);
        telf1.setOnClickListener(this);
        telf2 = findViewById(R.id.telf2);
        telf2.setOnClickListener(this);
        telf3 = findViewById(R.id.telf3);
        telf3.setOnClickListener(this);
        top = findViewById(R.id.top);
        top.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        ImageView img = (ImageView) v;
        FloatingActionButton fab = (FloatingActionButton) v;

        if(fab == top)
        {
            scrollView.setScrollY(0);
        }
        else if (img == url1)
        {
            String url = "https://www.pizzerialanostraisola.es/es/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }
        else if(img == url2)
        {
            String url = "https://il-colosseocerdanyola.metro.rest/?lang=es#menu";
            Intent i2 = new Intent(Intent.ACTION_VIEW);
            i2.setData(Uri.parse(url));
            startActivity(i2);
        }
        else if(img == url3)
        {
            String url = "https://www.galubcn.com/";
            Intent i3 = new Intent(Intent.ACTION_VIEW);
            i3.setData(Uri.parse(url));
            startActivity(i3);
        }
        else if(img == telf1)
        {
            Intent i11 = new Intent(Intent.ACTION_DIAL, Uri.parse("Tel: 935 64 39 93"));
            startActivity(i11);
        }
        else if(img == telf2)
        {
            Intent i21 = new Intent(Intent.ACTION_DIAL, Uri.parse("Tel: 930 27 31 17"));
            startActivity(i21);
        }
        else if(img == telf3)
        {
            Intent i31 = new Intent(Intent.ACTION_DIAL, Uri.parse("Tel: 931 15 02 75"));
            startActivity(i31);
        }
    }
}