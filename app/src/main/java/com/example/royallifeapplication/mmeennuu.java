package com.example.royallifeapplication;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.royallifeapplication.HelperClass.HomeAdapter.CatgoriersCard;
import com.example.royallifeapplication.HelperClass.HomeAdapter.FeatureAdpater;
import com.example.royallifeapplication.HelperClass.HomeAdapter.FeaturedHelpersClass;
import com.example.royallifeapplication.HelperClass.HomeAdapter.ViewedCard;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class mmeennuu extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    RecyclerView viewedCard;
    ViewedCard adapter1;
    RecyclerView featuredRecycler;
    FeatureAdpater adapter;
    RecyclerView catgoriersCard;
    CatgoriersCard adapter2;
    EditText search;
    //Drawer Menu
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    FirebaseAuth fAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_mmeennuu);

        search = findViewById(R.id.edtSearch);
        featuredRecycler = findViewById(R.id.featred_recycler);
        featuredRecycler();
        viewedCard = findViewById(R.id.featred_recycler1);
        viewedCard();
        catgoriersCard = findViewById(R.id.featred_recycler2);
        catgoriersCard();

        //Menu
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigationView);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(mmeennuu.this,
                drawerLayout,
                R.string.open,
                R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.getCheckedItem();
    }

    private void featuredRecycler() {

        featuredRecycler.setHasFixedSize(true);
        featuredRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<FeaturedHelpersClass> featuredLocations = new ArrayList<>();

        featuredLocations.add(new FeaturedHelpersClass(R.drawable.cgv, "CGV CINEMA", "CGV is one of the top 5 largest cinema clusters in the world and the largest distributor and cinema complex in Vietnam."));
        featuredLocations.add(new FeaturedHelpersClass(R.drawable.bareon52heliii, "EON 51 Heli Bar", "EON 51 Heli Bar – quán bar rooftop Sài Gòn nằm ở tầng thứ 51 của tòa nhà siêu hiện đại Bitexco Financial Tower."));
        featuredLocations.add(new FeaturedHelpersClass(R.drawable.bad4, "BAD HABIT's", "[Bad Habits] là những thương hiệu thời trang  nội địa thuộc sở hữu [Double Bad Company] được đánh giá là hàng đầu."));
        featuredLocations.add(new FeaturedHelpersClass(R.drawable.changvanglogo, "Chang Vang", "Nằm gọn gàng trong một con hẻm nhỏ trên đường Bạch Đằng, quán mang lại cảm giác tách biệt ra khỏi phố xá xô bồ để rồi vừa được ẩn mình ngắm Sài Gòn lại vừa được “chill”."));
        featuredLocations.add(new FeaturedHelpersClass(R.drawable.dirty1, "Dirty Coins", "DirtyCoins mang sức mạnh của một thương hiệu local brand đầy cá tính với những sản phẩm thời trang hàng đầu xu thế."));
        featuredLocations.add(new FeaturedHelpersClass(R.drawable.logogogi, "GoGi", "GoGi House – Quán thịt nướng Hàn Quốc Ngon Số 1 sẽ đưa bạn ghé đến những quán thịt nướng tại Seoul đã tạo nên danh tiếng cho nền ẩm thực xứ kim chi."));
        featuredLocations.add(new FeaturedHelpersClass(R.drawable.logokichi, "KiChi-KiChi", "Kichi-Kichi là chuỗi nhà hàng chuyên về Buffet lẩu hàng đầu Việt Nam. Các món ăn ngon và đa dạng được phục vụ với hình thức băng chuyền độc đáo, hiện đại."));
        featuredLocations.add(new FeaturedHelpersClass(R.drawable.logoskybar, "Chill SkyBar", "CHILL SKYBAR is a modern stylish and vibrant club and lounge bar that offers both an entertainment nightlife and social gathering experrience destination."));
        featuredLocations.add(new FeaturedHelpersClass(R.drawable.winebar7, "WineBar SaiGon", "The lavish Saigon Social Club Rooftop Bar and Lounge at Hôtel des Arts Saigon regularly receives rave reviews for its Sunday brunch."));
        featuredLocations.add(new FeaturedHelpersClass(R.drawable.logozahrahhh, "Zahrah Rooftop", "Zahrah Coffee Lounge &amp; Rooftop như một ốc đảo Trung Đông, không gian được trau chuốt bởi các chi tiết decor sẽ khiến bạn thực sự bay bổng trong đêm Ả Rập huyền bí."));

        adapter = new FeatureAdpater(featuredLocations);
        featuredRecycler.setAdapter(adapter);

        GradientDrawable gradient = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffeff400, 0xffaff600});

    }


    private void viewedCard() {
        viewedCard.setHasFixedSize(true);
        viewedCard.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ArrayList<FeaturedHelpersClass> featuredLocations = new ArrayList<>();

        featuredLocations.add(new FeaturedHelpersClass(R.drawable.cgv, "CGV CINEMA", "CGV is one of the top 5 largest cinema clusters in the world and the largest distributor and cinema complex in Vietnam."));
        featuredLocations.add(new FeaturedHelpersClass(R.drawable.logozahrahhh, "Zahrah Rooftop", "Zahrah Coffee Lounge &amp; Rooftop như một ốc đảo Trung Đông, không gian được trau chuốt bởi các chi tiết decor sẽ khiến bạn thực sự bay bổng trong đêm Ả Rập huyền bí."));
        featuredLocations.add(new FeaturedHelpersClass(R.drawable.bad4, "BAD HABIT's", "[Bad Habits] là những thương hiệu thời trang  nội địa thuộc sở hữu [Double Bad Company] được đánh giá là hàng đầu."));
        featuredLocations.add(new FeaturedHelpersClass(R.drawable.logokichi, "KiChi-KiChi", "Kichi-Kichi là chuỗi nhà hàng chuyên về Buffet lẩu hàng đầu Việt Nam. Các món ăn ngon và đa dạng được phục vụ với hình thức băng chuyền độc đáo, hiện đại."));

        adapter1 = new ViewedCard(featuredLocations);
        viewedCard.setAdapter(adapter1);
        GradientDrawable gradient = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffeff400, 0xffaff600});

    }


    private void catgoriersCard() {
        catgoriersCard.setHasFixedSize(true);
        catgoriersCard.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ArrayList<FeaturedHelpersClass> featuredLocations = new ArrayList<>();

        featuredLocations.add(new FeaturedHelpersClass(R.drawable.restaurant, "Restaurant", ""));
        featuredLocations.add(new FeaturedHelpersClass(R.drawable.hotel, "Hotels", ""));
        featuredLocations.add(new FeaturedHelpersClass(R.drawable.shopping, "Shopping's", ""));
        featuredLocations.add(new FeaturedHelpersClass(R.drawable.cinema, "Cinema", ""));

        adapter2 =new CatgoriersCard(featuredLocations);
        catgoriersCard.setAdapter(adapter2);

        GradientDrawable gradient = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffeff400, 0xffaff600});
    }


    //onclick
    @Override
    public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.navProfile:
                showprofile();
                break;
            case R.id.SignoutMenu:
                FirebaseAuth.getInstance().signOut();
                Intent intentt = new Intent(mmeennuu.this,Login.class);
                intentt.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK| Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intentt);
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }
    }
    public  void showprofile(){
        Intent intent = getIntent();
        String fullname = intent.getStringExtra("fullname");
        String email = intent.getStringExtra("email");
        String pass = intent.getStringExtra("pass");
        String username = intent.getStringExtra("username");
        String phone = intent.getStringExtra("phone");

        Intent intent1 = new Intent(getApplication(), Profile.class);
        intent1.putExtra("fullname",fullname);
        intent1.putExtra("email",email);
        intent1.putExtra("phone",phone);
        intent1.putExtra("pass",pass);
        intent1.putExtra("username",username);
        startActivity(intent1);
    }
}