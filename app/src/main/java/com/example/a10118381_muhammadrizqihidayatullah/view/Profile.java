package com.example.a10118381_muhammadrizqihidayatullah.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.a10118381_muhammadrizqihidayatullah.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Profile extends AppCompatActivity {

    // 07 - 06 - 2021
    // waktu pengerjaan 00:23 - 00:37
    // 10118381
    // Muhammad Rizqi Hidayatullah
    // IF 9

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        BottomNavigationView buttomNavigationView = findViewById(R.id.bottom_navigation);

        buttomNavigationView.setSelectedItemId(R.id.profile);

        buttomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.main:
                        startActivity(new Intent(getApplicationContext()
                                ,MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext()
                                ,Profile.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.info:
                        startActivity(new Intent(getApplicationContext()
                                , Info.class));
                        overridePendingTransition(0,0);
                        return true;

                }
                return false;
            }
        });
    }
}