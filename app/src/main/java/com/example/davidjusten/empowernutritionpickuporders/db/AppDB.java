package com.example.davidjusten.empowernutritionpickuporders.db;

import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.davidjusten.empowernutritionpickuporders.db.entity.CustomerOrderEntity;
import com.example.davidjusten.empowernutritionpickuporders.db.entity.ItemsEntity;

/**
 * Created by davidjusten on 3/7/18.
 */
@Database(entities = {ItemsEntity.class, CustomerOrderEntity.class}, version = 1)
public class AppDB extends RoomDatabase {

    private AppDB mDb;

    public AppDB getDb(Context context){
        if(mDb == null){
            mDb = Room.databaseBuilder(context, AppDB.class, "app_db").allowMainThreadQueries().build(); // TODO: fix main thread method
        }
        return mDb;
    }


    @Override
    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
        return null;
    }

    @Override
    protected InvalidationTracker createInvalidationTracker() {
        return null;
    }
}
