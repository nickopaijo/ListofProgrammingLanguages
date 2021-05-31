package com.example.aplikasisederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private ArrayList<Language> list =new ArrayList<>();

    //start Action Bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.about_me,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == R.id.aboutme){
            Intent aboutIntent = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(aboutIntent);
            return true;
        }
        return false;
    }
    //end

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv);
        rv.setHasFixedSize(true);

        list.addAll(LanguageData.getListData());
        showRecycleList();

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("List Languages");
        }
    }

    private void showRecycleList(){
        rv.setLayoutManager(new LinearLayoutManager(this));
        ListLanguageAdapter listLanguageAdapter =new ListLanguageAdapter(list);
        rv.setAdapter(listLanguageAdapter);

        listLanguageAdapter.setOnItemClickCallBack(new ListLanguageAdapter.OnItemClickCallBack() {
            @Override
            public void onItemClicked(Language data) {
                showSelectedLanguageData(data);
            }
        });
    }

    //move activity detail
    private void showSelectedLanguageData(Language language){
        Intent intentDetail = new Intent(MainActivity.this, DetailLanguage.class);
        intentDetail.putExtra("name",language.getName());
        intentDetail.putExtra("img", language.getImg());
        intentDetail.putExtra("detail", language.getDetail());
        startActivity(intentDetail);
    }
    //end
}