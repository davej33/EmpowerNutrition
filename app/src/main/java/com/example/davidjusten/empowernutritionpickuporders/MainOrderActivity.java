package com.example.davidjusten.empowernutritionpickuporders;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.davidjusten.empowernutritionpickuporders.fragments.MainOrderFragment;
import com.example.davidjusten.empowernutritionpickuporders.fragments.SplashFragment;

public class MainOrderActivity extends AppCompatActivity implements MainOrderFragment.OnFragmentInteractionListener{

    private static final String LOG_TAG = MainOrderActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_order);

        getSupportFragmentManager().beginTransaction().add(R.id.main_order_frag_holder,
                MainOrderFragment.newInstance(null,null)).commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

}
