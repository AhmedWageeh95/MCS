package com.example.awageeh.mcs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AddAnalysis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_analysis);
    }

    public void ok2(View view) {
        Intent i = new Intent(AddAnalysis.this,doctor.class);
        startActivity(i);
    }
}
