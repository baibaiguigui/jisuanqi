package com.example.jisuanqi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secend);
        Button bt_11=(Button)findViewById(R.id.button11);
        bt_11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(intent1);
            }
        });
        Button bt_10=(Button)findViewById(R.id.button10);
        bt_10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(SecondActivity.this,FourthActivity.class);
                startActivity(intent2);
            }
        });
        Button bt_13=(Button)findViewById(R.id.button13);
        bt_13.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(SecondActivity.this,FifthActivity.class);
                startActivity(intent3);
            }
        });
        Button bt_12=(Button)findViewById(R.id.button12);
        bt_12.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(SecondActivity.this,SixthActivity.class);
                startActivity(intent4);
            }
        });
    }
}
