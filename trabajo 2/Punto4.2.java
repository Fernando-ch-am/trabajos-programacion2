/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto4.pkg2;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Punto42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("ingrese el precio de su producto: ");
       int producto = Integer.parseInt(input.nextLine());
        System.out.print("ingrese que categoria es (A,B,C): ");
        String categoria=input.nextLine();
        if (categoria.equalsIgnoreCase("a")){
            System.out.println("descuento aplicado: 10% de descuento\n" + "Precio final: " + ((producto/100) * 90));}
        else if (categoria.equalsIgnoreCase("b")){
            System.out.println("descuento aplicado: 15% de descuento\n" + "Precio final: " + ((producto/100) * 85));}
        else if (categoria.equalsIgnoreCase("c")) {
            System.out.println("descuento aplicado: 20% de descuento\n" + "Precio final: " + ((producto/100) * 80));}
        else { 
            System.out.println("error, ingrese una categoria valida");}
        
        
    }
    
}
