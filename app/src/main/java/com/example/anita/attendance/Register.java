package com.example.anita.attendance;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity implements View.OnClickListener
{

    Button bRegister;
    EditText etDept,etUsername,etPassword,rePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etDept = (EditText) findViewById(R.id.etDept);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        rePassword = (EditText) findViewById(R.id.rePassword);
        bRegister = (Button) findViewById(R.id.bRegister);

        bRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.bRegister:
                startActivity(new Intent(this, Login.class));
                break;
        }

        Toast.makeText(getApplicationContext(), "Registered Successfully", Toast.LENGTH_LONG).show();
    }
}
