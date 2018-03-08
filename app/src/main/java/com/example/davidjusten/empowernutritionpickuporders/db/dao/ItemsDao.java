package com.example.davidjusten.empowernutritionpickuporders.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.davidjusten.empowernutritionpickuporders.db.entity.ItemsEntity;

import java.util.List;

/**
 * Created by davidjusten on 3/7/18.
 */
@Dao
public interface ItemsDao {

    @Query("SELECT * FROM ItemsEntity WHERE _id IN (:list)")
    List<ItemsEntity> getItems(List<String> list);

    @Insert
    long[] insertNewItem(List<ItemsEntity> itemsEntity);
}
