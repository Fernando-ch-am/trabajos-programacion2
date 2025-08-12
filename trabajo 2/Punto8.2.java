/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto8.pkg2;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Punto82 {

    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double impuestoDecimal = impuesto / 100.0;
        double descuentoDecimal = descuento / 100.0;
        double precioFinal = precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);
        return precioFinal;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = input.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = input.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = input.nextDouble();

        // Llamada directa al método static
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        System.out.println("El precio final del producto es: " + precioFinal);

        input.close();
    }
}