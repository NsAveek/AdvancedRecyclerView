package com.example.aveek.advancedrecyclerview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.example.aveek.advancedrecyclerview.model.ItemTemplate;

import java.util.ArrayList;

/**
 * Created by Aveek on 24/02/2017.
 */

public class MultipleViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements AdapterView.OnItemClickListener {
    private ArrayList<ItemTemplate> itemTemplates = new ArrayList<>();
    private Context mContext;

    public MultipleViewAdapter (Context context, ArrayList<ItemTemplate> templateArrayList){
        this.itemTemplates = templateArrayList;
        this.mContext = context;
    }
    public MultipleViewAdapter(){

    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return itemTemplates.size();
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}
