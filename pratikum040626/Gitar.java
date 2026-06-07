/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum040626;

/**
 *
 * @author Acer
 */
public class Gitar extends AlatMusik{
    private int JumlahSenar;

    public Gitar(int JumlahSenar, String nama, String jenis) {
        super(nama, jenis);
        this.JumlahSenar = JumlahSenar;
    }

    @Override
    public void mainkan() {
        String jumlahSenar = null;
        System.out.println(nama +"dipetik dengan +" +jumlahSenar+ "senar");
    }

    @Override
    public void stem() {
        System.out.println("Menyetem gitar" +nama+ "secara manual");
    }

    public int getJumlahSenar() {
        return JumlahSenar;
    }

    public void setJumlahSenar(int JumlahSenar) {
        this.JumlahSenar = JumlahSenar;
    }
    
    
   
    
   
    
}
