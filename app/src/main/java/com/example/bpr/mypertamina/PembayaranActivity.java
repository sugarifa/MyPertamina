package com.example.bpr.mypertamina;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class PembayaranActivity extends AppCompatActivity {

    private ImageView untuk_barcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran);

        untuk_barcode = (ImageView) findViewById(R.id.untuk_barcode);

        untuk_barcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PembayaranActivity.this,Barcode.class);
                startActivity(intent);
            }
        });



    }
}