package com.example.royallifeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class gogi extends AppCompatActivity {
    ImageView imgback,bad1,bad2,bad3,bad4,bad5,bad6,bad7,bad8,bad9;
    TextView add;
    private String fullScreenInd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gogimore);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        imgback = findViewById(R.id.backtoMenu1);
        bad1 = findViewById(R.id.gogi1);
        bad2 = findViewById(R.id.gogi2);
        bad3 = findViewById(R.id.gogi3);
        bad4 = findViewById(R.id.gogi4);
        bad5 = findViewById(R.id.gogi5);
        bad6 = findViewById(R.id.gogi6);
        bad7 = findViewById(R.id.gogi7);
        bad8 = findViewById(R.id.gogi8);
        bad9 = findViewById(R.id.gogi9);

        add = findViewById(R.id.gogiAdd);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapMethod method = new mapMethod();
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse(getString(R.string.defaultSearchString)+ "GoGi house" +"/@"
                                + method.getLatitude() + "," + method.getLongitude() + ","+"10z/data=!3m1!4b1"));
                startActivity(intent);
            }
        });
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

                Intent intent = new Intent(gogi.this,
                        gogi.class);

                if("y".equals(fullScreenInd)){
                    intent.putExtra("fullScreenIndicator", "");
                }else{
                    intent.putExtra("fullScreenIndicator", "y");
                }
                gogi.this.startActivity(intent);
            }
        });
        bad2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(gogi.this,
                        gogi.class);

                if("y".equals(fullScreenInd)){
                    intent.putExtra("fullScreenIndicator", "");
                }else{
                    intent.putExtra("fullScreenIndicator", "y");
                }
                gogi.this.startActivity(intent);
            }
        });
        bad3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(gogi.this,
                        gogi.class);

                if("y".equals(fullScreenInd)){
                    intent.putExtra("fullScreenIndicator", "");
                }else{
                    intent.putExtra("fullScreenIndicator", "y");
                }
                gogi.this.startActivity(intent);
            }
        });
        bad4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(gogi.this,
                        gogi.class);

                if("y".equals(fullScreenInd)){
                    intent.putExtra("fullScreenIndicator", "");
                }else{
                    intent.putExtra("fullScreenIndicator", "y");
                }
                gogi.this.startActivity(intent);
            }
        });
        bad5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(gogi.this,
                        gogi.class);

                if("y".equals(fullScreenInd)){
                    intent.putExtra("fullScreenIndicator", "");
                }else{
                    intent.putExtra("fullScreenIndicator", "y");
                }
                gogi.this.startActivity(intent);
            }
        });
        bad6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(gogi.this,
                        gogi.class);

                if("y".equals(fullScreenInd)){
                    intent.putExtra("fullScreenIndicator", "");
                }else{
                    intent.putExtra("fullScreenIndicator", "y");
                }
                gogi.this.startActivity(intent);
            }
        });
        bad7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(gogi.this,
                        gogi.class);

                if("y".equals(fullScreenInd)){
                    intent.putExtra("fullScreenIndicator", "");
                }else{
                    intent.putExtra("fullScreenIndicator", "y");
                }
                gogi.this.startActivity(intent);
            }
        });
        bad8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(gogi.this,
                        gogi.class);

                if("y".equals(fullScreenInd)){
                    intent.putExtra("fullScreenIndicator", "");
                }else{
                    intent.putExtra("fullScreenIndicator", "y");
                }
                gogi.this.startActivity(intent);
            }
        });
        bad9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(gogi.this,
                        gogi.class);

                if("y".equals(fullScreenInd)){
                    intent.putExtra("fullScreenIndicator", "");
                }else{
                    intent.putExtra("fullScreenIndicator", "y");
                }
                gogi.this.startActivity(intent);
            }
        });

    }
}