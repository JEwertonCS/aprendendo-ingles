package com.example.aprendendoingls.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.aprendendoingls.R;
import com.example.aprendendoingls.fragment.AnimaisFragment;
import com.example.aprendendoingls.fragment.NumerosFragment;
import com.example.aprendendoingls.fragment.VogaisFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private SmartTabLayout smartTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Configurar ActionBar
//        getSupportActionBar().setTitle("YouTube");
        getSupportActionBar().setElevation(0);

        viewPager = findViewById(R.id.viewPager);
        smartTabLayout = findViewById(R.id.smartTabLayout);

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                .add(R.string.animais, AnimaisFragment.class)
                .add(R.string.numeros, NumerosFragment.class)
                .add(R.string.vogais, VogaisFragment.class)
                .create()
        );

        viewPager.setAdapter( adapter );
        smartTabLayout.setViewPager( viewPager );
    }
}
