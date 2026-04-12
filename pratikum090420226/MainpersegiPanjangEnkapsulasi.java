/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum090420226;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class MainpersegiPanjangEnkapsulasi {
    public static void main(String[] args){
    System.out.println("jumlah objek="+persegiPanjangEnkapsulasi.getjumlahObjek());
    persegiPanjangEnkapsulasi pp1 = new persegiPanjangEnkapsulasi();
    pp1.setpanjang(10);
    pp1.setlebar(7);
    System.out.println("\nobjek 1 menggunakan kontruuktor 1");
    System.out.println("\nakses method dalam main class");System.out.println("\nobjek 1 menggunakan kontruuktor 1");
    
    System.out.println("\nluas persegi panjang="+pp1.gethitungLuas());
    System.out.println("\nkeliling="+pp1.gethitungKeliling());
    System.out.println();
    pp1.tampilkanData();
    
    //projek pp2 menggunakan contruktor 2
    System.out.println("\nobjek 2 menggunakan kontruuktor 2");
    persegiPanjangEnkapsulasi pp2 = new persegiPanjangEnkapsulasi(19,10);
    System.out.println("\nakses method dalam main class");
    System.out.println();
    pp2.tampilkanData();
    
    //probjek pp3 menggunakan construktor 3 dengan input user
    int panjang, lebar;
    Scanner input = new Scanner(System.in);
    System.out.println();
    System.out.println("masukan panjang=");
    panjang = input.nextInt();
    System.out.println("masukan lebar=");
    lebar = input.nextInt();
    persegiPanjangEnkapsulasi pp3 = new persegiPanjangEnkapsulasi(panjang, lebar);
    pp3.tampilkanData();
    System.out.println("jumlah objek="+persegiPanjangEnkapsulasi.getjumlahObjek());
    }
    
    
}
