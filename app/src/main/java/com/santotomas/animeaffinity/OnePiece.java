package com.santotomas.animeaffinity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class OnePiece extends AppCompatActivity {

    Button btnAtrasone;
    private Button _btn_link10;
    String _url10 = "https://www1.otakustv.com/anime/one-piece";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_piece);
        btnAtrasone = findViewById(R.id.btnAtras5);
        _btn_link10 = findViewById(R.id.btn_Link10);

        _btn_link10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri _link10 = Uri.parse(_url10);
                Log.d("click", "ok");
                Intent link10 = new Intent(Intent.ACTION_VIEW,_link10);
                startActivity(link10);
            }
        });

        btnAtrasone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent onepiece = new Intent(OnePiece.this,MainActivity.class);
                startActivity(onepiece);
            }
        });


    }
}