package com.utsman.kucingapes.viewpagerfragmentcontih;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.utsman.kucingapes.viewpagerfragmentcontih.Fragment.Dua;
import com.utsman.kucingapes.viewpagerfragmentcontih.Fragment.Satu;

public class SlideDua extends AppCompatActivity {
    FragmentPagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_dua);
        ViewPager viewPager = findViewById(R.id.slide2pager);
        pagerAdapter = new PagerAdapterDua(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
    }

    private class PagerAdapterDua extends FragmentPagerAdapter {
        public PagerAdapterDua(FragmentManager supportFragmentManager) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return Satu.newInstance(String.valueOf(0), "halam 1", "slide dua nih", R.color.hijau);
                case 1:
                    return Dua.newInstance(R.drawable.ic_launcher_foreground,
                            "Judulnya", "jbckbdvsjk");
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 2;
        }
    }
}
