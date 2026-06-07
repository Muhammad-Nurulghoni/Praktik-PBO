/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum040626;

/**
 *
 * @author Acer
 */
public class Keyboard extends AlatMusik implements BisaDinyalakan{
    private boolean dayaTersambung;
            
    public Keyboard (boolean dayaTersambung , String nama, String jenis){
        super(nama, jenis);
        this.dayaTersambung = dayaTersambung;
    }

    @Override
    public void mainkan() {
        System.out.println(nama+ "dimaikan dengan menekan tuts.");
    }

    @Override
    public void stem() {
      System.out.println("Keyboard" +nama+ "distem digital dengan aplikasi");  
    }

    @Override
    public void nyalakan() {
        if(cekListrik()){
           System.out.println(nama+ "dinyalakan.");
        }  
        else{
            System.out.println(nama+ "tidak bisa nyala karena tidak ada daya");
        } 
    }

    @Override
    public void matikan() {
        System.out.println(nama+ "dimatikan");
    }

    @Override
    public boolean cekListrik() {
       
        return dayaTersambung;
    }
    
}
