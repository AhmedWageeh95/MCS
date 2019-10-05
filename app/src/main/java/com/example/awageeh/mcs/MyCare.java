package com.example.awageeh.mcs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MyCare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_care);
    }

    public void AddTreatment(View view) {
        startActivity(new Intent(this,AddTreatment.class));
    }

    public void AddAnalysis(View view) {

        startActivity(new Intent(this,AddAnalysis.class));
    }

    public void AddDigoneses(View view) {
        startActivity(new Intent(this,AddDigonese.class));
    }
}
