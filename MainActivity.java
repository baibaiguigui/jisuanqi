package com.example.jisuanqi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity<existedText> extends AppCompatActivity implements View.OnClickListener {
    public Button button,button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonadd, buttoncu, buttonJ, buttonce, buttonC, buttonsin, buttoncos, buttono, buttond, buttonm, buttonz, buttony; //各个按钮
    public EditText et_show; //显示输入数字和结果
    boolean clear_flag = false;
    double result;
    String result1;
    String a1;
    int q1, q2;
    double n1, n2;
    int k;
    String a2;
    int n;
    int w=50;
    int m;
    int mm = 20;//循环次数
    int z = 0;//记录左括号出现的次数；
    int y = 0;//记录右括号出现的次数；


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()) {
            case R.id.help:
                Toast.makeText(this, "this is help", Toast.LENGTH_SHORT).show();
                break;
            case R.id.leave:
                Toast.makeText(this, "this is leavse", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_show = (EditText) findViewById(R.id.editText1);
        //数字0—9
        button=findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
//        //运算符号
//        //加法
        buttonadd = findViewById(R.id.buttonadd);
//        //减法
        buttonJ = findViewById(R.id.buttonJ);
//        //除法
        buttoncu = findViewById(R.id.buttoncu);
//        //乘法
        buttonce = findViewById(R.id.buttonce);
//        //sin函数
        buttonsin = findViewById(R.id.buttonsin);
//        //con函数
        buttoncos = findViewById(R.id.buttoncos);
//        //幂函数
        buttonm = findViewById(R.id.buttonm);
//        //小数点
        buttono = findViewById(R.id.buttono);
//        //等于号
        buttond = findViewById(R.id.buttond);
//        //清零
        buttonC = findViewById(R.id.buttonC);
//        //左括号
        buttonz = findViewById(R.id.buttonz);
//        //右括号
        buttony = findViewById(R.id.buttony);

        //结果集
        //点击事件
        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonadd.setOnClickListener(this);
        buttonJ.setOnClickListener(this);
        buttonce.setOnClickListener(this);
        buttoncu.setOnClickListener(this);
        buttonsin.setOnClickListener(this);
        buttoncos.setOnClickListener(this);
        buttonm.setOnClickListener(this);
        buttono.setOnClickListener(this);
        buttond.setOnClickListener(this);
        buttonC.setOnClickListener(this);
        buttonz.setOnClickListener(this);
        buttony.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button0:
                et_show.append("0");
//                numberStack.push(0);
                break;
            case R.id.button1:
                et_show.append("1");
//                numberStack.push(1);
                break;
            case R.id.button2:
                et_show.append("2");
//                numberStack.push(2);
                break;
            case R.id.button3:
                et_show.append("3");
//                numberStack.push(3);
                break;
            case R.id.button4:
                et_show.append("4");
//                numberStack.push(4);
                break;
            case R.id.button5:
                et_show.append("5");
//                numberStack.push(5);
                break;
            case R.id.button6:
                et_show.append("6");
//                numberStack.push(6);
                break;
            case R.id.button7:
                et_show.append("7");
//                numberStack.push(7);
                break;
            case R.id.button8:
                et_show.append("8");
//                numberStack.push(8);
                break;
            case R.id.button9:
                et_show.append("9");
//                numberStack.push(9);
                break;
            case R.id.buttonadd:
                String q = et_show.getText().toString();
                if (q.charAt(q.length() - 1) == '(') {
                    this.mm--;
                    this.n++;
                }
                et_show.setText(q + "+");
                break;
            case R.id.buttonJ:
                String qq = et_show.getText().toString();
                if (qq.charAt(qq.length() - 1) == '(') {
                    this.mm--;
                }
                et_show.setText(qq + "-");
                break;
            case R.id.buttonce:
                this.mm++;
                et_show.setText(et_show.getText().toString() + "*");
//                symbolStack.push("*");
                break;
            case R.id.buttoncu:
                et_show.setText(et_show.getText().toString() + "/");
//                symbolStack.push("/");
                this.mm++;
                break;
            case R.id.buttonC:
                et_show.setText("");
//                numberStack.clear();;
//                symbolStack.clear();
                clear_flag = true;
                break;
            case R.id.buttono:
                et_show.setText(et_show.getText().toString() + ".");
//                symbolStack.push(".");
                break;
            case R.id.buttonsin:
                et_show.setText(et_show.getText().toString() + "sin");
//                symbolStack.push("");
                this.mm++;
                break;
            case R.id.buttoncos:
                et_show.setText(et_show.getText().toString() + "cos");
//                symbolStack.push("cos");
                this.mm++;
                break;
            case R.id.buttonm:
                et_show.setText(et_show.getText().toString() + "^");
//                symbolStack.push("^");
                this.mm++;
                break;
            case R.id.buttond:
                et_show.setText(getResuit());
                break;
            case R.id.buttonz:
                et_show.setText(et_show.getText().toString() + "(");
                break;
            case R.id.buttony:
                et_show.setText(et_show.getText().toString() + ")");
                this.y++;
                break;
            default:
                break;
        }

    }

    private String getResuit() {
        String a = et_show.getText().toString();
        mm = 50;
        w=50;
//        int n=input.length();//字符串长度
        if(a.contains("(")&&a.contains(")")){
            for (;a.contains(")")&&w!=0;w--){
                String b = a.substring(a.lastIndexOf("(") + 1, a.indexOf(")"));
                String b1 = yunsuan(b);
                a = a.replace(a.substring(a.lastIndexOf("("), a.indexOf(")") + 1), b1);
            }
        }
        a=yunsuan(a);
        return a;
    }

    String yunsuan(String a) {
        this.a1 = a;
        if (a1.contains("sin") || a1.contains("cos") || a1.contains("^") || a1.contains("/") || a1.contains("*") || a1.contains("+") || a1.contains("-") || mm != 0) {
            for (; mm != 0; mm--) {
                //幂函数
                if (a1.contains("^")) {
                    k = a1.indexOf("^");
                    System.out.println(k);
                    for (m = k - 1; (a1.charAt(m) != 'i') && (a1.charAt(m) != 'o') && (a1.charAt(m) != '^') && (a1.charAt(m) != '(') && (a1.charAt(m) != '*') && (a1.charAt(m) != '/') && (a1.charAt(m) != '+') && (a1.charAt(m) != '-') && m != 0; m--) {
                    }
                    if (a1.charAt(m) == '+' || a1.charAt(m) == '-' || a1.charAt(m) == '/' || a1.charAt(m) == '*') {
                        q1 = m + 1;
                    } else {
                        q1 = m;
                    }
                    System.out.println("q1:" + q1);
                    m = k + 1;
                    for (; (a1.charAt(m) != 'i') && (a1.charAt(m) != 'o') && (a1.charAt(m) != '^') && (a1.charAt(m) != ')') && (a1.charAt(m) != '*') && (a1.charAt(m) != '/') && (a1.charAt(m) != '+') && (a1.charAt(m) != '-') && (m + 1) != a1.length(); m++) {
                    }
//	            System.out.println(m);
                    if (a1.charAt(m) == '+' || a1.charAt(m) == '-' || a1.charAt(m) == '/' || a1.charAt(m) == '*') {
                        q2 = m - 1;
                    } else {
                        q2 = m;
                    }
                    System.out.println("q2:" + q2);
                    n1 = Double.parseDouble((a1.substring(q1, k)));
                    System.out.println("n1:" + n1);
                    if ((k + 1) == q2) {
                        n2 = Double.parseDouble(a1.substring(k + 1, k + 2));
                    } else {
                        n2 = Double.parseDouble(a1.substring(k + 1, q2));
                    }
                    System.out.println("n2:" + n2);
                    result = Math.pow(n1, n2);
                    System.out.println(result);
                    result1 = Double.toString(result);
                    a2 = a1.substring(q1, q2 + 1);
                    System.out.println(a2);
                    a1 = a1.replace(a2, result1);
                    System.out.println(a1);
                    this.mm--;
                    System.out.println();

                }
                //sin函数
                if ((a1.contains("sin") && a1.contains("cos") && (a1.indexOf("sin") < a1.indexOf("cos"))) || ((a1.contains("sin") && (a1.indexOf("cos") == -1)))) {
                    k = a1.indexOf("sin");
                    System.out.println(k);
                    m = k - 1;
                    if (m != -1) {
                        for (; (a1.charAt(m) != 'i') && (a1.charAt(m) != 'o') && (a1.charAt(m) != '^') && (a1.charAt(m) != '(') && (a1.charAt(m) != '*') && (a1.charAt(m) != '/') && (a1.charAt(m) != '+') && (a1.charAt(m) != '-') && m != 0; m--) {
                        }
                        if (a1.charAt(m) == '+' || a1.charAt(m) == '-' || a1.charAt(m) == '/' || a1.charAt(m) == '*' || a1.charAt(m) == '^') {
                            q1 = m + 1;
                        } else {
                            q1 = m;
                        }
                        System.out.println("q1:" + q1);
                        n1 = Double.parseDouble((a1.substring(q1, k)));
                    } else {
                        n1 = 1;
                    }
                    System.out.println("n1:" + n1);
                    m = k + 1;
                    for (; (a1.charAt(m) != 'i') && (a1.charAt(m) != 'o') && (a1.charAt(m) != '^') && (a1.charAt(m) != ')') && (a1.charAt(m) != '*') && (a1.charAt(m) != '/') && (a1.charAt(m) != '+') && (a1.charAt(m) != '-') && (m + 1) != a1.length(); m++) {
                    }
//	            System.out.println(m);
                    if (a1.charAt(m) == '+' || a1.charAt(m) == '-' || a1.charAt(m) == '/' || a1.charAt(m) == '*' || a1.charAt(m) == '^' || a1.charAt(m) == 'o' || a1.charAt(m) == 'i') {
                        if (a1.charAt(m) == 'i' || a1.charAt(m) == 'o') {
                            q2 = m + 3;
                        } else {
                            q2 = m - 1;
                        }
                    } else {
                        q2 = m;
                    }
                    System.out.println("q2:" + q2);
                    System.out.println(m);
                    if ((k + 1) == q2) {
                        n2 = Double.parseDouble(a1.substring(k + 1, k + 2));
                    } else {
                        n2 = Double.parseDouble(a1.substring(k + 3, q2 + 1));
                    }
                    System.out.println(n2);
                    System.out.println("n2:" + n2);
                    n2 = Math.toRadians(n2);
                    result = n1 * Math.sin(n2);
                    System.out.println(result);
                    result1 = Double.toString(result);
                    a2 = a1.substring(q1, q2 + 1);
                    System.out.println(a2);
                    a1 = a1.replace(a2, result1);
                    System.out.println(a1);
                    this.mm--;
                    System.out.println();
                }
                //cos函数
                else if ((a1.contains("sin") && a1.contains("cos") && (a1.indexOf("sin") > a1.indexOf("cos"))) || ((a1.contains("cos") && (a1.indexOf("sin") == -1)))) {
                    k = a1.indexOf("cos");
                    System.out.println(k);
                    m = k - 1;
                    if (m != -1) {
                        for (; (a1.charAt(m) != 'i') && (a1.charAt(m) != 'o') && (a1.charAt(m) != '^') && (a1.charAt(m) != '(') && (a1.charAt(m) != '*') && (a1.charAt(m) != '/') && (a1.charAt(m) != '+') && (a1.charAt(m) != '-') && m != 0; m--) {
                        }
                        if (a1.charAt(m) == '+' || a1.charAt(m) == '-' || a1.charAt(m) == '/' || a1.charAt(m) == '*' || a1.charAt(m) == '^') {
                            q1 = m + 1;
                        } else {
                            q1 = m;
                        }
                        System.out.println("q1:" + q1);
                        n1 = Double.parseDouble((a1.substring(q1, k)));
                    } else {
                        n1 = 1;
                    }
                    System.out.println("n1:" + n1);
                    m = k + 1;
                    for (; (a1.charAt(m) != 'i') && (a1.charAt(m) != 'o') && (a1.charAt(m) != '^') && (a1.charAt(m) != ')') && (a1.charAt(m) != '*') && (a1.charAt(m) != '/') && (a1.charAt(m) != '+') && (a1.charAt(m) != '-') && (m + 1) != a1.length(); m++) {
                    }
//	            System.out.println(m);
                    if (a1.charAt(m) == '+' || a1.charAt(m) == '-' || a1.charAt(m) == '/' || a1.charAt(m) == '*' || a1.charAt(m) == '^' || a1.charAt(m) == 'o' || a1.charAt(m) == 'i') {
                        if (a1.charAt(m) == 'i' || a1.charAt(m) == 'o') {
                            q2 = m + 3;
                        } else {
                            q2 = m - 1;
                        }
                    } else {
                        q2 = m;
                    }
                    System.out.println("q2:" + q2);
                    System.out.println(m);
                    if ((k + 1) == q2) {
                        n2 = Double.parseDouble(a1.substring(k + 1, k + 2));
                    } else {
                        n2 = Double.parseDouble(a1.substring(k + 3, q2));
                    }
                    System.out.println(n2);
                    System.out.println("n2:" + n2);
                    n2 = Math.toRadians(n2);
                    result = n1 * Math.cos(n2);
                    System.out.println(result);
                    result1 = Double.toString(result);
                    a2 = a1.substring(q1, q2);
                    System.out.println(a2);
                    a1 = a1.replace(a2, result1);
                    System.out.println(a1);
                    this.mm--;
                    System.out.println();
                }
                //乘法
                if ((a1.contains("*") && a1.contains("/") && (a1.indexOf("/") > a1.indexOf("*"))) || ((a1.contains("*") && a1.indexOf("/") == -1))) {
                    k = a1.indexOf("*");
                    System.out.println(k);
                    for (m = k - 1; (a1.charAt(m) != '(') && (a1.charAt(m) != '*') && (a1.charAt(m) != '/') && (a1.charAt(m) != '+') && (a1.charAt(m) != '-') && m != 0; m--) {
                    }
                    if (a1.charAt(m) == '+' || a1.charAt(m) == '-' || a1.charAt(m) == '/' || a1.charAt(m) == '*') {
                        q1 = m + 1;
                    } else {
                        q1 = m;
                    }
                    System.out.println("q1:" + q1);
                    m = k + 1;
                    for (; (a1.charAt(m) != ')') && (a1.charAt(m) != '*') && (a1.charAt(m) != '/') && (a1.charAt(m) != '+') && (a1.charAt(m) != '-') && (m + 1) != a1.length(); m++) {
                    }
//            System.out.println(m);
                    if (a1.charAt(m) == '+' || a1.charAt(m) == '-' || a1.charAt(m) == '/' || a1.charAt(m) == '*') {
                        q2 = m - 1;
                    } else {
                        q2 = m;
                    }
                    System.out.println("q2:" + q2);
                    n1 = Double.parseDouble((a1.substring(q1, k)));
                    System.out.println("n1:" + n1);
                    if ((k + 1) == q2) {
                        n2 = Double.parseDouble(a1.substring(k + 1, k + 2));
                    } else {
                        n2 = Double.parseDouble(a1.substring(k + 1, q2));
                    }
                    System.out.println("n2:" + n2);
                    result = n1 * n2;
                    System.out.println(result);
                    result1 = Double.toString(result);
                    a2 = a1.substring(q1, q2 + 1);
                    System.out.println(a2);
                    a1 = a1.replace(a2, result1);
                    System.out.println(a1);
                    this.mm--;
                    System.out.println();
                }
                //除法
                else if ((a1.contains("*") && a1.contains("/") && (a1.indexOf("/") < a1.indexOf("*"))) || ((a1.contains("/") && a1.indexOf("*") == -1))) {
//        	if(a1.contains("*"))&&(a1.indexOf("/")<a1.indexOf("*")){
                    k = a1.indexOf("/");
                    System.out.println(k);
                    for (m = k - 1; (a1.charAt(m) != '(') && (a1.charAt(m) != '*') && (a1.charAt(m) != '/') && (a1.charAt(m) != '+') && (a1.charAt(m) != '-') && m != 0; m--) {
                    }
                    if (a1.charAt(m) == '+' || a1.charAt(m) == '-' || a1.charAt(m) == '/' || a1.charAt(m) == '*') {
                        q1 = m + 1;
                    } else {
                        q1 = m;
                    }
                    System.out.println("q1:" + q1);
                    m = k + 1;
                    for (; (a1.charAt(m) != ')') && (a1.charAt(m) != '*') && (a1.charAt(m) != '/') && (a1.charAt(m) != '+') && (a1.charAt(m) != '-') && (m + 1) != a1.length(); m++) {
                    }
//            System.out.println(m);
                    if (a1.charAt(m) == '+' || a1.charAt(m) == '-' || a1.charAt(m) == '/' || a1.charAt(m) == '*') {
                        q2 = m - 1;
                    } else {
                        q2 = m;
                    }
                    System.out.println("q2:" + q2);
                    n1 = Double.parseDouble((a1.substring(q1, k)));
                    System.out.println("n1:" + n1);
                    if ((k + 1) == q2) {
                        n2 = Double.parseDouble(a1.substring(k + 1, k + 2));
                    } else {
                        n2 = Double.parseDouble(a1.substring(k + 1, q2));
                    }
                    System.out.println("n2:" + n2);
                    result = n1 / n2;
                    System.out.println(result);
                    result1 = Double.toString(result);
                    a2 = a1.substring(q1, q2 + 1);
                    System.out.println(a2);
                    a1 = a1.replace(a2, result1);
                    System.out.println(a1);
                    this.mm--;
                }
                //加法
                else if (((a1.lastIndexOf("+") != 0) && a1.contains("+") && a1.contains("-") && (a1.indexOf("-") > a1.indexOf("+"))) || (a1.lastIndexOf("+") != 0) && ((a1.contains("+") && a1.indexOf('-') == -1))) {
                    k = a1.lastIndexOf("+");
                    System.out.println(k);
                    for (m = k - 1; (a1.charAt(m) != '(') && (a1.charAt(m) != '*') && (a1.charAt(m) != '/') && (a1.charAt(m) != '+') && (a1.charAt(m) != '-') && m != 0; m--) {
                    }
                    if ((a1.charAt(m) == '+' || a1.charAt(m) == '-' || a1.charAt(m) == '/' || a1.charAt(m) == '*') && a1.indexOf("+") != 0 && a1.indexOf("-") != 0) {
                        q1 = m + 1;
                    } else {
                        q1 = m;
                    }
                    System.out.println("q1:" + q1);
                    m = k + 1;
                    for (; (a1.charAt(m) != ')') && (a1.charAt(m) != '*') && (a1.charAt(m) != '/') && (a1.charAt(m) != '+') && (a1.charAt(m) != '-') && (m + 1) != a1.length(); m++) {
                    }
//            System.out.println(m);
                    if ((a1.charAt(m) == '+' || a1.charAt(m) == '-' || a1.charAt(m) == '/' || a1.charAt(m) == '*')) {
                        q2 = m - 1;
                    } else {
                        q2 = m;
                    }
                    System.out.println("q2:" + q2);
                    n1 = Double.parseDouble((a1.substring(q1, k)));
                    System.out.println("n1:" + n1);
                    if ((k + 1) == q2) {
                        n2 = Double.parseDouble(a1.substring(k + 1, k + 2));
                    } else {
                        n2 = Double.parseDouble(a1.substring(k + 1, q2));
                    }
                    System.out.println("n2:" + n2);
                    result = n1 + n2;
                    System.out.println(result);
                    result1 = Double.toString(result);
                    a2 = a1.substring(q1, q2 + 1);
                    System.out.println(a2);
                    a1 = a1.replace(a2, result1);
                    System.out.println(a1);
                    this.mm--;
                }
                //减法
                else if (((a1.lastIndexOf("-") != 0) && a1.contains("+") && a1.contains("-") && (a1.indexOf("-") < a1.indexOf("+"))) || (a1.lastIndexOf("-") != 0) && ((a1.contains("-") && a1.indexOf('+') == -1))) {
                    k = a1.lastIndexOf("-");
                    System.out.println(k);
                    for (m = k - 1; (a1.charAt(m) != '(') && (a1.charAt(m) != '*') && (a1.charAt(m) != '/') && (a1.charAt(m) != '+') && (a1.charAt(m) != '-') && m != 0; m--) {
                    }
                    System.out.println(m);
                    if ((a1.charAt(m) == '+' || a1.charAt(m) == '-' || a1.charAt(m) == '/' || a1.charAt(m) == '*') && a1.indexOf("+") != 0 && a1.indexOf("-") != 0) {
                        q1 = m + 1;
                    } else {
                        q1 = m;
                    }
                    System.out.println("q1:" + q1);
                    m = k + 1;
                    for (; (a1.charAt(m) != ')') && (a1.charAt(m) != '*') && (a1.charAt(m) != '/') && (a1.charAt(m) != '+') && (a1.charAt(m) != '-') && (m + 1) != a1.length(); m++) {
                    }
                    System.out.println(m);
                    if ((a1.charAt(m) == '+' || a1.charAt(m) == '-' || a1.charAt(m) == '/' || a1.charAt(m) == '*')) {
                        q2 = m - 1;
                    } else {
                        q2 = m;
                    }
                    System.out.println("q2:" + q2);
                    n1 = Double.parseDouble((a1.substring(q1, k)));
                    System.out.println("n1:" + n1);
                    if ((k + 1) == q2) {
                        n2 = Double.parseDouble(a1.substring(k + 1, k + 2));
                    } else {
                        n2 = Double.parseDouble(a1.substring(k + 1, q2));
                    }
                    System.out.println("n2:" + n2);
                    result = n1 - n2;
                    System.out.println(result);
                    result1 = Double.toString(result);
                    a2 = a1.substring(q1, q2 + 1);
                    System.out.println(a2);
                    a1 = a1.replace(a2, result1);
                    System.out.println(a1);
                    this.mm--;
                }
            }
        }
        return a1;
    }
}


