package com.example.lenovo.adg_;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by Allan on 23-06-2017.
 */

public class EventRecyclerAdapter extends RecyclerView.Adapter<EventRecyclerAdapter.EventViewHolder> {
    LayoutInflater inflater;
    List<EventItem> data = Collections.emptyList();

    public EventRecyclerAdapter(Context context, List<EventItem> data) {
        inflater = LayoutInflater.from(context);
        this.data = data;
    }

    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.event_row_layout, parent, false);
        EventViewHolder holder = new EventViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(EventViewHolder holder, int position) {
        EventItem current = data.get(position);
        holder.Num.setText(current.num);
        holder.Name.setText(current.name);
        holder.Month.setText(current.mon);
    }

    @Override
    public int getItemCount() { return data.size(); }

    public class EventViewHolder extends RecyclerView.ViewHolder {
        TextView Num, Name, Month;

        public EventViewHolder(View itemView) {
            super(itemView);
            Num = (TextView) itemView.findViewById(R.id.eventNumber);
            Name = (TextView) itemView.findViewById(R.id.eventName);
            Month = (TextView) itemView.findViewById(R.id.eventMonth);
        }
    }
}
