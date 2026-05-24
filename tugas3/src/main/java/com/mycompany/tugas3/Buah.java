package com.mycompany.tugas3;

public class Buah {

    // 5 Atribut
    String kode;
    String nama;
    String jenis;
    int stok;
    double harga;

    // Constructor 1 - tanpa parameter
    public Buah() {
        this.kode = "";
        this.nama = "";
        this.jenis = "";
        this.stok = 0;
        this.harga = 0;
    }

    // Constructor 2 - dengan 2 parameter
    public Buah(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
        this.jenis = "";
        this.stok = 0;
        this.harga = 0;
    }

    // Constructor 3 - dengan semua parameter
    public Buah(String kode, String nama, String jenis, int stok, double harga) {
        this.kode = kode;
        this.nama = nama;
        this.jenis = jenis;
        this.stok = stok;
        this.harga = harga;
    }

    // ===================== TAMPIL DATA (ke bawah) =====================
    public void tampilData() {
        System.out.println("Kode  : " + kode);
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis : " + jenis);
        System.out.println("Stok  : " + stok);
        System.out.println("Harga : " + harga);
    }

    // ===================== METHOD CRUD =====================

    public void create() {
        System.out.println("INSERT INTO buah VALUES ('" + kode + "','" + nama + "','" + jenis + "'," + stok + "," + harga + ")");
    }

    public void read() {
        System.out.println("SELECT * FROM buah");
    }

    public void update() {
        System.out.println("UPDATE buah SET nama='" + nama + "', stok=" + stok + " WHERE kode='" + kode + "'");
    }

    public void delete() {
        System.out.println("DELETE FROM buah WHERE kode='" + kode + "'");
    }

    // ===================== GETTER =====================
    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public String getJenis() { return jenis; }
    public int getStok() { return stok; }
    public double getHarga() { return harga; }

    // ===================== SETTER =====================
    public void setKode(String kode) { this.kode = kode; }
    public void setNama(String nama) { this.nama = nama; }
    public void setJenis(String jenis) { this.jenis = jenis; }
    public void setStok(int stok) { this.stok = stok; }
    public void setHarga(double harga) { this.harga = harga; }
}