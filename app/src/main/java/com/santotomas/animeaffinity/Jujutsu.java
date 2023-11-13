package com.santotomas.animeaffinity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Jujutsu extends AppCompatActivity {

    Button btnJujutsu;
    private Button _btn_link8;
    String _url8 = "https://www1.otakustv.com/anime/jujutsu-kaisen-2nd-season";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jujutsu);
        btnJujutsu = findViewById(R.id.btnAtras3);
        _btn_link8 = findViewById(R.id.btn_Link8);

        _btn_link8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri _link8 = Uri.parse(_url8);
                Log.d("click", "ok");
                Intent link8 = new Intent(Intent.ACTION_VIEW,_link8);
                startActivity(link8);
            }
        });

        btnJujutsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jujutsu = new Intent(Jujutsu.this,MainActivity.class);
                startActivity(jujutsu);
            }
        });
    }
}