/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto8;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Punto8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("ingrese num1: ");
        int num1=input.nextInt();
        System.out.println("ingrese num2: ");
        int num2=input.nextInt();
        double resultado=num1/num2;
        System.out.println(resultado);
        
    }
    
}
