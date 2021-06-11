package com.example.royallifeapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.GradientDrawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.royallifeapplication.HelperClass.HomeAdapter.FeaturedHelpersClass;
import com.example.royallifeapplication.HelperClass.HomeAdapter.BarpubLocate;

import java.util.ArrayList;

public class barpub extends AppCompatActivity  {

    RecyclerView featuredRecycler;
    BarpubLocate adapter2;
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

        featuredLocations.add(new FeaturedHelpersClass(R.drawable.bareon52heliii, "EON 51 Heli Bar", "EON 51 Heli Bar – quán bar rooftop Sài Gòn nằm ở tầng thứ 51 của tòa nhà siêu hiện đại Bitexco Financial Tower."));
        featuredLocations.add(new FeaturedHelpersClass(R.drawable.changvanglogo, "Chang Vang", "Nằm gọn gàng trong một con hẻm nhỏ trên đường Bạch Đằng, quán mang lại cảm giác tách biệt ra khỏi phố xá xô bồ để rồi vừa được ẩn mình ngắm Sài Gòn lại vừa được “chill”."));
        featuredLocations.add(new FeaturedHelpersClass(R.drawable.logoskybar, "Chill SkyBar", "CHILL SKYBAR is a modern stylish and vibrant club and lounge bar that offers both an entertainment nightlife and social gathering experrience destination."));
        featuredLocations.add(new FeaturedHelpersClass(R.drawable.winebar7, "WineBar SaiGon", "The lavish Saigon Social Club Rooftop Bar and Lounge at Hôtel des Arts Saigon regularly receives rave reviews for its Sunday brunch."));
        featuredLocations.add(new FeaturedHelpersClass(R.drawable.logozahrahhh, "Zahrah Rooftop", "Zahrah Coffee Lounge &amp; Rooftop như một ốc đảo Trung Đông, không gian được trau chuốt bởi các chi tiết decor sẽ khiến bạn thực sự bay bổng trong đêm Ả Rập huyền bí."));

        adapter2 = new BarpubLocate(featuredLocations);
        featuredRecycler.setAdapter(adapter2);

        GradientDrawable gradient = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffeff400, 0xffaff600});

    }
}