package com.example.lenovo.adg_;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class FreeSlotsActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TextView First, Last;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_slots);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarFreeSlots);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Free Slots");
        viewPager = (ViewPager) findViewById(R.id.freeSlotPager);
        FreeSlotFragementAdapter adapter = new FreeSlotFragementAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        TabLayout tabs = (TabLayout) findViewById(R.id.tabsDays);
        TabLayout tabs2 = (TabLayout) findViewById(R.id.tabsFree);
        tabs.setupWithViewPager(viewPager);
    }

}
