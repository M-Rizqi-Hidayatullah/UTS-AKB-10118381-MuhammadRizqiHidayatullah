package com.example.a10118381_muhammadrizqihidayatullah.view;

import android.content.Intent;

import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import com.example.a10118381_muhammadrizqihidayatullah.R;


public class SplashScreen extends AppCompatActivity {

    // 07 - 06 - 2021
    // waktu pengerjaan 00:40 - 01:05
    // 10118381
    // Muhammad Rizqi Hidayatullah
    // IF 9

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //menghilangkan ActionBar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_screen);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }, 3000L); //3000 L = 3 detik
    }
}