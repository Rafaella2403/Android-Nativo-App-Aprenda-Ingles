package com.example.aprendaingles.fragments;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.aprendaingles.R;

public class FraNumeros extends Fragment implements View.OnClickListener {

    private ImageButton ibUm;
    private ImageButton ibDois;
    private ImageButton ibTres;
    private ImageButton ibQuatro;
    private ImageButton ibCinco;
    private ImageButton ibSeis;
    private MediaPlayer mediaPlayer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fra_numeros, container, false);

        ibUm = view.findViewById(R.id.fra_numeros_tv_um);
        ibDois = view.findViewById(R.id.fra_numeros_tv_dois);
        ibTres = view.findViewById(R.id.fra_numeros_tv_tres);
        ibQuatro = view.findViewById(R.id.fra_numeros_tv_quatro);
        ibCinco = view.findViewById(R.id.fra_numeros_tv_cinco);
        ibSeis = view.findViewById(R.id.fra_numeros_tv_seis);

        ibUm.setOnClickListener(this);
        ibDois.setOnClickListener(this);
        ibTres.setOnClickListener(this);
        ibQuatro.setOnClickListener(this);
        ibCinco.setOnClickListener(this);
        ibSeis.setOnClickListener(this);

        return view;
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.fra_numeros_tv_um:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.one);
                tocar();
                break;
            case R.id.fra_numeros_tv_dois:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.two);
                tocar();
                break;
            case R.id.fra_numeros_tv_tres:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.three);
                tocar();
                break;
            case R.id.fra_numeros_tv_quatro:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.four);
                tocar();
                break;
            case R.id.fra_numeros_tv_cinco:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.five);
                tocar();
                break;
            case R.id.fra_numeros_tv_seis:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.six);
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