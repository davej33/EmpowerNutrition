package com.example.davidjusten.empowernutritionpickuporders.helpers;

import android.util.Log;

import com.example.davidjusten.empowernutritionpickuporders.SplashScreenActivity;
import com.example.davidjusten.empowernutritionpickuporders.db.AppDB;
import com.example.davidjusten.empowernutritionpickuporders.db.entity.ItemsEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by davidjusten on 3/8/18.
 */

public class DbHelper {

    private static AppDB mDb;
    private static List<ItemsEntity> mItemsList;

    // item types
    private static final int JUICE_ITEM = 0;
    private static final int SMOOTHIE_ITEM = 1;
    private static final int BOWL_ITEM = 2;
    private static final int SHOT_ITEM = 3;

    public static void populateDb(SplashScreenActivity context) {
        mDb = AppDB.getDb(context);

        createItemsList();
        insertItemsToDb();
    }

    private static void insertItemsToDb() {
        long[] check = mDb.itemsDao().insertNewItem(mItemsList);
        Log.i("DbHelper", "Item db insert check: " + check[0]);
    }

    private static void createItemsList() {
        mItemsList = new ArrayList<>();
        mItemsList.add(new ItemsEntity(SMOOTHIE_ITEM, "Strawberry-Banana", 6.99,
                "drawable/strawb_bana.jpg", "#8e0000","#edb1b1"));
        mItemsList.add(new ItemsEntity(SMOOTHIE_ITEM, "Blueberry-Acai", 6.99,
                 "drawable/blueberry_acai.jpeg", "#330281","#d09ef4"));
         mItemsList.add(new ItemsEntity(SMOOTHIE_ITEM, "Strawberry-Banana", 6.99,
                 "drawable/strawb_bana.jpg", "#8e0000","#edb1b1"));
         mItemsList.add(new ItemsEntity(SMOOTHIE_ITEM, "Blueberry-Acai", 6.99,
                 "drawable/blueberry_acai.jpeg", "#330281","#d09ef4"));
         mItemsList.add(new ItemsEntity(SMOOTHIE_ITEM, "Strawberry-Banana", 6.99,
                 "drawable/strawb_bana.jpg", "#8e0000","#edb1b1"));
         mItemsList.add(new ItemsEntity(SMOOTHIE_ITEM, "Blueberry-Acai", 6.99,
                 "drawable/blueberry_acai.jpeg", "#330281","#d09ef4"));
         mItemsList.add(new ItemsEntity(SMOOTHIE_ITEM, "Strawberry-Banana", 6.99,
                 "drawable/strawb_bana.jpg", "#8e0000","#edb1b1"));
         mItemsList.add(new ItemsEntity(SMOOTHIE_ITEM, "Blueberry-Acai", 6.99,
                 "drawable/blueberry_acai.jpeg", "#330281","#d09ef4"));

    }


}
