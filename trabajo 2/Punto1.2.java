/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto.pkg1.pkg2;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Punto12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("ingrese un anio para comprobar si es bisiesto: ");
        int anioBisiesto= input.nextInt();
       if ((anioBisiesto % 4 == 0 && anioBisiesto % 100 != 0) || (anioBisiesto % 400 == 0)) {
            System.out.println("El año " + anioBisiesto + " es bisiesto.");
        } else {
            System.out.println("El año " + anioBisiesto + " no es bisiesto.");
    
}
    }
    
}
