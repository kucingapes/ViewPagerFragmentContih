package com.utsman.kucingapes.viewpagerfragmentcontih;

import android.content.Context;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.chahinem.pageindicator.PageIndicator;
import com.shuhart.bubblepagerindicator.BubblePageIndicator;
import com.utsman.kucingapes.viewpagerfragmentcontih.Adapter.AdapterDua;
import com.utsman.kucingapes.viewpagerfragmentcontih.Adapter.AdapterSatu;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity {
    FragmentPagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Tajawal-ExtraLight.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
        final ViewPager viewPager = findViewById(R.id.viewpager);

        String slide = getIntent().getStringExtra("slide");

        if (slide.equals("slide1")) {
            pagerAdapter = new AdapterSatu(getSupportFragmentManager());
        }

        if (slide.equals("slide2")) {
            pagerAdapter = new AdapterDua(getSupportFragmentManager());
        }

        viewPager.setAdapter(pagerAdapter);

        BubblePageIndicator pageIndicator = findViewById(R.id.indicator);
        pageIndicator.setViewPager(viewPager);

        //tes

        // baahhh

    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

   /* private class MyAdapter extends FragmentPagerAdapter {

        public MyAdapter(FragmentManager supportFragmentManager) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return Satu.newInstance(String.valueOf(0), "halaman 1", "nah");
                case 1:
                    return Satu.newInstance(String.valueOf(1), "halaman 2", "dua");
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
    }*/
}
