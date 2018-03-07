package com.example.davidjusten.empowernutritionpickuporders.db.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by davidjusten on 3/7/18.
 */

@Entity
public class CustomerOrder {

    @PrimaryKey(autoGenerate = true)
    public int _id;
    public int item_id;
    public int quantity;
    public long order_time;

    public CustomerOrder(int item_id, int quantity, long order_time)   {


    }

}
