package com.mycompany.tugas2;

public class Skincare {
    // Atribut
    String namaProduk;
    String jenisKulit;
    int harga;

    // Constructor 1 (tanpa parameter)
    public Skincare() {
        this.namaProduk = "Facial Wash";
        this.jenisKulit = "Normal";
        this.harga = 42000;
    }

    // Constructor 2 (dengan parameter)
    public Skincare(String namaProduk, String jenisKulit, int harga) {
        this.namaProduk = namaProduk;
        this.jenisKulit = jenisKulit;
        this.harga = harga;
    }

    // Method tanpa nilai balik
    public void tampilkanData() {
        System.out.println("Nama Produk  : " + namaProduk);
        System.out.println("Jenis Kulit  : " + jenisKulit);
        System.out.println("Harga        : Rp " + harga);
    }

    // Method dengan nilai balik
    public String getInfoProduk() {
        return namaProduk + " cocok untuk " + jenisKulit + " dengan harga Rp " + harga;
    }
}
