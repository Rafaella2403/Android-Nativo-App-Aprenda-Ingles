package com.example.aprendaingles.fragments;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

import com.example.aprendaingles.R;

public class FraBichos extends Fragment implements View.OnClickListener{

    private ImageButton ibCao;
    private ImageButton ibGato;
    private ImageButton ibLeao;
    private ImageButton ibMacaco;
    private ImageButton ibOvelha;
    private ImageButton ibVaca;
    private MediaPlayer mediaPlayer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fra_bichos, container, false);

        ibCao = view.findViewById(R.id.fra_bichos_cao);
        ibGato = view.findViewById(R.id.fra_bichos_gato);
        ibLeao = view.findViewById(R.id.fra_bichos_leao);
        ibMacaco = view.findViewById(R.id.fra_bichos_macaco);
        ibOvelha = view.findViewById(R.id.fra_bichos_ovelha);
        ibVaca = view.findViewById(R.id.fra_bichos_vaca);

        ibCao.setOnClickListener(this);
        ibGato.setOnClickListener(this);
        ibLeao.setOnClickListener(this);
        ibMacaco.setOnClickListener(this);
        ibOvelha.setOnClickListener(this);
        ibVaca.setOnClickListener(this);

        return view;
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.fra_bichos_cao:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.dog);
                tocar();
                break;
            case R.id.fra_bichos_gato:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.cat);
                tocar();
                break;
            case R.id.fra_bichos_leao:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.lion);
                tocar();
                break;
            case R.id.fra_bichos_macaco:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.monkey);
                tocar();
                break;
            case R.id.fra_bichos_ovelha:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.sheep);
                tocar();
                break;
            case R.id.fra_bichos_vaca:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.cow);
                tocar();
                break;
        }
    }

    public void tocar(){
        if(mediaPlayer != null){
            mediaPlayer.start();

            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    mediaPlayer.release();
                }
            });
        }
    }
}