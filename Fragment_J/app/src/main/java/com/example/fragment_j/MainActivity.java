package com.example.fragment_j;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.DisplayMetrics;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int screenWidth = dm.widthPixels;
        int screenHeight = dm.heightPixels;
        FragmentManager fm = getSupportFragmentManager();
        Fragment frag = fm.findFragmentById(R.id.listFragment);
        if(screenWidth>screenHeight){
            //横屏
            if(frag != null){
                fm.beginTransaction().remove(frag).commitNow();
            }

        }else{
            //竖屏
            if(frag == null){
                fm.beginTransaction().add(R.id.listFragment,new ListViewFragment()).commitNow();
            }

        }



    }
}