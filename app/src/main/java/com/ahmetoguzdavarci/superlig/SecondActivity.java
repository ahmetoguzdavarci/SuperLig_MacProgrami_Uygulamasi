package com.ahmetoguzdavarci.superlig;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.Arrays;

public class SecondActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String[] takimlar=new String[]{"Fenerbahçe","Galatasaray"};

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        recyclerView=findViewById(R.id.tvRecycler);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setAdapter(new RecyclerViewAdapter(Arrays.asList(takimlar)));
    }
}
