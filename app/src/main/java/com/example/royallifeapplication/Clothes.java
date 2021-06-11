package com.example.royallifeapplication;


import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;

import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.royallifeapplication.HelperClass.HomeAdapter.FeaturedHelpersClass;
import com.example.royallifeapplication.HelperClass.HomeAdapter.ShoppingLocate;

import java.util.ArrayList;

public class Clothes extends AppCompatActivity  {

    RecyclerView featuredRecycler;
    ShoppingLocate adapter2;
    ImageView backback;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showlist);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        featuredRecycler = findViewById(R.id.featred_recyclerrr);
        featuredRecycler();
        backback = findViewById(R.id.backback);
        backback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
    private void featuredRecycler() {

        featuredRecycler.setHasFixedSize(true);
        featuredRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        ArrayList<FeaturedHelpersClass> featuredLocations = new ArrayList<>();

        featuredLocations.add(new FeaturedHelpersClass(R.drawable.bad4, "BAD HABIT's", "[Bad Habits] là những thương hiệu thời trang  nội địa thuộc sở hữu [Double Bad Company] được đánh giá là hàng đầu."));
        featuredLocations.add(new FeaturedHelpersClass(R.drawable.dirty1, "Dirty Coins", "DirtyCoins mang sức mạnh của một thương hiệu local brand đầy cá tính với những sản phẩm thời trang hàng đầu xu thế."));

        adapter2 = new ShoppingLocate(featuredLocations);
        featuredRecycler.setAdapter(adapter2);

        GradientDrawable gradient = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffeff400, 0xffaff600});

    }
}