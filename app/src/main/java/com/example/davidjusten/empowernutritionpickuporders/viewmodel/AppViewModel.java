package com.example.davidjusten.empowernutritionpickuporders.viewmodel;

import android.arch.lifecycle.ViewModel;

import com.example.davidjusten.empowernutritionpickuporders.db.AppDB;
import com.example.davidjusten.empowernutritionpickuporders.db.entity.ItemsEntity;

import java.util.ArrayList;

/**
 * Created by davidjusten on 3/7/18.
 */

public class AppViewModel extends ViewModel {

    private static final String LOG_TAG = AppViewModel.class.getSimpleName();

    // db
    private static AppDB mDb;
    // item types
    private static final int JUICE_ITEM = 0;
    private static final int SMOOTHIE_ITEM = 1;
    private static final int BOWL_ITEM = 2;
    private static final int SHOT_ITEM = 3;

    // item lists
    private static ArrayList<ItemsEntity> mSmoothieList;
    private static ArrayList<ItemsEntity> mShotsList;
    private static ArrayList<ItemsEntity> mJuicesList;
    private static ArrayList<ItemsEntity> mBowlsList;

    // current order


    // time

    // -------- methods ----------

    // run on start-up to populate lists
    public static void getItems(AppDB db){
        mDb = db;
        mSmoothieList = (ArrayList<ItemsEntity>) mDb.itemsDao().getItems(SMOOTHIE_ITEM);
        mShotsList = (ArrayList<ItemsEntity>) mDb.itemsDao().getItems(SHOT_ITEM);
        mBowlsList = (ArrayList<ItemsEntity>) mDb.itemsDao().getItems(BOWL_ITEM);
        mJuicesList = (ArrayList<ItemsEntity>) mDb.itemsDao().getItems(JUICE_ITEM);

    }
}
