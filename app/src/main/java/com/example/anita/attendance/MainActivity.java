package com.example.anita.attendance;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button dept1;
    Button dept2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        dept1 = (Button) findViewById(R.id.dept1);
        dept1.setOnClickListener(this);
        dept2 = (Button) findViewById(R.id.dept2);
        dept2.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()){
            case  R.id.dept1:
                startActivity(new Intent(this,User.class));
                break;

            case R.id.dept2:
                startActivity(new Intent(this,User.class));
                break;
        }
    }
    }

