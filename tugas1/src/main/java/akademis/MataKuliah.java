/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package akademis;

public class MataKuliah {
    String kode_mk;
    String nama_mk;

    public MataKuliah(String kode_mk, String nama_mk) {
        this.kode_mk = kode_mk;
        this.nama_mk = nama_mk;
    }

    public void tampilMK() {
        System.out.println("Kode MK: " + kode_mk);
        System.out.println("Nama MK: " + nama_mk);
    }
}

