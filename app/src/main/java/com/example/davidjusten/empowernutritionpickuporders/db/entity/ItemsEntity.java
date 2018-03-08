package com.example.davidjusten.empowernutritionpickuporders.db.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by davidjusten on 3/7/18.
 */

@Entity
//        (indices = {@Index(value = {"q_map_id"},
//        unique = true)})
public class ItemsEntity {

    @PrimaryKey(autoGenerate = true)
    public int _id;
    public int mType;
    public String mItemName;
    public double mPrice;
    public String mImagePath;
    public String mTextColor;
    public String mDescrBgColor;


    public ItemsEntity(int type, String itemName, double price, String imagePath, String textColor, String descrBgColor){
        mType = type;
        mItemName = itemName;
        mPrice = price;
        mImagePath = imagePath;
        mTextColor = textColor;
        mDescrBgColor = descrBgColor;

    }


    public int getmType() {
        return mType;
    }

    public void setmType(int mType) {
        this.mType = mType;
    }

    public String getmItemName() {
        return mItemName;
    }

    public void setmItemName(String mItemName) {
        this.mItemName = mItemName;
    }

    public double getmPrice() {
        return mPrice;
    }

    public void setmPrice(double mPrice) {
        this.mPrice = mPrice;
    }

    public String getmImagePath() {
        return mImagePath;
    }

    public void setmImagePath(String mImagePath) {
        this.mImagePath = mImagePath;
    }

    public String getmTextColor() {
        return mTextColor;
    }

    public void setmTextColor(String mTextColor) {
        this.mTextColor = mTextColor;
    }

    public String getmDescrBgColor() {
        return mDescrBgColor;
    }

    public void setmDescrBgColor(String mDescrBgColor) {
        this.mDescrBgColor = mDescrBgColor;
    }

    public int get_id() {
        return _id;
    }
}



