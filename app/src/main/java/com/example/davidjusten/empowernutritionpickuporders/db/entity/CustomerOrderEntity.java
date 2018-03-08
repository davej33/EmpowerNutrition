package com.example.davidjusten.empowernutritionpickuporders.db.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by davidjusten on 3/7/18.
 */

@Entity
public class CustomerOrderEntity {

    @PrimaryKey(autoGenerate = true)
    public int _id;
    public int mItem_id;
    public int mQuantity;
    public long mOrder_time;
    public String mNotes;

    public CustomerOrderEntity(int item_id, int quantity, long order_time, String notes)   {

        mItem_id = item_id;
        mQuantity = quantity;
        mOrder_time = order_time;
        mNotes = notes;

    }


}
