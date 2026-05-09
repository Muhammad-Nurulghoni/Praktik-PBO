/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum300426;

/**
 *
 * @author Acer
 */
public class Udara extends Kendaraan {
    private boolean mesin;
    
    public boolean getMesin(){
        return mesin;
    }
    public void setMesin(boolean mesin){
        this.mesin = mesin;
    }
    public Udara(){
       super(); 
    }
    public Udara( String nama, int tahunProduksi,boolean mesin){
        super(nama,tahunroduksi);
        this.mesin = mesin;
    }
    @Override
    public  void Cetak(){
        super.Cetak();
        System.out.println("mengguanakan mesin :"+(mesin? "Ya":"Tidak"));
    }
    
}
