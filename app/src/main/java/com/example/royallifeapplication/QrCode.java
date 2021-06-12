package com.example.royallifeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;

public class QrCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr_code);
        ImageView imv = findViewById(R.id.imgQR);
        try{
            Bitmap bitmap = encodeAsBitmap("Khong co gi o day ca");
            imv.setImageBitmap(bitmap);
        }
        catch(WriterException e){
            e.printStackTrace();
        }
    }
    Bitmap encodeAsBitmap(String str) throws WriterException {
        BitMatrix result;
        try{
            result = new MultiFormatWriter().encode(str,
                    BarcodeFormat.QR_CODE, 512, 512, null);
        }
        catch (IllegalArgumentException iae){
            return null;
        }
        int w = result.getWidth();
        int h = result.getHeight();
        int[] pixels = new int[w * h];
        for (int y = 0; y < h; y++) {
            int offset = y * w;
            for (int x = 0; x < w; x++) {
                pixels[offset + x] = result.get(x, y) ? Color.BLACK : Color.WHITE;
            }
        }
        Bitmap bitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        bitmap.setPixels(pixels, 0, 512, 0, 0, w, h);
        return bitmap;
    }
}