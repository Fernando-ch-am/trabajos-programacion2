/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto3.pkg2;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Punto32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
        System.out.print("ingrese su edad: ");
        int edad=input.nextInt();
         if (edad >= 0 && edad <= 12 ) {
             System.out.println("es menor");
        } else if (edad > 12 && edad <= 17) {
             System.out.println("es adolecente");
        } else if (edad >=18) {
             System.out.println("es adulto");
    }   else {
             System.out.println("no es una edad valida");
    }
    
    }
    
}
