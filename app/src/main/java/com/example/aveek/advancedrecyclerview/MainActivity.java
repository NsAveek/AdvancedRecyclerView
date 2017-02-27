package com.example.aveek.advancedrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.aveek.advancedrecyclerview.model.ItemTemplate;
import com.example.aveek.advancedrecyclerview.util.DataProducer;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private DataProducer dataProducer;
    ArrayList<ItemTemplate> dataSet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    private void init(){

        dataProducer = new DataProducer();
        dataSet = dataProducer.getDataSet();


    }
}
