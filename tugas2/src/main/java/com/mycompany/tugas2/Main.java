package com.mycompany.tugas2;

public class Main {
    public static void main(String[] args) {

        // Object dari constructor tanpa parameter
        Skincare sc1 = new Skincare();
        System.out.println("Data Skincare 1:");
        sc1.tampilkanData();

        System.out.println();

        // Object dari constructor dengan parameter
        Skincare sc2 = new Skincare("Moisturizer", "Kulit Berminyak", 55000);
        System.out.println("Data Skincare 2:");
        sc2.tampilkanData();

        System.out.println();

        // Method dengan nilai balik
        System.out.println("Info Produk:");
        System.out.println(sc2.getInfoProduk());
    }
}
