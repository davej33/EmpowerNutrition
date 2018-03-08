package com.example.davidjusten.empowernutritionpickuporders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.davidjusten.empowernutritionpickuporders.fragments.ItemFragment;
import com.example.davidjusten.empowernutritionpickuporders.fragments.dummy.DummyContent;

public class MenuItemsActivity extends AppCompatActivity implements ItemFragment.OnListFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_items);
    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

    }
}
