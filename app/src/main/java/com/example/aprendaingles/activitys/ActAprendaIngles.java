package com.example.aprendaingles.activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.aprendaingles.R;
import com.example.aprendaingles.adapter.AdpAprendaIngles;
import com.google.android.material.tabs.TabLayout;

public class ActAprendaIngles extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_aprenda_ingles);

        tabLayout = findViewById(R.id.act_aprenda_ingles_tl_tab_layout);
        viewPager = findViewById(R.id.act_aprenda_ingles_vp_view_pager);

        viewPager.setAdapter(new AdpAprendaIngles(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setText("Bichos");
        tabLayout.getTabAt(1).setText("Numeros");
    }
}