package com.example.practicapaginesgrogues;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class restauranteJapo extends AppCompatActivity implements View.OnClickListener {
    ImageView telf1,telf2,telf3,url1,url2,url3,ubi1,ubi2,ubi3;
    FloatingActionButton top;
    View scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante_japo);

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
        ubi1 = findViewById(R.id.ubi1);
        ubi1.setOnClickListener(this);
        ubi2 = findViewById(R.id.ubi2);
        ubi2.setOnClickListener(this);
        ubi3 = findViewById(R.id.ubi3);
        ubi3.setOnClickListener(this);
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
            String url = "https://www.facebook.com/KoySushiBar/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }
        else if(img == url2)
        {
            String url = "https://restaurant-japones-kanagawa.business.site/";
            Intent i2 = new Intent(Intent.ACTION_VIEW);
            i2.setData(Uri.parse(url));
            startActivity(i2);
        }
        else if(img == url3)
        {
            String url = "https://www.guiavalles.com/cerdanyola-del-valles/restaurante-japones-osaka.html";
            Intent i3 = new Intent(Intent.ACTION_VIEW);
            i3.setData(Uri.parse(url));
            startActivity(i3);
        }
        else if(img == telf1)
        {
            Intent i11 = new Intent(Intent.ACTION_DIAL, Uri.parse("Tel: 930 15 52 83"));
            startActivity(i11);
        }
        else if(img == telf2)
        {
            Intent i21 = new Intent(Intent.ACTION_DIAL, Uri.parse("Tel: 930 38 25 50"));
            startActivity(i21);
        }
        else if(img == telf3)
        {
            Intent i31 = new Intent(Intent.ACTION_DIAL, Uri.parse("Tel: 936 91 83 75"));
            startActivity(i31);
        }
        else if(img == ubi1)
        {
            String url = "https://goo.gl/maps/bGVCxzwz6czeAev79";
            Intent i12 = new Intent(Intent.ACTION_VIEW);
            i12.setData(Uri.parse(url));
            startActivity(i12);
        }
        else if(img == ubi2)
        {
            String url = "https://goo.gl/maps/WfHuacWTRunBD2bXA";
            Intent i22 = new Intent(Intent.ACTION_VIEW);
            i22.setData(Uri.parse(url));
            startActivity(i22);
        }
        else if(img == ubi3)
        {
            String url = "https://goo.gl/maps/72FJgPxP5nn7DoGv7";
            Intent i32 = new Intent(Intent.ACTION_VIEW);
            i32.setData(Uri.parse(url));
            startActivity(i32);
        }
    }
}