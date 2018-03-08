package com.example.davidjusten.empowernutritionpickuporders;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.davidjusten.empowernutritionpickuporders.fragments.MainOrderFragment;
import com.example.davidjusten.empowernutritionpickuporders.fragments.SplashFragment;

public class MainOrderActivity extends AppCompatActivity implements MainOrderFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_order);


    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
