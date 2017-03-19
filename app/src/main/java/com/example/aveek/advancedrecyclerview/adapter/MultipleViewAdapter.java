package com.example.aveek.advancedrecyclerview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.example.aveek.advancedrecyclerview.R;
import com.example.aveek.advancedrecyclerview.model.ItemTemplate;
import com.example.aveek.advancedrecyclerview.viewHolder.FashionViewHolder;
import com.example.aveek.advancedrecyclerview.viewHolder.FoodViewHolder;

import java.util.ArrayList;

import static com.example.aveek.advancedrecyclerview.enums.DataSet.FASHION;
import static com.example.aveek.advancedrecyclerview.enums.DataSet.FOOD;

/**
 * Created by Aveek on 24/02/2017.
 */

public class MultipleViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements AdapterView.OnItemClickListener {
    private ArrayList<ItemTemplate> itemTemplates = new ArrayList<>();
    private Context mContext;
    private int typeFood = 1;
    private int typeFashion = 2;


    public MultipleViewAdapter (Context context, ArrayList<ItemTemplate> templateArrayList){
        this.itemTemplates = templateArrayList;
        this.mContext = context;
    }
    public MultipleViewAdapter(){

    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView;
        RecyclerView.ViewHolder viewHolder = null;
        if (viewType == typeFood){
            itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food, parent, false);
            viewHolder = new FoodViewHolder(mContext,itemView);
        }else if (viewType == typeFashion){
            itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_fashion, parent, false);
            viewHolder = new FashionViewHolder(mContext,itemView);
        }else{

        }
        return viewHolder;
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

    @Override
    public int getItemViewType(int position) {
        if (itemTemplates.get(position).getItemType().equals(FOOD.itemType().toString())) {
            return typeFood;
        }else if (itemTemplates.get(position).getItemType().equals(FASHION.itemType().toString())){
            return typeFashion;
        }
        return super.getItemViewType(position);
    }
}
