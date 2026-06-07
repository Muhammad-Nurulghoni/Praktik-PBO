/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum210526;

/**
 *
 * @author Acer
 */
public class BiayaRentalMotor  extends BiayaRental {
     private double sewaMotor;

    public BiayaRentalMotor() {
    }

   

    public BiayaRentalMotor(double sewaMotor, String noPolisi, String merek, int lamaSewa) {
        super(noPolisi, merek, lamaSewa);
        this.sewaMotor = sewaMotor;
    }

   
    
    
    public double getSewaMotor() {
        return sewaMotor;
    }

    public void setSewaMotor(double sewaMotor) {
        this.sewaMotor = sewaMotor;
    }
    
    
     public void prosesBiayaRental(){
         double totalBayar =sewaMotor * lamaSewa;
         if(lamaSewa >= 12){
         totalBayar -= 0.10 * totalBayar;
         }
         else if(lamaSewa  >=7){
         totalBayar -= 0.05 * totalBayar;
         }
         else{
           System.out.println("Tidak ada diskon");

         }
         System.out.println("No Polisi               :"+noPolisi);
         System.out.println("Merek motor             :"+merek);
         System.out.println("Berapa lama rental motor:"+lamaSewa);
         System.out.println("Harga Sewa Motor        :"+sewaMotor);
         System.out.println("Total bayar Rental Motor:"+totalBayar);
        
     }
    
}
