package com.utsman.kucingapes.viewpagerfragmentcontih.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.utsman.kucingapes.viewpagerfragmentcontih.Fragment.Dua;
import com.utsman.kucingapes.viewpagerfragmentcontih.R;
import com.utsman.kucingapes.viewpagerfragmentcontih.Fragment.Satu;

public class AdapterDua extends FragmentPagerAdapter {
    public AdapterDua(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return Satu.newInstance(String.valueOf(0), "halam 1", "slide dua nih", R.color.merah);
            case 1:
                return Dua.newInstance(
                        R.drawable.ic_launcher_foreground,
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
