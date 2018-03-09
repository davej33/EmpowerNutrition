package com.example.davidjusten.empowernutritionpickuporders;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.davidjusten.empowernutritionpickuporders.db.AppDB;
import com.example.davidjusten.empowernutritionpickuporders.fragments.SplashFragment;
import com.example.davidjusten.empowernutritionpickuporders.helpers.DbHelper;
import com.example.davidjusten.empowernutritionpickuporders.viewmodel.AppViewModel;

public class SplashScreenActivity extends AppCompatActivity implements SplashFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.splash_frag_holder, SplashFragment.newInstance("l","l")).commit();

        // send items to DB
        // add if to check if db
        DbHelper.populateDb(this);
        AppViewModel.getItems(AppDB.getDb(this));
        startActivity(new Intent(this, MainOrderActivity.class));
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
