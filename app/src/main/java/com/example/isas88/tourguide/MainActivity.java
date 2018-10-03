package com.example.isas88.tourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    //variable declaration
    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set the drawer layout object
        mDrawerLayout = findViewById(R.id.drawer_layout);

        //setup the action bar with menu icon
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.menu);

        //populate the default fragment as beach when the app is opened
        Fragment fragmentDft = null;
        fragmentDft = new BeachView();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.content_frame, fragmentDft);
        ft.commit();

        //when an item in navigation view menu is clicked load the respective fragment
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        // show selected item in the drawer and display the selected fragment
                        menuItem.setChecked(true);
                        displaySelectedScreen(menuItem.getItemId());
                        return true;
                    }
                });
    }

    @Override
    //open the navigation drawer when menu icon is clicked instead of the swipe from the left
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    //load the selected menu item's corresponding fragment
    private void displaySelectedScreen(int id){

        Fragment fragment = null;

        switch(id){
            case R.id.nav_theatres:
                fragment = new TheatreView();
                break;
            case R.id.nav_restaurants:
                fragment = new RestaurantView();
                break;
            case R.id.nav_beaches:
                fragment = new BeachView();
                break;
            case R.id.nav_malls:
                fragment = new MallView();
                break;
        }

        if (fragment != null){
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragment);
            ft.commit();
        }
        mDrawerLayout.closeDrawer(GravityCompat.START);
    }

}
