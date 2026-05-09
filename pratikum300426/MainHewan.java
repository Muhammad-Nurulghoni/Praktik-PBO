/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum300426;

/**
 *
 * @author Acer
 */
public class MainHewan {
     public static void main(String[]args){
        Hewan hewanUmum = new Hewan("Makhluk");
        Kucing kucingku = new Kucing("Mimi");
        Anjing anjingku = new Anjing("Bobby");
       
        
        hewanUmum.TampilkanNama();
        hewanUmum.Bersuara();
        
        System.out.println();
        kucingku.TampilkanNama();
        kucingku.Bersuara();
        
        System.out.println();
        anjingku.TampilkanNama();
        anjingku.Bersuara();
     }
}
