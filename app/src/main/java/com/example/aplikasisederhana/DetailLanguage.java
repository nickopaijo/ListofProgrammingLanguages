package com.example.aplikasisederhana;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;

public class DetailLanguage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();

        final String name = intent.getExtras().getString("name");
        final String desc = intent.getExtras().getString("detail");

        TextView name_detail = findViewById(R.id.item_name_detail);
        TextView detail = findViewById(R.id.item_desc);
        ImageView photo_detail = findViewById(R.id.img_detail);

        Glide.with(this).load(getIntent().getExtras().getInt("img")).into((photo_detail));
        name_detail.setText(name);
        detail.setText(desc);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail");
        }
    }
}
