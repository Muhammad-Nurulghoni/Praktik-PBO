/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum23042026;

/**
 *
 * @author Acer
 */
public class MainAuthor {
      public static void main(String[]args){
        Author Rin = new Author ("Peter Lee", "peter@nowhere.com", 'm');
        System.out.println(Rin);
        
        Rin.setEmail("peter@nowhere.com");
        System.out.println(Rin);
        System.out.println("Name:"+Rin.getName());
        System.out.println("gender: "+Rin.getGender());
        System.out.println("Gmail:"+Rin.getEmail());
        
    }
    
}
