package com.example.royallifeapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.royallifeapplication.HelperClass.HomeAdapter.FeaturedHelpersClass;
import com.example.royallifeapplication.HelperClass.HomeAdapter.BarpubLocate;
import com.example.royallifeapplication.HelperClass.HomeAdapter.Foodlocate;
import com.google.android.material.navigation.NavigationView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Foods extends AppCompatActivity  {

    RecyclerView featuredRecycler;
     Foodlocate adapter2;
    ImageView backback;
    //Drawer Menu
    DrawerLayout drawerLayout;

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

        featuredLocations.add(new FeaturedHelpersClass(R.drawable.logogogi, "GoGi", "GoGi House – Quán thịt nướng Hàn Quốc Ngon Số 1 sẽ đưa bạn ghé đến những quán thịt nướng tại Seoul đã tạo nên danh tiếng cho nền ẩm thực xứ kim chi."));
        featuredLocations.add(new FeaturedHelpersClass(R.drawable.logokichi, "KiChi-KiChi", "Kichi-Kichi là chuỗi nhà hàng chuyên về Buffet lẩu hàng đầu Việt Nam. Các món ăn ngon và đa dạng được phục vụ với hình thức băng chuyền độc đáo, hiện đại."));

        adapter2 = new Foodlocate(featuredLocations);
        featuredRecycler.setAdapter(adapter2);

        GradientDrawable gradient = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffeff400, 0xffaff600});

    }

}