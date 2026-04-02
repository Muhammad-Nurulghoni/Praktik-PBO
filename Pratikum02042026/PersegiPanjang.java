/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persegipanjang;

/**
 *
 * @author Acer
 */

public class PersegiPanjang {
    int panjang;
    int lebar;
    
    ///constructor kosong
    PersegiPanjang(){
    }
    
    //
    PersegiPanjang(int p, int l){
    panjang =p;
    lebar =l;
    }
    
    ///method dengan nilai kembalian
    int HitungLuas (){
        return(panjang*lebar);
    }
    
    int HitungKel (){
        return(2*(panjang+lebar));
    }
    
    void TampilData(){
        System.out.print("Masukkan Panjang persegi ="+panjang);
        System.out.print("Masukkan Lebar persegi ="+lebar);
        System.out.print("Luas Persegi panjang ="+HitungLuas());
        System.out.print("Keliling Persegi panjang="+HitungKel());
        
    }
    
}
