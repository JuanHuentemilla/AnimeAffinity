package com.santotomas.animeaffinity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class TateNoYuusha extends AppCompatActivity {

    Button btnAtras11;

    private Button _btn_link6;
    String _url6= "https://www1.otakustv.com/anime/tate-no-yuusha-no-nariagari-season-3";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tate_no_yuusha);
        btnAtras11 = findViewById(R.id.btnAtras11);
        _btn_link6 = findViewById(R.id.btn_Link6);

        _btn_link6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri _link6 = Uri.parse(_url6);
                Log.d("click", "ok");
                Intent link6 = new Intent(Intent.ACTION_VIEW,_link6);
                startActivity(link6);
            }
        });

        btnAtras11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent atras11 = new Intent(TateNoYuusha.this, MainActivity.class);
                startActivity(atras11);
            }
        });
    }
}