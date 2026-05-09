/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum300426;

/**
 *
 * @author Acer
 */
public class Hewan {
      protected String nama;
   
   public  Hewan(String nama){
       this.nama = nama;
   }
   public void Bersuara()
   {
       System.out.println("Hewan bersuara...");
   }
   public void TampilkanNama(){
       System.out.println("Nama hewan :"+nama);
   }
}
