package com.santotomas.animeaffinity;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class InicioFragment extends Fragment {

    ImageButton btnImg;

    ImageButton btnImg2;

    ImageButton btnImg3;

    ImageButton btnImg4;

    ImageButton btnShingeki;

    ImageButton btnDrStone;

    ImageButton btnGoblinSlayer;

    ImageButton btnSpyxFamily;

    ImageButton btnTokyoRevengers;

    ImageButton btnTateNoYuusha;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_inicio, container, false);

        btnImg = (ImageButton) rootView.findViewById(R.id.img_hori);
        btnImg2 = (ImageButton) rootView.findViewById(R.id.img_jujutsu);
        btnImg3 = (ImageButton) rootView.findViewById(R.id.img_masamune);
        btnImg4 = (ImageButton) rootView.findViewById(R.id.img_onepiece);
        btnShingeki = (ImageButton) rootView.findViewById(R.id.imgShingeki);
        btnDrStone = (ImageButton) rootView.findViewById(R.id.imgDrStone);
        btnGoblinSlayer = (ImageButton) rootView.findViewById(R.id.img_goblinslayer);
        btnSpyxFamily = (ImageButton) rootView.findViewById(R.id.img_spyxfamily);
        btnTokyoRevengers = (ImageButton) rootView.findViewById(R.id.img_tokyoRevengers);
        btnTateNoYuusha = (ImageButton) rootView.findViewById(R.id.img_TateNoYuusha);

        btnImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(requireContext(), HoriActivity.class);
                startActivity(intent);
            }
        });

        btnImg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jujutsu = new Intent(requireContext(), Jujutsu.class);
                startActivity(jujutsu);
            }
        });

        btnImg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masamune = new Intent(requireContext(), Masamune.class);
                startActivity(masamune);
            }
        });

        btnImg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent onepiece = new Intent(requireContext(), OnePiece.class);
                startActivity(onepiece);
            }
        });

        btnShingeki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shingeki = new Intent(requireContext(), Shingeki.class);
                startActivity(shingeki);
            }
        });

        btnDrStone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent drstone = new Intent(requireContext(), DrStone.class);
                startActivity(drstone);
            }
        });

        btnGoblinSlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goblin = new Intent(requireContext(), GoblinSlayer2.class);
                startActivity(goblin);
            }
        });

        btnSpyxFamily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent spy = new Intent(requireContext(), SpyXFamily.class);
                startActivity(spy);
            }
        });

        btnTateNoYuusha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tate = new Intent(requireContext(), TateNoYuusha.class);
                startActivity(tate);
            }
        });

        btnTokyoRevengers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tokyo = new Intent(requireContext(), TokyoRevengers.class);
                startActivity(tokyo);
            }
        });

        return rootView;

    }
}