package com.santotomas.animeaffinity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SpyXFamily extends AppCompatActivity {

    Button btnAtras9;

    private Button _btn_link4;
    String _url4 = "https://www1.otakustv.com/anime/spy-x-family-season-2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spy_xfamily);
        btnAtras9 = findViewById(R.id.btnAtras9);
        _btn_link4 = findViewById(R.id.btn_Link4);

        _btn_link4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri _link4 = Uri.parse(_url4);
                Log.d("click", "ok");
                Intent link4 = new Intent(Intent.ACTION_VIEW,_link4);
                startActivity(link4);
            }
        });

        btnAtras9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent atras9 = new Intent(SpyXFamily.this, MainActivity.class);
                startActivity(atras9);
            }
        });
    }
}