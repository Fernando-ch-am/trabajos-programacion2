/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto5.pkg2;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Punto52 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
        int num;
        int sumapares=0;
        System.out.print("Ingrese un número (0 para terminar): ");
        num= input.nextInt();
        while (num!=0){
            if (num % 2==0){
                sumapares += num;
            }
            System.out.print("Ingrese un número (0 para terminar): ");
        num= input.nextInt();
           
        }
        System.out.println("la suma de los numeros pares es: " + sumapares);
        
       
    }}
    