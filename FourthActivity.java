package com.example.jisuanqi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.jisuanqi.R;

public class FourthActivity extends AppCompatActivity implements View.OnClickListener {
    Button button16,button17;
    EditText edit3,edit4;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forth);
        //米
        edit3=findViewById(R.id.editText3);
        //千米
        edit4=findViewById(R.id.editText4);
        //清零
        button16=findViewById(R.id.button16);
        //长度转换
        button17=findViewById(R.id.button17);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String  input =edit3.getText().toString();
        String  input1 =edit4.getText().toString();
        switch (view.getId()){
            case R.id.button16:
                edit3.setText("");
                edit4.setText("");
                break;
            case R.id.button17:
                if(input.length()!=0&&input1.length()==0){
                    double a=Double.parseDouble(input);
                    String b;
                    a=a*1000;
                    b=Double.toString(a);
                    edit4.setText(b);
                }else if(input.length()==0&&input1.length()!=0){
                    double a1=Double.parseDouble(input1);
                    String b1;
                    a1=a1/1000;
                    b1=Double.toString(a1);
                    edit3.setText(b1);
                }
                break;
                default:
                    break;
        }
    }
}
