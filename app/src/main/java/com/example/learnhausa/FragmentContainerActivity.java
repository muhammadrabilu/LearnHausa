package com.example.learnhausa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class FragmentContainerActivity extends AppCompatActivity {

    SectionPagerAdapter mSectionPagerAdater;
    private ViewPager mViewPager;
    private Toolbar toolbar;
    TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_container);
        setPagerAndToolbar();
    }

    private void setUpViewPager(ViewPager viewPager){
        SectionPagerAdapter adapter = new SectionPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new HomeFragment(), "Home");
        adapter.addFragment(new HistoryFragment(), "History");
        adapter.addFragment(new FavouriteFragment(), "Favourte");
        viewPager.setAdapter(adapter);
    }


    private void setPagerAndToolbar(){
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mSectionPagerAdater = new  SectionPagerAdapter(getSupportFragmentManager());

        mTabLayout = findViewById(R.id.tabs);
        mViewPager = findViewById(R.id.pager);

        setUpViewPager(mViewPager);

        mTabLayout.setupWithViewPager(mViewPager);
    }
}
