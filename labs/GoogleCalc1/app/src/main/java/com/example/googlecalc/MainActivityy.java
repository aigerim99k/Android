package com.example.googlecalc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivityy extends AppCompatActivity implements View.OnClickListener {
    private Button btn_zero,btn_one,btn_two,btn_three,btn_four,btn_five,btn_six,btn_seven,btn_eight,btn_nine;
    private Button btn_plus, btn_minus, btn_multiply, btn_divide, btn_back,btn_clear, btn_square,btn_sqrt,btn_equal,btn_dot;
    private Button btn_percent, btn_sin,btn_cos,btn_tan,btn_cot, btn_ln,btn_log,btn_factorial,btn_power,btn_nsqrt;
    private double number=0,number1=0;
    private TextView tvInput;
    private String delText;
    public char action;





    private boolean check=true, checkNumber=true, checkAction=true, delete=true, checkzero=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvInput = findViewById(R.id.tvInput);
        btn_zero=findViewById(R.id.btn_zero);
        btn_one=findViewById(R.id.btn_one);
        btn_two=findViewById(R.id.btn_two);
        btn_three=findViewById(R.id.btn_three);
        btn_four=findViewById(R.id.btn_four);
        btn_five=findViewById(R.id.btn_five);
        btn_six=findViewById(R.id.btn_six);
        btn_seven=findViewById(R.id.btn_seven);
        btn_eight=findViewById(R.id.btn_eight);
        btn_nine=findViewById(R.id.btn_nine);
        btn_plus=findViewById(R.id.btn_plus);
        btn_minus=findViewById(R.id.btn_minus);
        btn_multiply=findViewById(R.id.btn_multiply);
        btn_divide=findViewById(R.id.btn_divide);
        btn_back=findViewById(R.id.btn_back);
        btn_clear=findViewById(R.id.btn_clear);
        btn_square=findViewById(R.id.btn_square);
        btn_sqrt=findViewById(R.id.btn_sqrt);
        btn_equal=findViewById(R.id.btn_equal);
        btn_dot=findViewById(R.id.btn_dot);
        btn_percent=findViewById(R.id.btn_percent);
        btn_sin=findViewById(R.id.btn_sin);
        btn_cos=findViewById(R.id.btn_cos);
        btn_tan=findViewById(R.id.btn_tan);
        btn_ln=findViewById(R.id.btn_ln);
        btn_log=findViewById(R.id.btn_log);
        btn_factorial=findViewById(R.id.btn_factorial);
        btn_power=findViewById(R.id.btn_power);
        btn_nsqrt=findViewById(R.id.btn_nsqrt);
        if(savedInstanceState!=null){
            number=savedInstanceState.getDouble("number");
            number1=savedInstanceState.getDouble("number1");
            action=savedInstanceState.getChar("action");
            checkAction=savedInstanceState.getBoolean("checkAction");
            checkNumber=savedInstanceState.getBoolean("checkNumber");
            check=savedInstanceState.getBoolean("check");
            delete=savedInstanceState.getBoolean("delete");
            tvInput.setText(savedInstanceState.getString("tvInput"));
        }


    }


    public void onClick(View view) {
        try {
            if (tvInput.getText().toString().equals("Infinity") || tvInput.getText().toString().equals("Wrong operation") || tvInput.getText().toString().equals("NaN")) {
                tvInput.setText("Wrong operation");
                checkNumber = false;
                delete = false;
            }
            switch (view.getId()) {
                case R.id.btn_zero: {

                    if (tvInput.length() == 1 && tvInput.getText().toString().charAt(0) == '0') {

                        tvInput.setText("");
                    }

                    if (checkNumber && checkzero)
                        tvInput.append("0");
                    break;

                }
                case R.id.btn_one: {
                    if (tvInput.length() == 1 && tvInput.getText().toString().charAt(0) == '0') {

                        tvInput.setText("");
                    }

                    if (checkNumber && checkzero)
                        tvInput.append("1");
                    break;
                }
                case R.id.btn_two: {
                    if (tvInput.length() == 1 && tvInput.getText().toString().charAt(0) == '0') {

                        tvInput.setText("");
                    }

                    if (checkNumber && checkzero)
                        tvInput.append("2");
                    break;
                }
                case R.id.btn_three: {
                    if (tvInput.length() == 1 && tvInput.getText().toString().charAt(0) == '0') {

                        tvInput.setText("");
                    }

                    if (checkNumber && checkzero)
                        tvInput.append("3");
                    break;
                }
                case R.id.btn_four: {
                    if (tvInput.length() == 1 && tvInput.getText().toString().charAt(0) == '0') {

                        tvInput.setText("");
                    }

                    if (checkNumber && checkzero)
                        tvInput.append("4");
                    break;
                }
                case R.id.btn_five: {
                    if (tvInput.length() == 1 && tvInput.getText().toString().charAt(0) == '0') {

                        tvInput.setText("");
                    }

                    if (checkNumber && checkzero)
                        tvInput.append("5");
                    break;
                }
                case R.id.btn_six: {
                    if (tvInput.length() == 1 && tvInput.getText().toString().charAt(0) == '0') {

                        tvInput.setText("");
                    }

                    if (checkNumber && checkzero)
                        tvInput.append("6");
                    break;
                }
                case R.id.btn_seven: {
                    if (tvInput.length() == 1 && tvInput.getText().toString().charAt(0) == '0') {

                        tvInput.setText("");
                    }

                    if (checkNumber && checkzero)
                        tvInput.append("7");
                    break;
                }
                case R.id.btn_eight: {
                    if (tvInput.length() == 1 && tvInput.getText().toString().charAt(0) == '0') {

                        tvInput.setText("");
                    }

                    if (checkNumber && checkzero)
                        tvInput.append("8");
                    break;
                }
                case R.id.btn_nine: {
                    if (tvInput.length() == 1 && tvInput.getText().toString().charAt(0) == '0') {

                        tvInput.setText("");
                    }

                    if (checkNumber && checkzero)
                        tvInput.append("9");
                    break;
                }
                case R.id.btn_plus: {
                    check = true;
                    checkNumber = true;
                    checkAction = true;
                    if (tvInput.getText().toString().length() != 0) {
                        number = Double.valueOf(tvInput.getText().toString());
                    }
                    tvInput.setText("");
                    action = '+';
                    break;

                }
                case R.id.btn_minus: {
                    checkAction = true;
                    check = true;
                    checkNumber = true;
                    if (tvInput.getText().toString().length() != 0) {
                        number = Double.valueOf(tvInput.getText().toString());
                    }
                    tvInput.setText("");
                    action = '-';
                    break;
                }
                case R.id.btn_multiply: {

                    check = true;
                    checkNumber = true;
                    checkAction = true;
                    if (tvInput.getText().toString().length() != 0) {
                        number = Double.valueOf(tvInput.getText().toString());
                    }
                    tvInput.setText("");
                    action = '×';
                    break;
                }
                case R.id.btn_power: {
                    check = true;
                    checkNumber = true;
                    checkAction = true;
                    if (tvInput.getText().toString().length() != 0) {
                        number = Double.valueOf(tvInput.getText().toString());
                    }
                    tvInput.setText("");
                    action='p';
                    break;

                }
                case R.id.btn_divide: {
                    check = true;
                    checkNumber = true;
                    checkAction = true;
                    if (tvInput.getText().toString().length() != 0) {
                        number = Double.valueOf(tvInput.getText().toString());
                    }

                    tvInput.setText("");
                    action = '/';
                    break;
                }
                case R.id.btn_back: {
                    if (delete) {
                        delText = tvInput.getText().toString();
                        if (delText.length() > 0) {
                            delText = delText.substring(0, delText.length() - 1);
                            tvInput.setText(delText);
                        }
                    }
                    break;
                }
                case R.id.btn_clear: {
                    checkNumber = true;
                    checkAction = true;
                    check = true;
                    delete = true;
                    number = 0;
                    number1 = 0;
                    tvInput.setText("");
                    break;
                }
                case R.id.btn_square: {
                    checkNumber = true;
                    check = true;
                    if (tvInput.getText().toString().length() != 0) {
                        number = Double.valueOf(tvInput.getText().toString());
                    }
                    tvInput.setText(String.valueOf(Math.pow(number, 2)));

                    break;
                }
                case R.id.btn_sqrt: {
                    if (tvInput.getText().toString().length() != 0) {
                        number = Double.valueOf(tvInput.getText().toString());
                    }
                    if (number >= 0) {
                        tvInput.setText(String.valueOf(Math.sqrt(number)));
                    } else {
                        tvInput.setText("Wrong action");
                        delete=false;
                    }
                    break;
                }

                case R.id.btn_equal: {

                    checkNumber = false;

                    check = false;
                    number1 = Double.valueOf(tvInput.getText().toString());
                    if (number1 == 0 && action == '/') {
                        tvInput.setText("Cannot divide by 0");
                        delete=false;

                    }
                    else if(number1>323&&action=='p'){
                        tvInput.setText("Too big Number for power operation");
                        delete=false;
                    }
                    else {
                        tvInput.setText(String.valueOf(action(number, number1)));
                        number = number1;
                        checkAction = false;
                        break;
                    }


                }

                case R.id.btn_dot: {
                    if (check && checkNumber) {
                        tvInput.setText(tvInput.getText() + ".");
                        check = false;
                        checkzero = true;
                    }
                    break;
                }


                case R.id.btn_percent: {
                    check = true;
                    checkNumber = true;
                    if (tvInput.getText().toString().length() != 0) {
                        number1 = Double.valueOf(tvInput.getText().toString());
                    }
                    tvInput.setText(String.valueOf(number1 / 100));
                    break;
                }

                case R.id.btn_sin: {
                    checkNumber = true;
                    check = true;
                    if (tvInput.getText().toString().length() != 0) {
                        number1 = Double.valueOf(tvInput.getText().toString());
                    }
                    if (number1 == 30) {
                        tvInput.setText("0.5");
                    } else {
                        tvInput.setText(String.valueOf(Math.sin(Math.toRadians(number1))));
                    }
                    break;
                }
                case R.id.btn_cos: {
                    checkNumber = true;
                    check = true;
                    if (tvInput.getText().toString().length() != 0) {
                        number1 = Double.valueOf(tvInput.getText().toString());
                    }
                    if (number1 == 60) {
                        tvInput.setText("0.5");
                    } else if (number1 == 90) {
                        tvInput.setText("0");
                    } else {
                        tvInput.setText(String.valueOf(Math.cos(Math.toRadians(number1))));
                    }
                    break;
                }
                case R.id.btn_tan: {
                    checkNumber = true;
                    check = true;
                    if (tvInput.getText().toString().length() != 0) {
                        number1 = Double.valueOf(tvInput.getText().toString());
                    }
                    if (number1 == 90) {
                        tvInput.setText("not defined");
                        checkNumber=false;
                        delete=false;
                    } else {
                        tvInput.setText(String.valueOf(Math.tan(Math.toRadians(number1))));
                    }
                    break;
                }


                case R.id.btn_ln: {
                    checkNumber = true;
                    check = true;
                    if (tvInput.getText().toString().length() != 0) {
                        number1 = Double.valueOf(tvInput.getText().toString());
                    }
                    if(number1<1){
                        tvInput.setText("Not a number");
                        delete=false;
                        checkNumber=false;
                    }
                    else {

                        tvInput.setText(String.valueOf(Math.log(number1)));
                    }
                    break;

                }
                case R.id.btn_log: {
                    checkNumber = true;
                    check = true;
                    if (tvInput.getText().toString().length() != 0) {
                        number1 = Double.valueOf(tvInput.getText().toString());
                    }
                    if(number1<1){
                        tvInput.setText("Not a number");
                        delete=false;
                        checkNumber=false;

                    }
                    else {

                        tvInput.setText(String.valueOf(Math.log10(number1)));
                    }
                    break;

                }
                case R.id.btn_factorial: {
                    checkNumber = true;
                    check = true;
                    if (tvInput.getText().toString().length() != 0) {
                        number1 = Double.valueOf(tvInput.getText().toString());
                    }
                    int i;
                    long fact=1;
                    if(number1<20) {
                        for (i = 1; i <= number1; i++) {
                            fact = fact * i;
                        }

                        tvInput.setText(String.valueOf(fact));
                    }
                    else{
                        tvInput.setText("too big number for factorial");
                        delete=false;
                        checkAction=false;
                        checkNumber=false;
                        check=false;}
                    break;

                }
                case R.id.btn_nsqrt:{
                    checkNumber=true;
                    check=true;
                    checkAction=true;
                    if (tvInput.getText().toString().length() != 0) {
                        number = Double.valueOf(tvInput.getText().toString());
                    }
                    if (number >= 0) {
                        tvInput.setText("");
                        action='s';
                        break;
                    } else {
                        tvInput.setText("Wrong action");
                        delete=false;
                    }
                    break;

                }


            }

        } catch (Exception e) {
            tvInput.setText("Wrong operation");
        }
    }

    public double action(double number, double number1){

        switch(action){
            case '+':
                return number + number1;
            case '-':
                return number - number1;
            case '×':
                return number * number1;
            case '/':
                return number / number1;
            case 'p':
                return Math.pow(number,number1);


            case 's': {
                double dres = Math.pow(number, 1.0 / number1);

                double ires = Math.round(dres);
                double diff = Math.abs(dres - ires);
                if (diff < Math.ulp(10.0)) {
                    return ires;
                }
                else{
                    return dres;


                }
            }
            default:
                return 0;

        }

    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString("tvInput",tvInput.getText().toString());
        outState.putDouble("number",number);
        outState.putDouble("number1",number1);
        outState.putBoolean("check",check);
        outState.putBoolean("checkNumber",checkNumber);
        outState.putBoolean("delete",delete);
        outState.putBoolean("checkAction",checkAction);
        outState.putChar("action",action);
    }
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        savedInstanceState.getString("tvInput");
        savedInstanceState.getDouble("number");
        savedInstanceState.getDouble("number1");
        savedInstanceState.getBoolean("checkNumber");
        savedInstanceState.getBoolean("check");
        savedInstanceState.getChar("action");
        savedInstanceState.getBoolean("delete");
        savedInstanceState.getBoolean("checkAction");



    }

}