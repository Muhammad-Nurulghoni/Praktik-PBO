/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum210526;

/**
 *
 * @author Acer
 */
public abstract class BiayaRental {
     protected String noPolisi;
  protected String merek;
  protected int lamaSewa; 

    public BiayaRental() {
    }

    public BiayaRental(String noPolisi, String merek, int lamaSewa) {
        this.noPolisi = noPolisi;
        this.merek = merek;
        this.lamaSewa = lamaSewa;
    }

    public String getNoPolisi() {
        return noPolisi;
    }

    public void setNoPolisi(String noPolisi) {
        this.noPolisi = noPolisi;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public void setLamaSewa(int lamaSewa) {
        this.lamaSewa = lamaSewa;
    }
    public abstract void prosesBiayaRental();
  
}
