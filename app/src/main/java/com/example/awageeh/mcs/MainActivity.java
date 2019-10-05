package com.example.awageeh.mcs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Login(View view) {
        Intent intent = new Intent(MainActivity.this,doctor.class);
        startActivity(intent);

    }

    public void openSignUp(View view) {
        Intent intent = new Intent(MainActivity.this,Sign_up.class);
        startActivity(intent);
    }
}
