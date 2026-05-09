/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum300426;

/**
 *
 * @author Acer
 */
public class MainKendaraan {
     public static void main(String[]args){
       Taksi taksi = new Taksi();
       taksi.setWarna("Biru");
       taksi.setJumlahRoda(4);
       taksi.setBahanBakar("Bensin");
       taksi.setKapasitasMesin(180);
       taksi.setTarifAwal(50000);
       taksi.setTarifPerKm(5000);
       
       System.out.println("=====Data Taksi======");
       System.out.println("Warna:"+taksi.getWarna());
       System.out.println("Jumlah ROda :"+taksi.getJumlahRoda());
       System.out.println("Bahan bakar:"+taksi.getBahanBakar());
       System.out.println("Kapasitas Mesin:"+taksi.getKapasitasMesin());
       System.out.println("Tarif Awal:"+taksi.gettarifAwal());
       System.out.println("TarifPerKm:"+taksi.getTarifPerKm());
       System.out.println();
       
       Sepeda sepeda = new Sepeda();
       sepeda.setWarna("Merah");
       sepeda.setJumlahRoda(2);
       sepeda.setJumlahSadel("2");
       sepeda.setJumlhGirl(21);
       
       System.out.println("======Data Sepeda=======");
       System.out.println("Warna Sepeda:"+sepeda.getWarna());
       System.out.println("Jumlah Roda:"+sepeda.getJumlahRoda());
       System.out.println("Jumlah Sadel:"+sepeda.getJumlahSadel());
       System.out.println("Jumlah Girl:"+sepeda.getJumlahGir());
       
    }
}
