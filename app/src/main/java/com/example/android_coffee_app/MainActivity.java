package com.example.android_coffee_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;


import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_home);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Bundle bundle = new Bundle();
        MethodFragment method = new MethodFragment();
        switch (item.getItemId()) {
            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
                break;
            case R.id.nav_random:
                bundle.putString("name","Random");
                method.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, method).commit();
                break;
            case R.id.nav_aeropress:
                bundle.putString("name","Aeropress");
                method.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, method).commit();
                break;
            case R.id.nav_chemex:
                bundle.putString("name","Chemex");
                method.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, method).commit();
                break;
            case R.id.nav_french_press:
                bundle.putString("name","French Press");
                method.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, method).commit();
                break;
            case R.id.nav_kalita:
                bundle.putString("name","Kalita");
                method.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, method).commit();
                break;
            case R.id.nav_v60:
                bundle.putString("name","Drip v60");
                method.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, method).commit();
                break;
            case R.id.nav_syphon:
                bundle.putString("name","Syphon");
                method.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, method).commit();
                break;
            case R.id.nav_cafetiere:
                bundle.putString("name","Kawiarka");
                method.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, method).commit();
                break;
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

    }

}