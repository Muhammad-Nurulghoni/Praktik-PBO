/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS2501082010;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class ElektronikDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        
        System.out.println("=== INPUT DATA LAPTOP ===");
        
        System.out.print("Ukuran Layar  :");
        int ukuranLayar = input.nextInt();
        input.nextLine();
        
        
        System.out.print("Ukuran RAM :");
        int ukuranRAM = input.nextInt();
        
        System.out.print("Merek   : ");
        String merek = input.nextLine();
        
        System.out.print("Tahun Produksi : ");
        int tahunProduksi = input.nextInt();
        
        System.out.print("Garansi: ");
        int garansi = input.nextInt();
        
         Laptop l;
        l = new Laptop(
                ukuranLayar,
                ukuranRAM,
                merek,
                tahunProduksi,
                garansi);
                
                
        System.out.println("\n=== DATA LAPTOP ===");

        System.out.println("Ukuran Layar     : " + l.getUkuranLayar());
        System.out.println("Ukuran RAM       : " + l.getUkuranRAM());
        System.out.println("Merek            : " + l.getMerek());
        System.out.println("Tahun Produksi   : " + l.getTahunProduksi());
        System.out.println("Garansi          : " + l.getGaransi());
        System.out.println("Kartu Grafis     : " + l.getKartuGrafis());
        System.out.println("Regresh Rate     : " + l.getRefreshRate());
                
           
    }
        
    }
    

