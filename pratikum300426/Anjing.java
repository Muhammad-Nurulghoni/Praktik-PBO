/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum300426;

/**
 *
 * @author Acer
 */
public class Anjing extends  Hewan{
    public Anjing(String nama){
        super(nama);
    }
    
    @Override
    public void Bersuara(){
        super.Bersuara();
        System.out.println(nama +"berkata: Guk guk!");
    }
}
