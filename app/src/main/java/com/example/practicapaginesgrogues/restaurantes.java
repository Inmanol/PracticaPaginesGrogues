package com.example.practicapaginesgrogues;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class restaurantes extends AppCompatActivity implements View.OnClickListener {
    TextView url1,url2,url3,telf1,telf2,telf3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);

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

    }

    @Override
    public void onClick(View v) {
        TextView tv = (TextView) v;

        if (tv == url1)
        {
            String url = "https://elcellerdejabugo.com/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }
        else if(tv == url2)
        {
            String url = "https://www.3focs.com/";
            Intent i2 = new Intent(Intent.ACTION_VIEW);
            i2.setData(Uri.parse(url));
            startActivity(i2);
        }
        else if(tv == url3)
        {
            String url = "https://www.canxurrades.com/";
            Intent i3 = new Intent(Intent.ACTION_VIEW);
            i3.setData(Uri.parse(url));
            startActivity(i3);
        }
        else if(tv == telf1)
        {
            Intent i11 = new Intent(Intent.ACTION_DIAL, Uri.parse("Tel: 93 870 96 00"));
            startActivity(i11);
        }
        else if(tv == telf2)
        {
            Intent i21 = new Intent(Intent.ACTION_DIAL, Uri.parse("Tel: 931 16 49 97"));
            startActivity(i21);
        }
        else if(tv == telf3)
        {
            Intent i31 = new Intent(Intent.ACTION_DIAL, Uri.parse("Tel: 932 18 73 70"));
            startActivity(i31);
        }

    }
}