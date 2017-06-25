package com.example.lenovo.adg_;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class FreeSlotsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_slots);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarFreeSlots);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Free Slots");
    }
}
