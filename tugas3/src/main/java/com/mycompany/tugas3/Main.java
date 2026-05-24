package com.mycompany.tugas3;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {

        // ===================== OBJECT CONSTRUCTOR 1 (tanpa parameter) =====================
        Buah buah1 = new Buah();
        buah1.kode = "B001";
        buah1.nama = "Mangga";
        buah1.jenis = "Tropis";
        buah1.stok = 20;
        buah1.harga = 15000;

        System.out.println("=== Constructor 1 ===");
        buah1.tampilData();

        // ===================== OBJECT CONSTRUCTOR 2 (2 parameter) =====================
        Buah buah2 = new Buah("B002", "Apel");
        buah2.jenis = "Subtropis";
        buah2.stok = 15;
        buah2.harga = 25000;

        System.out.println("\n=== Constructor 2 ===");
        buah2.tampilData();

        // ===================== OBJECT CONSTRUCTOR 3 (semua parameter) =====================
        Buah buah3 = new Buah("B003", "Jeruk", "Tropis", 30, 10000);

        System.out.println("\n=== Constructor 3 ===");
        buah3.tampilData();

        // ===================== MENJALANKAN METHOD CRUD =====================
        System.out.println("\n=== CRUD buah1 ===");
        buah1.create();
        buah1.read();
        buah1.update();
        buah1.delete();

        System.out.println("--------------");

        // ===================== OBJECT TURUNAN BuahPremium =====================
        BuahPremium bp = new BuahPremium("B001", "Mangga", "Tropis", 20, 15000, "Australia", "A+");

        System.out.println("=== BuahPremium ===");
        bp.tampilData();
        System.out.println();
        bp.create();
        bp.read();
        bp.update();
        bp.delete();

        System.out.println("--------------");
        bp.tampilkanLabel();

        System.out.println("----------------------------------------------------------------------");
    }
}