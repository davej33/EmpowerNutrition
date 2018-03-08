package com.example.davidjusten.empowernutritionpickuporders;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.davidjusten.empowernutritionpickuporders.db.AppDB;
import com.example.davidjusten.empowernutritionpickuporders.fragments.SplashFragment;
import com.example.davidjusten.empowernutritionpickuporders.helpers.DbHelper;

public class SplashScreenActivity extends AppCompatActivity implements SplashFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.splash_frag_holder, SplashFragment.newInstance("l","l")).commit();


        DbHelper.populateDb(this);

        startActivity(new Intent(this, MainOrderActivity.class));
    }

    private void populateDb(SplashScreenActivity splashScreenActivity) {
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
