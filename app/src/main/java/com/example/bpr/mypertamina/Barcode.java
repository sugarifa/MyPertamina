package com.example.bpr.mypertamina;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import java.util.Random;

public class Barcode extends AppCompatActivity {

    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barcode);

        imageView = findViewById(R.id.imageView);

        Button buttonPesan = findViewById(R.id.buttonSelesai);
        buttonPesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Simpan data ke Firebase

                // Pindah ke PembayaranActivity
                Intent intent = new Intent(Barcode.this, home_activity.class);
                startActivity(intent);
            }
        });


        // Saat inisiasi pertama kali, buat dan tampilkan barcode
        generateAndDisplayBarcode();
    }

    // Fungsi untuk membuat barcode dengan data acak
    private void generateAndDisplayBarcode() {
        // Generate data acak (misalnya, nomor acak)
        String randomData = generateRandomData();

        // Generate dan tampilkan barcode
        Bitmap bitmap = generateBarcode(randomData);
        imageView.setImageBitmap(bitmap);
    }

    // Fungsi untuk membuat data acak (contoh sederhana)
    private String generateRandomData() {
        Random random = new Random();
        return String.valueOf(random.nextInt(1000000));
    }

    // Fungsi untuk membuat barcode dari data yang diberikan
    private Bitmap generateBarcode(String data) {
        QRCodeWriter writer = new QRCodeWriter();
        try {
            // Buat matriks bit untuk barcode
            BitMatrix bitMatrix = writer.encode(data, BarcodeFormat.QR_CODE, 600, 600);

            // Konversi matriks bit menjadi gambar Bitmap
            int width = bitMatrix.getWidth();
            int height = bitMatrix.getHeight();
            Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);

            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    bitmap.setPixel(x, y, bitMatrix.get(x, y) ? getResources().getColor(R.color.rectangle_157_color) : getResources().getColor(R.color.white));
                }
            }
            return bitmap;

        } catch (WriterException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Fungsi yang dipanggil saat tombol diklik untuk menghasilkan barcode baru
    public void onGenerateBarcodeClick(View view) {
        generateAndDisplayBarcode();
    }
}
