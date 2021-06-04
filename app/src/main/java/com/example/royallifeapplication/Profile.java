package com.example.royallifeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
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

public class Profile extends AppCompatActivity {
    TextInputLayout fullname, email, phoneN0, pass;
    TextView username;
    ImageView back;
    Button btnupdate;
    String fullnameDB,emailDB,phoneDB,passDB,userDB;
    DatabaseReference reference;

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
        //show data

        showUser();

        back = findViewById(R.id.backtoMenu);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), mmeennuu.class);
                startActivity(intent);
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