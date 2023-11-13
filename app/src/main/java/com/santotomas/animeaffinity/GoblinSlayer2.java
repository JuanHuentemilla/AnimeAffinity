package com.santotomas.animeaffinity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GoblinSlayer2 extends AppCompatActivity {

    Button btnAtras8;

    private Button _btn_link3;
    String _url3 = "https://www1.otakustv.com/anime/goblin-slayer-ii";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goblin_slayer2);
        btnAtras8 = findViewById(R.id.btnAtras8);

        _btn_link3 = findViewById(R.id.btn_Link3);
        _btn_link3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri _link3 = Uri.parse(_url3);
                Log.d("click", "ok");
                Intent link3 = new Intent(Intent.ACTION_VIEW,_link3);
                startActivity(link3);
            }
        });

        btnAtras8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent atras8 = new Intent(GoblinSlayer2.this, MainActivity.class);
                startActivity(atras8);
            }
        });
    }
}