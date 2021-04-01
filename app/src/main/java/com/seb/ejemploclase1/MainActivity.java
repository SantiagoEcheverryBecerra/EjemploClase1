package com.seb.ejemploclase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etLoginName;
    private EditText etLoginPassword;
    private Button btnLoginSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView();
    }

    private void setContentView(){
        etLoginName = findViewById(R.id.txtUsername);
        etLoginPassword = findViewById(R.id.txtPassword);
        btnLoginSend = findViewById(R.id.btnLogin);
        btnLoginSend.setOnClickListener(this);
    }
    @Override
    public  void onClick(View v){
        if (v.getId() == R.id.btnLogin){
            sendLogin();
        }
    }
    private void sendLogin(){

        if (etLoginName.getText().toString().equalsIgnoreCase( "Santiago" ) && etLoginPassword.getText().toString().equalsIgnoreCase( "123"));
        Intent calculatorIntent = new Intent(this, CalculatorActivity.class);
        startActivity(calculatorIntent);
    }

}