package com.example.davidjusten.empowernutritionpickuporders.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by davidjusten on 3/7/18.
 */

public class MainOrderRecycleAdapter extends RecyclerView.Adapter<MainOrderRecycleAdapter.MainOrderViewHolder> {

    private Context mContext;

    @Override
    public MainOrderViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(MainOrderViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MainOrderViewHolder extends RecyclerView.ViewHolder{


        public MainOrderViewHolder(View itemView) {
            super(itemView);
        }
    }
}
