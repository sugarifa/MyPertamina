package com.example.bpr.mypertamina;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MenuActivity extends AppCompatActivity {

    String[] item = {"Pertalite", "Pertamax", "Pertamax-Turbo", "Pertamina-dex", "Biosolar", "Dexlite"};
    String[] metode_pem = {"BCA", "BNI", "BRI"};

    AutoCompleteTextView autoCompleteTextView;
    AutoCompleteTextView autoCompleteMetode;
    TextInputEditText editTextJumlahLiter;

    ArrayAdapter<String> adapterItems;
    ArrayAdapter<String> adapterMetode;

    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Inisialisasi referensi Firebase
        databaseReference = FirebaseDatabase.getInstance().getReference("pesanan");

        autoCompleteTextView = findViewById(R.id.auto_complete_txt);
        autoCompleteMetode = findViewById(R.id.metode_pembayaran);
        editTextJumlahLiter = findViewById(R.id.auto_complete_jumlah_liter);

        adapterItems = new ArrayAdapter<>(this, R.layout.list_item, item);
        autoCompleteTextView.setAdapter(adapterItems);

        adapterMetode = new ArrayAdapter<>(this, R.layout.list_item, metode_pem);
        autoCompleteMetode.setAdapter(adapterMetode);

        // Tambahkan InputFilter pada TextInputEditText untuk membatasi input hanya boleh berupa angka
        editTextJumlahLiter.setFilters(new InputFilter[]{new InputFilter.LengthFilter(5), new DigitsKeyListener()});

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedItem = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(MenuActivity.this, "Item: " + selectedItem, Toast.LENGTH_SHORT).show();
            }
        });

        autoCompleteMetode.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // Do nothing
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // Check whether to enable the "Pesan" button
                checkFieldsAndEnableButton();
            }

            @Override
            public void afterTextChanged(Editable editable) {
                // Do nothing
            }
        });

        Button buttonPesan = findViewById(R.id.buttonPesan);
        buttonPesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Simpan data ke Firebase
                simpanDataKeFirebase();

                // Pindah ke PembayaranActivity
                Intent intent = new Intent(MenuActivity.this, PembayaranActivity.class);
                startActivity(intent);
            }
        });

        // Inisialisasi tombol Pesan
        checkFieldsAndEnableButton();
    }

    private void simpanDataKeFirebase() {
        String kategori = autoCompleteTextView.getText().toString().trim();
        String jumlahLiter = editTextJumlahLiter.getText().toString().trim();
        String metodePembayaran = autoCompleteMetode.getText().toString().trim();

        if (isValidInput(kategori, jumlahLiter, metodePembayaran)) {
            // Buat objek Pesanan
            Pesanan pesanan = new Pesanan(kategori, jumlahLiter, metodePembayaran);

            // Simpan ke Firebase
            String key = databaseReference.push().getKey();
            databaseReference.child(key).setValue(pesanan);

            Toast.makeText(this, "Pesanan berhasil disimpan ke Firebase", Toast.LENGTH_SHORT).show();
        } else {
            // Menampilkan pesan kesalahan jika input tidak valid
            Toast.makeText(this, "Silakan lengkapi semua bidang", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean isValidInput(String kategori, String jumlahLiter, String metodePembayaran) {
        // Anda dapat menyesuaikan kriteria validasi sesuai kebutuhan
        return !kategori.isEmpty() && !jumlahLiter.isEmpty() && !metodePembayaran.isEmpty();
    }

    private void checkFieldsAndEnableButton() {
        Button buttonPesan = findViewById(R.id.buttonPesan);

        String kategori = autoCompleteTextView.getText().toString().trim();
        String jumlahLiter = editTextJumlahLiter.getText().toString().trim();
        String metodePembayaran = autoCompleteMetode.getText().toString().trim();

        // Nonaktifkan tombol jika salah satu bidang masih kosong
        boolean fieldsNotEmpty = !kategori.isEmpty() && !jumlahLiter.isEmpty() && !metodePembayaran.isEmpty();
        buttonPesan.setEnabled(fieldsNotEmpty);
    }
}
