package com.example.royallifeapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.razorpay.Checkout;
import com.razorpay.PaymentResultListener;

import org.json.JSONException;
import org.json.JSONObject;

public class Payment extends AppCompatActivity implements PaymentResultListener {

    Button btnpay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        btnpay = findViewById(R.id.btnPay);

        String SAmout = "99";

        final int amout = Math.round(Float.parseFloat(SAmout) * 100);

        btnpay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Checkout checkout = new Checkout();
                checkout.setKeyID("rzp_test_ybEJ5LjZz4XiVC");
                checkout.setImage(R.drawable.brlogo);
                JSONObject object = new JSONObject();
                try {
                    object.put("name","Royal Life ");
                    object.put("description", "Test Payment");
                    object.put("theme.color","#00B8D4");
                    object.put("currency","INR");
                    object.put("amount",amout);
                    object.put("prefill.contact","1234567890");
                    object.put("prefill.email","votrieuduong2000@gmail.com");

                    checkout.open(Payment.this,object);
                }catch (JSONException e){
                    e.printStackTrace();
                }


            }
        });

    }

    @Override
    public void onPaymentSuccess(String s) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Payment ID");
        builder.setMessage(s);
        builder.show();
    }

    @Override
    public void onPaymentError(int i, String s) {
        Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();
    }
}