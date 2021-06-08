package com.example.royallifeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;

public class badhabbit extends AppCompatActivity {

    ImageView imgback,bad1,bad2,bad3,bad4,bad5,bad6,bad7,bad8,bad9;
    private String fullScreenInd,fullScreenIndd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_badhabitmore);

        imgback = findViewById(R.id.backtoMenu4);
        bad1 = findViewById(R.id.bad1);
        bad2 = findViewById(R.id.bad2);
        bad3 = findViewById(R.id.bad3);
        bad4 = findViewById(R.id.bad4);
        bad5 = findViewById(R.id.bad5);
        bad6 = findViewById(R.id.bad6);
        bad7 = findViewById(R.id.bad7);
        bad8 = findViewById(R.id.bad8);
        bad9 = findViewById(R.id.bad9);

        //backmenu
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        fullScreenInd = getIntent().getStringExtra("fullScreenIndicator");

        if ("y".equals(fullScreenInd)) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
            getSupportActionBar().hide();

            bad1.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
            bad1.getLayoutParams().width = ViewGroup.LayoutParams.MATCH_PARENT;
            bad1.setAdjustViewBounds(false);
            bad1.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        bad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(badhabbit.this,
                        badhabbit.class);

                if("y".equals(fullScreenInd)){
                    intent.putExtra("fullScreenIndicator", "");
                }else{
                    intent.putExtra("fullScreenIndicator", "y");
                }
                badhabbit.this.startActivity(intent);
            }
        });

        fullScreenIndd = getIntent().getStringExtra("fullScreenIndicatorr");
        if ("yy".equals(fullScreenInd)) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
            getSupportActionBar().hide();

            bad1.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
            bad1.getLayoutParams().width = ViewGroup.LayoutParams.MATCH_PARENT;
            bad1.setAdjustViewBounds(false);
            bad1.setScaleType(ImageView.ScaleType.FIT_XY);
        }

        bad2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(badhabbit.this,
                        badhabbit.class);

                if("yy".equals(fullScreenInd)){
                    intent.putExtra("fullScreenIndicatorr", "");
                }else{
                    intent.putExtra("fullScreenIndicatorr", "yy");
                }
                badhabbit.this.startActivity(intent);
            }
        });
        bad3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(badhabbit.this,
                        badhabbit.class);

                if("y".equals(fullScreenInd)){
                    intent.putExtra("fullScreenIndicator", "");
                }else{
                    intent.putExtra("fullScreenIndicator", "y");
                }
                badhabbit.this.startActivity(intent);
            }
        });
        bad4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(badhabbit.this,
                        badhabbit.class);

                if("y".equals(fullScreenInd)){
                    intent.putExtra("fullScreenIndicator", "");
                }else{
                    intent.putExtra("fullScreenIndicator", "y");
                }
                badhabbit.this.startActivity(intent);
            }
        });
        bad5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(badhabbit.this,
                        badhabbit.class);

                if("y".equals(fullScreenInd)){
                    intent.putExtra("fullScreenIndicator", "");
                }else{
                    intent.putExtra("fullScreenIndicator", "y");
                }
                badhabbit.this.startActivity(intent);
            }
        });
        bad6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(badhabbit.this,
                        badhabbit.class);

                if("y".equals(fullScreenInd)){
                    intent.putExtra("fullScreenIndicator", "");
                }else{
                    intent.putExtra("fullScreenIndicator", "y");
                }
                badhabbit.this.startActivity(intent);
            }
        });
        bad7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(badhabbit.this,
                        badhabbit.class);

                if("y".equals(fullScreenInd)){
                    intent.putExtra("fullScreenIndicator", "");
                }else{
                    intent.putExtra("fullScreenIndicator", "y");
                }
                badhabbit.this.startActivity(intent);
            }
        });
        bad8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(badhabbit.this,
                        badhabbit.class);

                if("y".equals(fullScreenInd)){
                    intent.putExtra("fullScreenIndicator", "");
                }else{
                    intent.putExtra("fullScreenIndicator", "y");
                }
                badhabbit.this.startActivity(intent);
            }
        });
        bad9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(badhabbit.this,
                        badhabbit.class);

                if("y".equals(fullScreenInd)){
                    intent.putExtra("fullScreenIndicator", "");
                }else{
                    intent.putExtra("fullScreenIndicator", "y");
                }
                badhabbit.this.startActivity(intent);
            }
        });

    }
}