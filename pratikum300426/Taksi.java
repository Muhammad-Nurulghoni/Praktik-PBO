/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum300426;

/**
 *
 * @author Acer
 */
class Taksi extends Mobil {
    protected int tarifAwal;
    protected  int tarifPerKm;

    public Taksi(String nama, int tahunProduksi) {
        super(nama, tahunProduksi);
    }
    
    public void setTarifAwal(int tarifAwal){
        this.tarifAwal = tarifAwal;
    }
    public int gettarifAwal(){
        return tarifAwal;
    }
    public void setTarifPerKm(int tarifPerKm){
        this.tarifPerKm = tarifPerKm;
    }
    public int getTarifPerKm(){
        return tarifPerKm;
    }
    
}
