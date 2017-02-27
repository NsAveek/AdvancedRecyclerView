package com.example.aveek.advancedrecyclerview.model;

import java.util.ArrayList;

/**
 * Created by Aveek on 24/02/2017.
 */

public class ItemTemplate {
    private int id;
    private String itemTitle;
    private String itemType;
    private ArrayList<SubItemTemplate> subItemList;

    public ItemTemplate(){}

    public ItemTemplate(int id, String itemTitle, String itemType, ArrayList<SubItemTemplate> subItemList){

        this.setId(id);
        this.setItemTitle(itemTitle);
        this.setItemType(itemType);
        this.setSubItemList(subItemList);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public ArrayList<SubItemTemplate> getSubItemList() {
        return subItemList;
    }

    public void setSubItemList(ArrayList<SubItemTemplate> subItemList) {
        this.subItemList = subItemList;
    }



}
