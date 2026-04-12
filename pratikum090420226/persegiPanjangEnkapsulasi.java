/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum090420226;

import static java.time.Clock.system;

/**
 *
 * @author Acer
 */

public class persegiPanjangEnkapsulasi {
   private int panjang;
    private int lebar;
    public static int jumlahObjek=0;
    
    
    ///constructor kosong
    persegiPanjangEnkapsulasi(){
        jumlahObjek++;
    }
    
    ///constructor 2 - overloading
    persegiPanjangEnkapsulasi(int p, int l){
    panjang =p;
    lebar =l;
    jumlahObjek++;
    }
    
    ///Getter & setter
    public void setpanjang(int panjang){
        this.panjang=panjang;
    }
    
    public int getpanjang(){
         return panjang;
    }
    
    public void setlebar(int lebar){
        this.lebar=lebar;
    }
    
    public int getlebar(){
        return lebar;
    }
    
    public static int getjumlahObjek(){
        return jumlahObjek;
    }
    ///Method hitung luas
    public int gethitungLuas(){
        return panjang*lebar;
    }
    
    ///Method hitung keliling
    public int gethitungKeliling(){
        return 2 * (panjang*lebar);
    }
    
    ///Methof tampilkan data
    public void tampilkanData(){
        System.out.print("Masukkan Panjang persegi ="+panjang);
        System.out.print("Masukkan Lebar persegi ="+lebar);
        System.out.print("Luas Persegi panjang ="+gethitungLuas());
        System.out.print("Keliling Persegi panjang="+gethitungKeliling());
        
    }
    
    
    
    
}
