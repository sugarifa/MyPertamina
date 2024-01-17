package com.example.bpr.mypertamina;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout inputLayoutNoTelepon, inputLayoutPassword;
    private TextInputEditText editTextNoTelepon, editTextPassword;
    private Button buttonMasuk;

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inputLayoutNoTelepon = findViewById(R.id.inputLayoutNoTelepon);
        inputLayoutPassword = findViewById(R.id.inputLayoutPassword);

        editTextNoTelepon = findViewById(R.id.editTextNoTelepon);
        editTextPassword = findViewById(R.id.editTextPassword);

        buttonMasuk = findViewById(R.id.button);

        firebaseAuth = FirebaseAuth.getInstance();

        buttonMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }

    private void login() {
        String noTelepon = editTextNoTelepon.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

        if (TextUtils.isEmpty(noTelepon)) {
            inputLayoutNoTelepon.setError("Masukkan nomor telepon");
            return;
        } else {
            inputLayoutNoTelepon.setError(null);
        }

        if (TextUtils.isEmpty(password)) {
            inputLayoutPassword.setError("Masukkan password");
            return;
        } else {
            inputLayoutPassword.setError(null);
        }

        // TODO: Lakukan otentikasi pengguna di sini
        // Contoh: FirebaseAuth.getInstance().signInWithEmailAndPassword()

        // Jika otentikasi berhasil, pindah ke HomeActivity
        Intent intent = new Intent(LoginActivity.this, home_activity.class);
        startActivity(intent);

        // Tutup LoginActivity agar tidak bisa kembali ke sini dengan tombol back
        finish();
    }
}
