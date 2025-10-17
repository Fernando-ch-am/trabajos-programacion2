/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversioncadena;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class ConversionCadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese un número: ");
            String input = sc.nextLine();
            int num = Integer.parseInt(input);
            System.out.println("Número ingresado: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no válida.");
        }
    }
}