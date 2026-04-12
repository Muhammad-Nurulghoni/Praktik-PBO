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
public class MainAkunBankEnkapsulasi {
    public static void main(String[]args){
    AkunBankEnkapsulasi ak = new AkunBankEnkapsulasi();
    ak.setNama("Nurulghoni");
    ak.setNoRekening("35xxxxxx");
    ak.setSaldo(10000000);
    ak.TampilkanInfo();
    
    System.out.println();
    Scanner input = new Scanner(System.in);
    System.out.print("\nMasukan Jumlah Deposit = ");
    double deposit = input.nextDouble();
    ak.deposit(deposit);
    ak.TampilkanInfo();
    System.out.print("\nMasukan Jumlah Withdraw =");
    double withdraw = input.nextDouble();
    ak.withdraw(withdraw);
    ak.TampilkanInfo();
    System.out.println();
    
    System.out.print("\nMasukan Jumlah Deposit = ");
    double depositt = input.nextDouble();
    System.out.print("Masukan Jumlah Withdraw =");
    withdraw = input.nextDouble();
    AkunBankEnkapsulasi ak1 = new AkunBankEnkapsulasi("35xxxxxxx","Nurulghoni",1000000);
    ak1.withdraw(withdraw);
    ak1.deposit(withdraw);
    ak1.TampilkanInfo();
    
        
    
    }
}
