package com.vietdung.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Hero> mHeroes;
    private HeroAdapter mHeroAdapter;
    private RecyclerView mRecyclerViewHero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        getData();
    }

    private void getData() {
        mHeroes.add(new Hero(getString(R.string.spider_man), R.drawable.spider_man));
        mHeroes.add(new Hero(getString(R.string.super_man), R.drawable.super_man));
        mHeroes.add(new Hero(getString(R.string.bat_man), R.drawable.bat_man));
    }

    private void initView() {
        mRecyclerViewHero = findViewById(R.id.recycler_hero);
        mHeroes = new ArrayList<>();
        mHeroAdapter = new HeroAdapter(mHeroes, getApplicationContext());
        mHeroAdapter.notifyDataSetChanged();
        mRecyclerViewHero.setAdapter(mHeroAdapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerViewHero.setLayoutManager(layoutManager);
    }
}
