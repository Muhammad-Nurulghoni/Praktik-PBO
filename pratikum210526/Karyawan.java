/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum210526;

/**
 *
 * @author Acer
 */
public abstract class Karyawan {
     protected String nik;
     protected String nama;

    public Karyawan(String nik, String nama) {
        this.nik = nik;
        this.nama = nama;
    }

    public Karyawan() {
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public abstract void prosesKaryawan();   
}
