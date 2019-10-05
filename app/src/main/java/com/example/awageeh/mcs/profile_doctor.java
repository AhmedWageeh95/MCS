package com.example.awageeh.mcs;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class profile_doctor extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_doctor);

         imageView = (ImageView) findViewById(R.id.photo1);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(intent);
            }
        });

    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Bitmap bitmap = (Bitmap)data.getExtras().get("data");
        imageView.setImageBitmap(bitmap);
    }

    public void editprofile(View view) {

        Intent i = new Intent(profile_doctor.this,Sign_up.class);
        startActivity(i);
    }

    public void addDivece(View view) {

        Intent i = new Intent(profile_doctor.this,AddDvice.class);
        startActivity(i);
    }

    public void Addreport(View view) {
        Intent i = new Intent(profile_doctor.this,AddReport.class);
        startActivity(i);
    }
}
