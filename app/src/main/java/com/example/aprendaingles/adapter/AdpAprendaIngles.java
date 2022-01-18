package com.example.aprendaingles.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.example.aprendaingles.fragments.FraBichos;
import com.example.aprendaingles.fragments.FraNumeros;

public class AdpAprendaIngles extends FragmentPagerAdapter {
    public AdpAprendaIngles(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FraBichos();
            case 1:
                return new FraNumeros();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
