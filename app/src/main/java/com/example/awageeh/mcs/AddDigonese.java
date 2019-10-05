package com.example.awageeh.mcs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AddDigonese extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_digonese);
    }

    public void ok3(View view) {

        Intent i = new Intent(this,doctor.class);
        startActivity(i);
    }
}
