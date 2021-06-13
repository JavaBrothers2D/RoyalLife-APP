package com.example.royallifeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class cgv extends AppCompatActivity {
    ImageView imgback,bad1,bad2,bad3,bad4,bad5,bad6,bad7,bad8,bad9;
    TextView txt;
    private String fullScreenInd;
    Button btnticket;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgvmore);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        imgback = findViewById(R.id.backtoMenu);
        bad1 = findViewById(R.id.cgv1);
        bad2 = findViewById(R.id.cgv2);
        bad3 = findViewById(R.id.cgv3);
        bad4 = findViewById(R.id.cgv4);
        bad5 = findViewById(R.id.cgv5);
        bad6 = findViewById(R.id.cgv6);
        bad7 = findViewById(R.id.cgv7);
        bad8 = findViewById(R.id.cgv8);
        bad9 = findViewById(R.id.cgv9);
        btnticket = findViewById(R.id.btnTicketCGV);
        txt = findViewById(R.id.txtCGVName);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapMethod method = new mapMethod();
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse(getString(R.string.defaultSearchString)+ "cgv" +"/@"
                                + method.getLatitude() + "," + method.getLongitude() + ","+"10z/data=!3m1!4b1"));
                startActivity(intent);
            }
        });
        btnticket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(cgv.this);

                builder.setTitle("Warning !");

                builder.setMessage("Do you want to choose this ?");

                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {

                    @Override

                    public void onClick(DialogInterface dialog, int which) {

                        return;

                    }

                });

                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent mIntent = getIntent();
                        int ticket = mIntent.getIntExtra("intVariableName", 0);
                        if(ticket > 0){
                            ticket -= ticket;
                            Intent intent = new Intent(getApplicationContext(),QrCode.class);
                            startActivity(intent);
                        }
                        else{
                            androidx.appcompat.app.AlertDialog.Builder builder = new androidx.appcompat.app.AlertDialog.Builder(cgv.this);
                            builder.setTitle("You don't have enough tickets ");
                            builder.show();
                        }


                    }

                });

                builder.create().show();
            }
        });
        //backmenu
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        //image
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

                Intent intent = new Intent(cgv.this,
                        cgv.class);

                if("y".equals(fullScreenInd)){
                    intent.putExtra("fullScreenIndicator", "");
                }else{
                    intent.putExtra("fullScreenIndicator", "y");
                }
                cgv.this.startActivity(intent);
            }
        });
        bad2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(cgv.this,
                        cgv.class);

                if("y".equals(fullScreenInd)){
                    intent.putExtra("fullScreenIndicator", "");
                }else{
                    intent.putExtra("fullScreenIndicator", "y");
                }
                cgv.this.startActivity(intent);
            }
        });
        bad3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(cgv.this,
                        cgv.class);

                if("y".equals(fullScreenInd)){
                    intent.putExtra("fullScreenIndicator", "");
                }else{
                    intent.putExtra("fullScreenIndicator", "y");
                }
                cgv.this.startActivity(intent);
            }
        });
        bad4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(cgv.this,
                        cgv.class);

                if("y".equals(fullScreenInd)){
                    intent.putExtra("fullScreenIndicator", "");
                }else{
                    intent.putExtra("fullScreenIndicator", "y");
                }
                cgv.this.startActivity(intent);
            }
        });
        bad5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(cgv.this,
                        cgv.class);

                if("y".equals(fullScreenInd)){
                    intent.putExtra("fullScreenIndicator", "");
                }else{
                    intent.putExtra("fullScreenIndicator", "y");
                }
                cgv.this.startActivity(intent);
            }
        });
        bad6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(cgv.this,
                        badhabbit.class);

                if("y".equals(fullScreenInd)){
                    intent.putExtra("fullScreenIndicator", "");
                }else{
                    intent.putExtra("fullScreenIndicator", "y");
                }
                cgv.this.startActivity(intent);
            }
        });
        bad7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(cgv.this,
                        cgv.class);

                if("y".equals(fullScreenInd)){
                    intent.putExtra("fullScreenIndicator", "");
                }else{
                    intent.putExtra("fullScreenIndicator", "y");
                }
                cgv.this.startActivity(intent);
            }
        });
        bad8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(cgv.this,
                        cgv.class);

                if("y".equals(fullScreenInd)){
                    intent.putExtra("fullScreenIndicator", "");
                }else{
                    intent.putExtra("fullScreenIndicator", "y");
                }
                cgv.this.startActivity(intent);
            }
        });
        bad9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(cgv.this,
                        cgv.class);

                if("y".equals(fullScreenInd)){
                    intent.putExtra("fullScreenIndicator", "");
                }else{
                    intent.putExtra("fullScreenIndicator", "y");
                }
                cgv.this.startActivity(intent);
            }
        });

    }
}