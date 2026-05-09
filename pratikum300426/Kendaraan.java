/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum300426;

/**
 *
 * @author Acer
 */
public class Kendaraan {
     protected int jmlRoda;
    protected String warna;
     
    
    public void setJumlahRoda(int jmlRoda){
        this.jmlRoda = jmlRoda;
    }
    public int getJumlahRoda(){
        return jmlRoda;
    }
    public void setWarna(String warna){
        this.warna = warna;
    }
    public String getWarna(){
        return warna;
    }

    public void Cetak() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
