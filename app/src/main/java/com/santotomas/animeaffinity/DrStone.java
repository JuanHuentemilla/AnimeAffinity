package com.santotomas.animeaffinity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class DrStone extends AppCompatActivity {

    Button btnAtras7;

    private Button _btn_Link;

    String _url = "https://www1.otakustv.com/anime/dr-stone-new-world";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dr_stone);
        btnAtras7 = findViewById(R.id.btnAtras7);

        _btn_Link = findViewById(R.id.btn_link);

        _btn_Link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri _link = Uri.parse(_url);
                Log.d("click", "ok");
                Intent link = new Intent(Intent.ACTION_VIEW,_link);
                startActivity(link);
            }
        });

        btnAtras7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent atras7 = new Intent(DrStone.this, MainActivity.class);
                startActivity(atras7);
            }
        });
    }
}