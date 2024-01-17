package com.example.bpr.mypertamina;
public class Pesanan {
    private String kategori;
    private String jumlahLiter;
    private String metodePembayaran;

    // Konstruktor kosong diperlukan untuk deserialisasi Firebase
    public Pesanan() {
    }

    public Pesanan(String kategori, String jumlahLiter, String metodePembayaran) {
        this.kategori = kategori;
        this.jumlahLiter = jumlahLiter;
        this.metodePembayaran = metodePembayaran;
    }

    // Getter dan setter (jika diperlukan)
    public String getKategori() {
        return kategori;
    }

    public String getJumlahLiter() {
        return jumlahLiter;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }
}
