/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum300426;

/**
 *
 * @author Acer
 */
public class Kendaraan2 {
       private String nama;
       private int tahunProduksi;
    
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama  = nama;
    }
    public int getTahunProduksi(){
        return tahunProduksi;
    }
    public void setTahunProduksi(int tahunProduksi){
        this.tahunProduksi = tahunProduksi;
    }
    public Kendaraan2(){
        
    }
    public Kendaraan2(String nama, int tahunProduksi){
        this.nama = nama;
        this.tahunProduksi = tahunProduksi;
    }
    public void Cetak(){
        System.out.println("Nama:"+nama);
        System.out.println("Tahun Produksi:"+tahunProduksi);
    }
}
