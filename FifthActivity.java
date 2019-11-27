package com.example.jisuanqi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class FifthActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editText5,editText6,editText7;
    Button button20,button21,button22;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifth);
        //整数转八进制
        button20=findViewById(R.id.button20);
        //清除
        button21=findViewById(R.id.button21);
        //整数转二进制
        button22=findViewById(R.id.button22);
        editText5=findViewById(R.id.editText5);
        editText6=findViewById(R.id.editText6);
        editText7=findViewById(R.id.editText7);
        button20.setOnClickListener(this);
        button21.setOnClickListener(this);
        button22.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String input1=editText5.getText().toString();
        String input2=editText6.getText().toString();
        String input3=editText7.getText().toString();
        switch (view.getId()){
            case R.id.button21:
                editText5.setText("");
                editText6.setText("");
                editText7.setText("");
                break;
            case  R.id.button20:
                if(input1.length()!=0){
                    int a1=Integer.parseInt(input1);
                    editText6.setText(Integer.toString(a1,8));
                }
                break;
            case  R.id.button22:
                    if(input1.length()!=0){
                        int a=Integer.parseInt(input1);
                        editText7.setText(Integer.toString(a,2));
            }
                    break;
                default:
                    break;
        }
    }
}