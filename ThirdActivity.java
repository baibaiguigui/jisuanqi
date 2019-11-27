package com.example.jisuanqi;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editText,editText1;
    Button button14,button15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thrid);
        //=
        button15=findViewById(R.id.button15);
        //清除
        button14=findViewById(R.id.button14);
        editText=findViewById(R.id.editText);
        editText1=findViewById(R.id.editText2);
        editText.findViewById(R.id.editText);
        editText1.findViewById(R.id.editText1);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        String input=editText.getText().toString();
        String input1=editText1.getText().toString();
        switch (view.getId()){
            case R.id.button14:
                editText.setText("");
                editText1.setText("");
                break;
            case R.id.button15:
            if(input.length()!=0&&input1.length()==0){
                double a=Double.parseDouble(input);
                String b;
                a=a*0.1421;
                b=Double.toString(a);
                editText1.setText(b);
                }else if(input.length()==0&&input1.length()!=0){
                double a1=Double.parseDouble(input1);
                String b1;
                a1=a1*7.0349;
                b1=Double.toString(a1);
                editText.setText(b1);
                }
                break;
            default:
                break;
        }
    }

}
