package com.mycompany.tugas3;

public class BuahPremium extends Buah {

    // 2 Atribut tambahan
    private String asal;
    private String kualitas;

    // Constructor BuahPremium
    public BuahPremium(String kode, String nama, String jenis, int stok, double harga, String asal, String kualitas) {
        super(kode, nama, jenis, stok, harga);
        this.asal = asal;
        this.kualitas = kualitas;
    }

    // Override tampilData() - tambahkan atribut premium
    @Override
    public void tampilData() {
        super.tampilData(); // panggil tampilData() dari Buah
        System.out.println("Asal     : " + asal);
        System.out.println("Kualitas : " + kualitas);
    }

    // Method tambahan
    public String getAsal() { return asal; }
    public String getKualitas() { return kualitas; }

    public void tampilkanLabel() {
        System.out.println("Premium");
    }

    // Setter tambahan
    public void setAsal(String asal) { this.asal = asal; }
    public void setKualitas(String kualitas) { this.kualitas = kualitas; }
}