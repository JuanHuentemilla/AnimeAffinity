package com.santotomas.animeaffinity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Shingeki extends AppCompatActivity {

    Button btnAtras6;
    private Button _btn_link2;
    String _url2 = "https://www1.otakustv.com/anime/shingeki-no-kyojin-the-final-season-kanketsu-hen";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shingeki);
        btnAtras6 = findViewById(R.id.btnAtras6);
        _btn_link2 = findViewById(R.id.btn_Link2);

        _btn_link2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri _link2 = Uri.parse(_url2);
                Log.d("click", "ok");
                Intent link2 = new Intent(Intent.ACTION_VIEW,_link2);
                startActivity(link2);
            }
        });

        btnAtras6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Atras6 = new Intent(Shingeki.this, MainActivity.class);
                startActivity(Atras6);
            }
        });
    }
}