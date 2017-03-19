package com.example.aveek.advancedrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.aveek.advancedrecyclerview.adapter.MultipleViewAdapter;
import com.example.aveek.advancedrecyclerview.model.ItemTemplate;
import com.example.aveek.advancedrecyclerview.util.DataProducer;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private DataProducer dataProducer;
    private RecyclerView multipleView;
    private MultipleViewAdapter mAdapter;
    private LinearLayoutManager mLayoutManager;
    ArrayList<ItemTemplate> dataSet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        initRecycler();

    }

    private void init(){

        dataProducer = new DataProducer();
        dataSet = dataProducer.getDataSet();


    }
    private void initRecycler(){
        multipleView = (RecyclerView)findViewById(R.id.multipleRecyclerView);
        mAdapter = new MultipleViewAdapter(this,dataSet);
        mLayoutManager = new LinearLayoutManager(this);
        multipleView.setAdapter(mAdapter);
        multipleView.setLayoutManager(mLayoutManager);
    }
}
