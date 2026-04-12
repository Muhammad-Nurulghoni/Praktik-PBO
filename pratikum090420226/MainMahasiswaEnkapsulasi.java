/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum090420226;

/**
 *
 * @author Acer
 */
import java.util.Scanner; 
public class MainMahasiswaEnkapsulasi {
     public static void main(String[]args){
        System.out.println("objek 1 menggunakan kontruuktor 1");
        MahasiswaEnkapsulasi ma = new MahasiswaEnkapsulasi();
        ma.setNama("Nurulghoni");
        ma.setNim("2501082010");
        ma.setJurusan("Teknologi Informasi");
        ma.setUmur(19);
        ma.setIpk(4);
        System.out.println();
        ma.TampilanInfo();
        System.out.println("Status kelulusan:"+ ma.statusKelulusan());
        
        System.out.println("\nobjek 2 menggunakan kontruuktor 2");
        MahasiswaEnkapsulasi ma1 = new MahasiswaEnkapsulasi("Khairunnisah","2501082018",
        "Teknologi Informasi",18,4.0);
        System.out.println();
        ma1.TampilanInfo();
        System.out.println("Status Kelulusan:"+ ma1.statusKelulusan());
        
        System.out.println("\nobjek 3 menggunakan kontruuktor 3");
        Scanner input = new Scanner (System.in);
        System.out.print(" Masukkan Nama\t\t:");
        String na = input.nextLine();
        System.out.print(" Masukkan Nim\t\t:");
        String ni = input.nextLine();
        System.out.print(" Masukkan Jurusan\t:");
        String jrsn = input.nextLine();
        System.out.print(" Masukkan Umur\t\t:");
        int umr = input.nextInt();
        System.out.print(" Masukkan IPK\t\t:");
        double ip =input.nextDouble();
        MahasiswaEnkapsulasi ma2 = new MahasiswaEnkapsulasi(na,ni,jrsn,umr,ip);
        ma2.TampilanInfo();
        System.out.println("Status Kelulusan:"+ ma2.statusKelulusan());
        
        
    }
}
