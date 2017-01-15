package com.example.android.samplelayout;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.List;

/**
 * Created by Fatima Mostafa on 15-Jan-17.
 */

public class CustomRecyclerAdapter extends RecyclerView.Adapter<CustomRecyclerAdapter.ViewHolder> implements View.OnClickListener {

    private List<Item> items;
    private int itemLayout;


    public CustomRecyclerAdapter(List<Item> items, int itemLayout) {
        this.items = items;
        this.itemLayout = itemLayout;
    }

    @Override public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(itemLayout, parent, false);
        v.setOnClickListener(this);
        return new ViewHolder(v);
    }

    @Override public void onBindViewHolder(final ViewHolder holder, int position) {
        final Item item = items.get(position);
        holder.itemView.setTag(item);
        holder.itemButton.setText(item.getName());
        holder.itemButton.setTextColor(Color.parseColor(item.getTextColor()));
        holder.itemButton.setBackgroundColor(Color.parseColor(item.getBackgroundColor()));
        ViewGroup.LayoutParams params = holder.itemButton.getLayoutParams();
        float factor = holder.itemView.getContext().getResources().getDisplayMetrics().density;
        params.width = (int)(item.getWidth() * factor);
        params.height = (int)(item.getHeight() * factor);
        holder.itemButton.setLayoutParams(params);

    }

    @Override public int getItemCount() {
        return items.size();
    }

    @Override public void onClick(View view) {

    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public Button itemButton;

        public ViewHolder(View itemView) {
            super(itemView);
            itemButton = (Button) itemView.findViewById(R.id.itemButton);
        }
    }
}