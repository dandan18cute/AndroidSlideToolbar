package com.ckt.test.androidslidetoolbar;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ArrayList<String> titleList = new ArrayList<String>(){{
        add("google drive");
        add("google+");
        add("google play");
    }};
    private ArrayList<Fragment> fragmentList = new ArrayList<Fragment>(){{
        add(new OneFragment());
        add(new TwoFragment());
        add(new ThreeFragment());
    }};
    private TabLayout tlMain;
    private ViewPager vpMain;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initviews();
        adapter = new MyAdapter(getSupportFragmentManager(),titleList,fragmentList);
        vpMain.setAdapter(adapter);
        tlMain.setupWithViewPager(vpMain,true);
        tlMain.setTabsFromPagerAdapter(adapter);
    }

    private void initviews() {
        tlMain = (TabLayout) findViewById(R.id.tlMain);
        vpMain = (ViewPager)findViewById(R.id.vpMain);
    }
}