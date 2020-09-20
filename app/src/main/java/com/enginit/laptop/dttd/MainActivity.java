package com.enginit.laptop.dttd;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private AdView mAdView;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                Log.i("AdLoaded", "Success!");
            }
            @Override
            public void onAdFailedToLoad(int i) {
                super.onAdFailedToLoad(i);
                Log.i("AdFailed", Integer.toString(i));
            }
        });
        mAdView.loadAd(adRequest);

        Log.d(TAG, "onCreate: Starting...");

        // Set up the ViewPager with the sections adapter
        mViewPager = findViewById(R.id.container);

        setupViewPager(mViewPager);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }

    private void setupViewPager(ViewPager viewPager){
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new CalFrag(),"TÍNH TOÁN");
        adapter.addFragment(new SearchFrag(), "TRA BẢNG");
        adapter.addFragment(new NoteFrag(), "CHÚ THÍCH");

        viewPager.setAdapter(adapter);
    }
}
