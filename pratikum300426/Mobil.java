/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum300426;

/**
 *
 * @author Acer
 */
public class Mobil extends Kendaraan {
    protected String bahanBakar;
    protected int kapasitasMesin;
    
    public void setBahanBakar(String bahanBakar){
      this.bahanBakar = bahanBakar;  
    }
    public String getBahanBakar(){
        return bahanBakar;
    }
    public void setKapasitasMesin(int kapasitasMesin){
        this.kapasitasMesin = kapasitasMesin;
    }
    public int getKapasitasMesin(){
        return kapasitasMesin;
    }
    
}
