package com.example.awageeh.mcs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AddReport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_report);
    }

    public void ok5(View view) {
        Intent i = new Intent(this,profile_doctor.class);
        startActivity(i);
    }
}
