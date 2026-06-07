/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum210526;

/**
 *
 * @author Acer
 */
public class BiayaRentalBis extends BiayaRental {
    private int kapasitas;
    private double sewaBis;

    public BiayaRentalBis(int kapasitas, String noPolisi, String merek, int lamaSewa, double sewaBis) {
        super(noPolisi, merek, lamaSewa);
        this.kapasitas = kapasitas;
        this.sewaBis = sewaBis;
    }

   
    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

        public double getSewaBis() {
            return sewaBis;
        }

        public void setSewaBis(double sewaBis) {
            this.sewaBis = sewaBis;
        }

   
    
    @Override
    public void prosesBiayaRental(){
        double totalBayar = sewaBis * lamaSewa;
        if(kapasitas >= 35){
        totalBayar += 500000;
        }
        else if(kapasitas <= 24){
        totalBayar += 200000;
        }
        else{
          totalBayar  += 100000;
        }
         System.out.println("No Polisi               :"+noPolisi);
         System.out.println("Kapsitas                :"+kapasitas);
         System.out.println("Merek bis               :"+merek);
         System.out.println("Berapa lama rental Bis  :"+lamaSewa);
         System.out.println("Harga Sewa Bis          :"+sewaBis);
         System.out.println("Total bayar rental bis  :"+totalBayar);
         
        
     }  
}
