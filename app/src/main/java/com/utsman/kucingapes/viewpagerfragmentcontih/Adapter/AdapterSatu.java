package com.utsman.kucingapes.viewpagerfragmentcontih.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.utsman.kucingapes.viewpagerfragmentcontih.Fragment.Dua;
import com.utsman.kucingapes.viewpagerfragmentcontih.R;
import com.utsman.kucingapes.viewpagerfragmentcontih.Fragment.Satu;
import com.utsman.kucingapes.viewpagerfragmentcontih.Fragment.Tiga;

public  class AdapterSatu extends FragmentPagerAdapter {
    public AdapterSatu(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return Satu.newInstance(String.valueOf(0), "halaman 1", "nah", R.color.hijau);
            case 1:
                return Satu.newInstance(String.valueOf(1), "halaman 2", "dua", R.color.kuning);///
            case 2:
                return Tiga.newInstance("6blHftCT3rE");
            case 3:
                return Tiga.newInstance("9_XmXbHCvfI");
            case 4:
                return Dua.newInstance(R.drawable.ic_launcher_background,
                        "Judul", "desktipsi dua");
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
