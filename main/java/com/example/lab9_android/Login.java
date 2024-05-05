package com.example.lab9_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Login extends AppCompatActivity {

    Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        addControl();
        addEvent();
    }
    public void addControl()
    {
        btn_login = findViewById(R.id.loginButton);
    }
    public void addEvent()
    {
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move_to_home = new Intent(Login.this,Home.class);
                startActivity(move_to_home);
            }
        });
    }
}