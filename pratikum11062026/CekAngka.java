/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum11062026;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class CekAngka {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        int hasil;
        try {
            System.out.print("Masukkan bilangan pertama : ");
            a = input.nextInt();
            System.out.print("Masukkan bilangan kedua : ");
            b = input.nextInt();
            hasil = a / b;
            System.out.println(a + " / " + b + " = " + hasil);

        } catch (InputMismatchException e) {
            System.out.println("Masukkan nilai berupa angka");
        } catch (ArithmeticException e) {
            System.out.print("Nilai ke 2/penyebut tidak boleh nol");

        } catch (Exception e) {
            System.out.println("Error tak terduga " + e.getMessage());
        } finally {
            System.out.println("Pengecekan nilai selesai");
        }
    }
}
