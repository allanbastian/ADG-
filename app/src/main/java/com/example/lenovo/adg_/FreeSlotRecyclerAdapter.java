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
 * Created by Lenovo on 29-06-2017.
 */

public class FreeSlotRecyclerAdapter extends RecyclerView.Adapter<FreeSlotRecyclerAdapter.FreeSlotViewHolder> {
    LayoutInflater inflater;
    List<FreeSlotItem> data = Collections.emptyList();

    public FreeSlotRecyclerAdapter(Context context, List<FreeSlotItem> data) {
        inflater.from(context);
        this.data = data;
    }

    @Override
    public FreeSlotViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.free_slot_row_layout, parent, false);
        FreeSlotViewHolder holder = new FreeSlotViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(FreeSlotViewHolder holder, int position) {
        FreeSlotItem current = data.get(position);
        holder.Name.setText(current.Name);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class FreeSlotViewHolder extends RecyclerView.ViewHolder {
        TextView Name;

        public FreeSlotViewHolder(View itemView) {
            super(itemView);
            Name = (TextView) itemView.findViewById(R.id.FullName);
        }
    }
}

