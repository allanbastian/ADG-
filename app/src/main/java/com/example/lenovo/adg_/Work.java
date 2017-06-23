package com.example.lenovo.adg_;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

/**
 * Created by Allan on 22-06-2017.
 */

public class Work extends AppCompatActivity {
    private TextView Event, DateTime, Venue;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.work);
        //Initalization
        Event = (TextView) findViewById(R.id.txt1);
        DateTime = (TextView) findViewById(R.id.txt2);
        Venue = (TextView) findViewById(R.id.txt3);
        viewPager = (ViewPager) findViewById(R.id.pager);
        myFragmentPagerAdapter adapter = new myFragmentPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        TabLayout tabs = (TabLayout) findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Work");
        //getting details of the Event
        Event = getEvent();
        setEvent(Event);
        DateTime = getDateTime();
        setDateTime(DateTime);
        Venue = getVenue();
        setVenue(Venue);
    }

    public TextView getEvent() { return Event; }

    public void setEvent(TextView event) { Event = event; }

    public TextView getDateTime() { return DateTime; }

    public void setDateTime(TextView dateTime) { DateTime = dateTime; }

    public TextView getVenue() { return Venue; }

    public void setVenue(TextView venue) { Venue = venue;}
}
