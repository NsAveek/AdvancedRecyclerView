package com.example.aveek.advancedrecyclerview.util;

import com.example.aveek.advancedrecyclerview.model.ItemTemplate;
import com.example.aveek.advancedrecyclerview.model.SubItemTemplate;

import java.util.ArrayList;

/**
 * Created by Aveek on 24/02/2017.
 */

public class DataProducer {

    public ArrayList<ItemTemplate> getDataSet(){

        ArrayList<ItemTemplate> newTemplate = new ArrayList<>();

        SubItemTemplate subItem1 = new SubItemTemplate(1,"Beef","Fresh australian beef");
        SubItemTemplate subItem2 = new SubItemTemplate(2,"Chicken","Fresh Pakistani chicken");
        SubItemTemplate subItem3 = new SubItemTemplate(3,"Lamb","Fresh Malaysian lamb");

        ArrayList<SubItemTemplate> subItemTemplate1 = new ArrayList<>();
        subItemTemplate1.add(subItem1);
        subItemTemplate1.add(subItem2);
        subItemTemplate1.add(subItem3);

        SubItemTemplate subItem4 = new SubItemTemplate(4,"Jeans","Men only");
        SubItemTemplate subItem5 = new SubItemTemplate(5,"Shirt","Men only");
        SubItemTemplate subItem6 = new SubItemTemplate(6,"Shoes","Men only");

        ArrayList<SubItemTemplate> subItemTemplate2 = new ArrayList<>();
        subItemTemplate2.add(subItem4);
        subItemTemplate2.add(subItem5);
        subItemTemplate2.add(subItem6);

        ItemTemplate anItemTemplate = new ItemTemplate(1,"Meat","Food",subItemTemplate1);
        ItemTemplate anItemTemplate2 = new ItemTemplate(2,"Clothes","Men's fashion",subItemTemplate1);

        newTemplate.add(anItemTemplate);
        newTemplate.add(anItemTemplate2);

        return newTemplate;

    }

}
