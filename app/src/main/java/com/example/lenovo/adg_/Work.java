package com.example.lenovo.adg_;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.attendance: return true;
            case R.id.freeSlot: return true;
            case R.id.projects: return true;
            case R.id.events:   Intent EventIntent = new Intent(this, EventActivity.class);
                                startActivity(EventIntent);
                                return true;
            case R.id.meetings: return true;
            case R.id.work: Intent intent = new Intent(this, Work.class);
                            startActivity(intent);
                            return true;
            default: return false;
        }
    }
}
