package com.example.aprendendoingls.actvity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.aprendendoingls.R;
import com.example.aprendendoingls.fragment.AnimaisFragment;
import com.example.aprendendoingls.fragment.NumerosFragment;
import com.example.aprendendoingls.fragment.VogaisFragment;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItem;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(),
                FragmentPagerItems.with(this )
                .add(R.string.animais, AnimaisFragment.class)
                .add(R.string.numeros, NumerosFragment.class)
                .add(R.string.vogais, VogaisFragment.class)
                .create()
        );
    }
}
