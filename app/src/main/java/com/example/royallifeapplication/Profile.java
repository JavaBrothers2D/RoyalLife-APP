package com.example.royallifeapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.jetbrains.annotations.NotNull;

public class Profile extends AppCompatActivity {
    TextInputLayout fullname, email, phoneN0, pass;
    TextView username;
    ImageView back,avatar;
    Button btnupdate;
    String fullnameDB,emailDB,phoneDB,passDB,userDB;
    DatabaseReference reference;

    private static final int IMAGE_PICK_CODE = 1000;
    private static final int PERMISSION_CODE = 1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_profile);

        reference = FirebaseDatabase.getInstance().getReference("User");

        fullname = findViewById(R.id.edtProfileFullname);
        email = findViewById(R.id.edtProfileEmail);
        phoneN0 = findViewById(R.id.edtProfilePhone);
        pass = findViewById(R.id.edtProfilePass);
        username = findViewById(R.id.txtProfileUsername);
        //image
        avatar = findViewById(R.id.avatar);
        avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                            == PackageManager.PERMISSION_DENIED){
                        String[] permission = {Manifest.permission.READ_EXTERNAL_STORAGE};
                        requestPermissions(permission,PERMISSION_CODE);
                    }else{
                        pickImage();
                    }
                }else{
                    pickImage();
                }
            }
        });

        //show data

        showUser();

        back = findViewById(R.id.backtoMenu);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(getApplicationContext(), mmeennuu.class);
                //startActivity(intent);
                onBackPressed();
            }
        });

        btnupdate = findViewById(R.id.btnUpdate);
        btnupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                update();
            }
        });
    }

    private void pickImage() {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent,IMAGE_PICK_CODE);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull @NotNull String[] permissions, @NonNull @NotNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case PERMISSION_CODE: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    pickImage();
                } else {
                    Toast.makeText(this, "Permission Denied", Toast.LENGTH_LONG).show();
                }
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable @org.jetbrains.annotations.Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK && requestCode == IMAGE_PICK_CODE){
            avatar.setImageURI(data.getData());
        }
    }

    private void showUser() {
        Intent intent = getIntent();
        fullnameDB = intent.getStringExtra("fullname");
        emailDB = intent.getStringExtra("email");
        phoneDB = intent.getStringExtra("phone");
        passDB = intent.getStringExtra("pass");
        userDB = intent.getStringExtra("username");

        fullname.getEditText().setText(fullnameDB);
        email.getEditText().setText(emailDB);
        phoneN0.getEditText().setText(phoneDB);
        pass.getEditText().setText(passDB);
        username.setText(userDB);
    }

    public void update()
    {
        if (isNameChanged() || isPassChanged() || isEmailChanged() || isPhoneChanged()) {
            Toast.makeText(this, "Data has been updated !", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "Data is same, cannot update !", Toast.LENGTH_LONG).show();

        }
    }

    private boolean isEmailChanged() {
        if (!emailDB.equals(email.getEditText().getText().toString())){
            reference.child(userDB).child("email").setValue(email.getEditText().getText().toString());
            emailDB = email.getEditText().getText().toString();
            return true;
        }else {
            return false;
        }
    }

    private boolean isPhoneChanged() {
        if (!passDB.equals(pass.getEditText().getText().toString())){
            reference.child(userDB).child("pass").setValue(pass.getEditText().getText().toString());
            passDB = pass.getEditText().getText().toString();
            return true;
        }else {
            return false;
        }
    }

    private boolean isPassChanged() {
      if (!passDB.equals(pass.getEditText().getText().toString())){
            reference.child(userDB).child("pass").setValue(pass.getEditText().getText().toString());
            passDB = pass.getEditText().getText().toString();
            return true;
        }else {
            return false;
        }
    }

    private boolean isNameChanged() {
        if (!fullnameDB.equals(fullname.getEditText().getText().toString())){
            reference.child(userDB).child("fullname").setValue(fullname.getEditText().getText().toString());
            fullnameDB = fullname.getEditText().getText().toString();
            return true;
        }else {
            return false;
        }
    }
}