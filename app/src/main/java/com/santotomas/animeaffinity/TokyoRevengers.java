package com.santotomas.animeaffinity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class TokyoRevengers extends AppCompatActivity {


    Button btnAtras10;

    private Button _btn_link5;
    String _url5 = "https://www1.otakustv.com/anime/tokyo-revengers-tenjiku-hen";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tokyo_revengers);
        btnAtras10 = findViewById(R.id.btnAtras10);
        _btn_link5 = findViewById(R.id.btn_link5);

        _btn_link5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri _link5 = Uri.parse(_url5);
                Log.d("click", "ok");
                Intent link5 = new Intent(Intent.ACTION_VIEW,_link5);
                startActivity(link5);
            }
        });

        btnAtras10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent atras10 = new Intent(TokyoRevengers.this,MainActivity.class);
                startActivity(atras10);
            }
        });
    }
}