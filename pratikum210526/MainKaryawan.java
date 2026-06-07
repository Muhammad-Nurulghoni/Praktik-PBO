/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum210526;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class MainKaryawan {
    public static void main(String[]args){
       Scanner input = new Scanner(System.in);
       Karyawan karyawan = null;
       System.out.println("Sistem Penggajian Karyawan");
       System.out.println("--------------------------");
       
       System.out.print("Masukkan Nama :");
       String na = input.nextLine();
       
       System.out.print("Masukkan Nik  :");
       String nk = input.nextLine();
      
       System.out.println("Pilihan Divisi");
       System.out.println("1.Karyawan Tetap");
       System.out.println("2.Karyawan Kontrak");
       System.out.print("Pilihan Divisi(1-2) : ");
       int pil = input.nextInt();
       
       switch(pil){
           case 1:
               System.out.println("Karyawan Tetap :");
               System.out.print("Masukkan golongan :");
               int golongan = input.nextInt();
               karyawan = new KaryawanTetap(golongan,nk,na);
               break;
           case 2:
               System.out.println("Karyawan Kontrak");
               karyawan = new KaryawanKontrak(nk,na);
           default:
               System.out.println("Pilihan tidak tersedia");
       }
       
       System.out.println("Konfirmasi Gaji Karyawan");
       karyawan.prosesKaryawan();
    }
}
