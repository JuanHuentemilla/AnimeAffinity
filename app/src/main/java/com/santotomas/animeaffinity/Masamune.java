package com.santotomas.animeaffinity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Masamune extends AppCompatActivity {

    Button btnMasamune;
    private Button _btn_link9;
    String _url9 = "https://www1.otakustv.com/anime/masamune-kun-no-revenge-r";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masamune);
        btnMasamune = findViewById(R.id.btnAtras4);
        _btn_link9 = findViewById(R.id.btn_Link9);

        _btn_link9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri _link9 = Uri.parse(_url9);
                Log.d("click", "ok");
                Intent link9 = new Intent(Intent.ACTION_VIEW,_link9);
                startActivity(link9);
            }
        });

        btnMasamune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent masamune = new Intent(Masamune.this,MainActivity.class);
                startActivity(masamune);
            }
        });
    }
}