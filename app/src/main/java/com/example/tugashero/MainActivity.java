package com.example.tugashero;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewHero;
    private List<HeroModel> models = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewHero = findViewById(R.id.rv_hero);
        recyclerViewHero.setHasFixedSize(true);
        models.addAll(HeroDatabase.getListData());
        recyclerViewHero.setLayoutManager(new LinearLayoutManager(this));
        HeroRecyclerAdapter adapter = new HeroRecyclerAdapter(models);
        recyclerViewHero.setAdapter(adapter);
    }
}