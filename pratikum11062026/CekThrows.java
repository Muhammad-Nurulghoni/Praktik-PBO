/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pratikum11062026;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class CekThrows {
    //method exception
    public static void cekAngka(int a)throws Exception{
        //body throws
        if(a<0){
            throw new Exception ("Nilai tidak boleh negatif");
        }else if(a>100){
            throw new Exception ("Nilai tidak boleh melebihi 100");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan sebuah angka = ");
        int angka=in.nextInt();
        
        try{
            cekAngka(angka);
            System.out.println("Nilai berhasil diimpan!");
        }catch (Exception ex){
            System.out.println("Error" +ex.getMessage());
            
        }
    }
    
}
