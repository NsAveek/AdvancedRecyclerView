package com.example.aveek.advancedrecyclerview.enums;

/**
 * Created by Aveek on 19/03/2017.
 */

public enum DataSet {


    FOOD("Food"), FASHION("Men's fashion");

    private String itemType;

    DataSet(String itemType) {
        this.itemType = itemType;
    }

    public String itemType() {
        return itemType;
    }
}
