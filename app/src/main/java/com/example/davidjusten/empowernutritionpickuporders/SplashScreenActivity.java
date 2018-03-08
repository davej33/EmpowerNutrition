package com.example.davidjusten.empowernutritionpickuporders;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.davidjusten.empowernutritionpickuporders.fragments.SplashFragment;

public class SplashScreenActivity extends AppCompatActivity implements SplashFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.splash_frag_holder, SplashFragment.newInstance("l","l")).commit();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
