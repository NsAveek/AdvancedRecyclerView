package com.example.aveek.advancedrecyclerview.model;

/**
 * Created by Aveek on 24/02/2017.
 */

public class SubItemTemplate{

    private int subItemId;
    private String subItemTitle;
    private String subItemDescription;

    public SubItemTemplate(){}

    public SubItemTemplate(int id, String subItemTitle, String subItemDescription){
        this.subItemId = id;
        this.subItemTitle = subItemTitle;
        this.subItemDescription = subItemDescription;
    }

    public int getSubItemId() {
        return subItemId;
    }

    public void setSubItemId(int subItemId) {
        this.subItemId = subItemId;
    }

    public String getSubItemTitle() {
        return subItemTitle;
    }

    public void setSubItemTitle(String subItemTitle) {
        this.subItemTitle = subItemTitle;
    }

    public String getSubItemDescription() {
        return subItemDescription;
    }

    public void setSubItemDescription(String subItemDescription) {
        this.subItemDescription = subItemDescription;
    }

}