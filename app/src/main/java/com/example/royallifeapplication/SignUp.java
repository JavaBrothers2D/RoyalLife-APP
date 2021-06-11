package com.example.royallifeapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignUp extends AppCompatActivity {
    private Button btnsignup;
    private TextInputLayout fullname,email,username,pass,passagain;
    ImageView back;
    String FullName,Email,UserName,PassW,RePass;
    DatabaseReference fAuth;

    private boolean isValidEmailId(String email){

        return Pattern.compile("^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
                + "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                + "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"
                + "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$").matcher(email).matches();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_sign_up);

        fAuth = FirebaseDatabase.getInstance().getReference("User");

        btnsignup = findViewById(R.id.btnSignup);
        fullname = findViewById(R.id.edtFullname);
        email = findViewById(R.id.edtEmail);
        username = findViewById(R.id.edtAccount);
        pass = findViewById(R.id.edtPass);
        passagain = findViewById(R.id.edtConfirmPass);

        btnsignup = findViewById(R.id.btnSignup);
       btnsignup.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

                if(!valiadte() ){
                    Toast.makeText(SignUp.this,"Faild",Toast.LENGTH_LONG).show();
                    return;
                }
                else if(!validatePass()){
                    passagain.setError("Not matching pass and confirm pass");
                }else
                {
                    create();
                }
           }
       });

    back = findViewById(R.id.backto);
    back.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(),Login.class);
            startActivity(intent);
        }
    });
    }
    public void create(){
        FullName = fullname.getEditText().getText().toString().trim();
        Email = email.getEditText().getText().toString().trim();
        UserName = username.getEditText().getText().toString().trim();
        PassW = pass.getEditText().getText().toString().trim();
         RePass = passagain.getEditText().getText().toString().trim();
        String regularExpression1 = "^[a-zA-Z0-9]*[\\s]{1}[a-zA-Z0-9]*[$%#@#]{1}[a-zA-Z0-9]*$";
        String regularExpression2 = "^[a-zA-Z0-9]*[$%#@#]{1}[a-zA-Z0-9]*[\\s]{1}[a-zA-Z0-9]*$";
        User user = new User(FullName,Email,PassW,UserName);

        fAuth.child(UserName).setValue(user);

        Toast.makeText(SignUp.this,"inserted",Toast.LENGTH_LONG).show();

        Intent intent = new Intent(getApplication(),VerifyPhone.class);

        startActivity(intent);
    }
    public boolean validatePass(){
         String PassW = pass.getEditText().getText().toString().trim();
         String RePass = passagain.getEditText().getText().toString().trim();
        if (PassW.equals(RePass)) {
            return true;
        } else {

            return false;
        }
    }
    public boolean valiadte(){
        FullName = fullname.getEditText().getText().toString().trim();
        Email = email.getEditText().getText().toString().trim();
        UserName = username.getEditText().getText().toString().trim();
         PassW = pass.getEditText().getText().toString().trim();
        RePass = passagain.getEditText().getText().toString().trim();
        String regularExpression1 = "^[a-zA-Z0-9]*[\\s]{1}[a-zA-Z0-9]*[$%#@#]{1}[a-zA-Z0-9]*$";
        String regularExpression2 = "^[a-zA-Z0-9]*[$%#@#]{1}[a-zA-Z0-9]*[\\s]{1}[a-zA-Z0-9]*$";
        if(TextUtils.isEmpty(FullName)){
            fullname.setError("Fullname is Required");
            return false;
        }

        if(TextUtils.isEmpty(UserName)){
            username.setError("Username is Required");
            return false;
        }

        if(TextUtils.isEmpty(Email) || !isValidEmailId(email.getEditText().getText().toString().trim()) ){
            email.setError("Email is Required");
            email.requestFocus();
            return false;
        }
        if(TextUtils.isEmpty(PassW)){
            pass.setError("Password is Required");
            return false;
        }

        if(pass.getEditText().getText().length() < 8){
            pass.setError("Password must be >=8");
            return false;
        }
        if(TextUtils.isEmpty(RePass)){
            passagain.setError("Confirm Password is Required");
            return false;
        }

        return true;
    }
}