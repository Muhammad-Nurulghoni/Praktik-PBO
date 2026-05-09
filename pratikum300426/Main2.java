/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum300426;

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class Main2 {
     public static void main(String[]argas){
       Scanner input = new Scanner(System.in); 
       
       System.out.print("masukkan jumlah pesawat:");
       int jumlah = input.nextInt();
       input.nextLine();
       
       Pesawat[]daftarPesawat= new Pesawat[jumlah];
       
       for(int i = 0; i< jumlah; i++){
           System.out.println("\n== Input Data Pesawat ke-"+(i+1)+"===");
           
           System.out.print("Nama Pesawat:");
           String nama = input.nextLine();
           
           System.out.print("Tahun Produksi:");
           int tahunProduksi = input.nextInt();
           
           System.out.print("Menggunakan mesin?(true/false):");
           boolean mesin = input.nextBoolean();
           
           System.out.print("Muatan (jumlah penumpang):");
           int muatan = input.nextInt();
           input.nextLine(); // Buang newline
           
           daftarPesawat[i] = new Pesawat(nama, tahunProduksi, mesin,muatan);
           
       }
       System.out.println("\n==== DAFTAR PESAWAT ===");
       System.out.println(">> Pesawaat ke- 1");
       daftarPesawat[0].cetak();
       
       int max = daftarPesawat[0].getMuatan();
       for(int i = 1; i< daftarPesawat.length; i++){
          System.out.println(">> Pesawat ke-"+(i + 1));
          daftarPesawat[i].Cetak();
          if(daftarPesawat[i].getMuatan()>max);
          {
              max = daftarPesawat[i].getMuatan();
              daftarPesawat[i].getNama();
          }
          System.out.println();
              
       }
    }
    
}
