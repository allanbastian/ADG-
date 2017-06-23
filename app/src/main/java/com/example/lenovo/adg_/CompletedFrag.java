package com.example.lenovo.adg_;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Allan on 22-06-2017.
 */

public class CompletedFrag extends android.support.v4.app.Fragment {
    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.completed_frag, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.completedList);
        adapter = new RecyclerAdapter(getActivity(), getData());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return rootView;
    }

    private List<WorkItem> getData() {
        List<WorkItem> data = new ArrayList<>();
        String[] dates = {"DD/MM/YY", "DD/MM/YY", "DD/MM/YY", "DD/MM/YY", "DD/MM/YY", "DD/MM/YY", "DD/MM/YY",};
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String[] names = {"Name of the member", "Name of the member", "Name of the member", "Name of the member", "Name of the member", "Name of the member", "Name of the member"};
        String[] tasks = {"Task allotted", "Task allotted", "Task allotted", "Task allotted", "Task allotted", "Task allotted", "Task allotted"};
        for(int i = 0; i < tasks.length; i++) {
            WorkItem current = new WorkItem();
            current.Date = dates[i];
            current.Day = days[i];
            current.Work = tasks[i];
            current.Name = names[i];
            data.add(current);
        }
        return data;
    }
}
