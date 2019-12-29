package com.example.aprendendoingls.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

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
    private ImageView imageCao;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Configurar ActionBar
        getSupportActionBar().setTitle("Aprenda Inglês");
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

    private void somDog(View view){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.dog);
        mediaPlayer.start();
    }
}
