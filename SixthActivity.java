package com.example.jisuanqi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class SixthActivity extends AppCompatActivity  implements View.OnClickListener {
    Button button18,button19;
    EditText editText9,editText10,editText11,editText12;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sixth);
        //清除
        button18=findViewById(R.id.button18);
        //体积计算
        button19=findViewById(R.id.button19);
        editText9=findViewById(R.id.editText9);
        editText10=findViewById(R.id.editText10);
        editText11=findViewById(R.id.editText11);
        editText12=findViewById(R.id.editText12);
        button18.setOnClickListener(this);
        button19.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String input=editText9.getText().toString();
        String input1=editText10.getText().toString();
        String input2=editText11.getText().toString();
        String input3=editText12.getText().toString();
        switch(view.getId()){
            case R.id.button18:
                editText12.setText("");
                editText11.setText("");
                editText10.setText("");
                editText9.setText("");
                break;
            case R.id.button19:
                if((input1.length()!=0&&input2.length()!=0)&&input3.length()!=0){
                    double a1 = Double.parseDouble(input1);
                    double a2=Double.parseDouble(input2);
                    double a3=Double.parseDouble(input3);
                    double b=a1*a2*a3;
                    String c=Double.toString(b);
                    editText9.setText(c);
                }
                break;
                default:
                    break;
        }

    }
}
