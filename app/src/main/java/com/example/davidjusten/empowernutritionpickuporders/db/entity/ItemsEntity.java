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
    public int type; // juice, smoothie, bowls, meals
    public String name;
    public double price;
    public double sale_price;

}
