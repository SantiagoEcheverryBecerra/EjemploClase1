package com.seb.ejemploclase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {


    EditText teNumberOne;
    EditText teNumberTwo;
    Button btnSumar;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        setContentView();
    }

    private void setContentView(){
        teNumberOne= findViewById(R.id.etNumberOne);
        teNumberTwo= findViewById(R.id.etNumberTwo);
        btnSumar= findViewById(R.id.btnSuma);
        tvResult= findViewById(R.id.tvResult);
        tvResult.setTextSize(30);
        btnSumar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnSuma){
            int number1= Integer.parseInt(teNumberOne.getText().toString());
            int number2= Integer.parseInt(teNumberTwo.getText().toString());
            sumar(number1,number2);
        }
    }

    private void sumar(int number1, int number2){
        tvResult.setText(String.valueOf(number1+number2));
    }
}