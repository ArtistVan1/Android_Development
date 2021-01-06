package com.example.fragment_j;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        Button btn = findViewById(R.id.Btn);
        //btn.setOnClickListener(new myOnClickListener());
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = findViewById(R.id.text_view);
                tv.setText(R.string.newStr);
                EventActivity.this.setTitle("new title");
            }
        });
    }
//    public class myOnClickListener implements View.OnClickListener{
//
//        @Override
//        public void onClick(View v) {
//            TextView tv = findViewById(R.id.text_view);
//            tv.setText(R.string.newStr);
//            EventActivity.this.setTitle("new title");
//        }
//    }
//    public void changeText(View view){
//        TextView tv = findViewById(R.id.text_view);
//        tv.setText(R.string.newStr);
//        this.setTitle("new title");
//    }
}