package com.example.anita.attendance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

/**
 * Created by Anita on 12/11/2016.
 */

    public class User extends AppCompatActivity implements View.OnClickListener {

    RadioButton Sem1, Sem2, Sem3, Sem4, Sem5, Sem6, Sem7, Sem8;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Sem1 = (RadioButton) findViewById(R.id.Sem1);
        Sem2 = (RadioButton) findViewById(R.id.Sem2);
        Sem3 = (RadioButton) findViewById(R.id.Sem3);
        Sem4 = (RadioButton) findViewById(R.id.Sem4);
        Sem5 = (RadioButton) findViewById(R.id.Sem5);
        Sem6 = (RadioButton) findViewById(R.id.Sem6);
        Sem7 = (RadioButton) findViewById(R.id.Sem7);
        Sem8 = (RadioButton) findViewById(R.id.Sem8);
        submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){




        }
    }
}






