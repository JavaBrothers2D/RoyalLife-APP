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

        featuredLocations.add(new FeaturedHelpersClass(R.drawable.logogogi, "GoGi", "GoGi House ??? Qu??n th???t n?????ng H??n Qu???c Ngon S??? 1 s??? ????a b???n gh?? ?????n nh???ng qu??n th???t n?????ng t???i Seoul ???? t???o n??n danh ti???ng cho n???n ???m th???c x??? kim chi."));
        featuredLocations.add(new FeaturedHelpersClass(R.drawable.logokichi, "KiChi-KiChi", "Kichi-Kichi l?? chu???i nh?? h??ng chuy??n v??? Buffet l???u h??ng ?????u Vi???t Nam. C??c m??n ??n ngon v?? ??a d???ng ???????c ph???c v??? v???i h??nh th???c b??ng chuy???n ?????c ????o, hi???n ?????i."));

        adapter2 = new Foodlocate(featuredLocations);
        featuredRecycler.setAdapter(adapter2);

        GradientDrawable gradient = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffeff400, 0xffaff600});

    }

}