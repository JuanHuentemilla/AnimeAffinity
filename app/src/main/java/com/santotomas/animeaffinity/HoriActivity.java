package com.santotomas.animeaffinity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class HoriActivity extends AppCompatActivity {

    Button btnAtras;

    private Button _btn_link7;
    String _url7 = "https://www1.otakustv.com/anime/horimiya-piece";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hori);
        btnAtras = findViewById(R.id.btn_atras2);
        _btn_link7 = findViewById(R.id.btn_Link7);

        _btn_link7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri _link7 = Uri.parse(_url7);
                Log.d("click", "ok");
                Intent link7 = new Intent(Intent.ACTION_VIEW,_link7);
                startActivity(link7);
            }
        });

        btnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent atras2 = new Intent(HoriActivity.this,MainActivity.class);
                startActivity(atras2);
            }
        });
    }
}