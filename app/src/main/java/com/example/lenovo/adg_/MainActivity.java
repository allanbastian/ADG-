package com.example.lenovo.adg_;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarMain);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("ADG Internal");
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
            case R.id.freeSlot: Intent FreeSlotsIntent = new Intent(this, FreeSlotsActivity.class);
                                startActivity(FreeSlotsIntent);
                                return true;
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
