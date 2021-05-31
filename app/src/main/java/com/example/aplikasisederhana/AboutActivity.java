package com.example.aplikasisederhana;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_about);
    //ss
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("About");
        }
    }
}
