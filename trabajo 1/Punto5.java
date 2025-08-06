/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto5;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Punto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("ingrese num1: ");
        int num1 = input.nextInt(); 
        System.out.println("ingrese num2: ");
        int num2 = input.nextInt();
        System.out.println("suma: "+ (num1 + num2));
        System.out.println("resta: "+ (num1 - num2));
        System.out.println("multiplicacion: " + (num1 * num2));
        System.out.println("divicion: " + (num1 / num2));
        
    }
    
}
