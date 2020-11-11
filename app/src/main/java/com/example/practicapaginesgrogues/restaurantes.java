package com.example.practicapaginesgrogues;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class restaurantes extends AppCompatActivity implements View.OnClickListener {
    TextView url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);

        url = findViewById(R.id.url);
        url.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        TextView tv = (TextView) v;

        if (tv == url)
        {
            String url = "https://elcellerdejabugo.com/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }

    }
}