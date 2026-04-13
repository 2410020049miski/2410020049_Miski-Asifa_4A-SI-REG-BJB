/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import akademis.MataKuliah;

public class Main {
    public static void main(String[] args) {
        
        // Object Mahasiswa
        Mahasiswa mhs = new Mahasiswa("2410020049", "Miski Asifa", 3.7, 4);
        mhs.tampilData();

        System.out.println();

        // Object MataKuliah
        MataKuliah mk = new MataKuliah("IF101", "Pemrograman Berbasis Objek");
        mk.tampilMK();
    }
}