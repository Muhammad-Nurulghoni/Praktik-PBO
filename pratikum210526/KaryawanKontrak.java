/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum210526;

/**
 *
 * @author Acer
 */
public class KaryawanKontrak  extends Karyawan {
    private double uangMakan  = 300000;

    public KaryawanKontrak(String nik, String nama) {
        super(nik, nama);
    }

    public KaryawanKontrak() {
    }

    public double getUangMakan() {
        return uangMakan;
    }

    public void setUangMakan(double uangMakan) {
        this.uangMakan = uangMakan;
    }

    @Override
    public void prosesKaryawan() {
        System.out.println("Nik                :"+nik);
        System.out.println("Nama               :"+nama);
        System.out.println("Uang Makan         :"+uangMakan);
    }

    

    
    

    
    
    
}
