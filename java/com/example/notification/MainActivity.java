package com.example.notification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Item> items=new ArrayList<>();
        items.add(new Item("✨ Schools reopen on November 16 ✨","⭕ Schools will be reopened on Nov 16 which was declared by Tamilnadu government ⭕","Nov 6 2020"));
        items.add(new Item("✨ India vs Punjab Live ✨","⭕ Cricket Live match of India Vs Punjab on Nov 7 2020 ⭕","Nov 6 2020"));
        items.add(new Item("✨ Coronavirus Vaccine within 2 months ✨","⭕ Coronavirus Vaccine will be available within 2 months to test the vaccine ⭕","Nov 6 2020"));

        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        adapter=new Adapter(items);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}