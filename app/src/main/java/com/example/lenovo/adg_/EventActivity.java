package com.example.lenovo.adg_;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerTabStrip;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class EventActivity extends AppCompatActivity {
    private TextView EventNum, EventName, EventMonth;
    private RecyclerView EventRecycler;
    private EventRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        //Initialization
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarEvent);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Event");
        EventNum = (TextView) findViewById(R.id.eventNumber);
        EventName = (TextView) findViewById(R.id.eventName);
        EventMonth = (TextView) findViewById(R.id.eventMonth);
        EventRecycler = (RecyclerView) findViewById(R.id.eventRecycler);
        adapter = new EventRecyclerAdapter(this, getData());
        EventRecycler.setAdapter(adapter);
        EventRecycler.setLayoutManager(new LinearLayoutManager(this));
    }

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

    private List<EventItem> getData() {
        List<EventItem> EventData = new ArrayList<>();
        String[] nums = {"1", "2", "3", "4"};
        String[] names = {"Game Of Thrones", "iOS fusion", "WAR", "Uni Dev"};
        String[] months = {"Feburary", "August", "November", "August"};
        for(int i = 0; i < months.length; i++) {
            EventItem Current = new EventItem();
            Current.num = nums[i];
            Current.name = names[i];
            Current.mon = months[i];
            EventData.add(Current);
        }
        return EventData;
    }
}
