/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto9.pkg2;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Punto92{

    // a. Método para calcular el costo de envío
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5.0;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10.0;
        } else {
            // Zona inválida
            return -1;  // Se puede usar para validar más adelante
        }
    }

    // b. Método para calcular el total de la compra
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = input.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = input.nextDouble();

        input.nextLine();  // Limpia el salto de línea
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = input.nextLine();

        // Calcular costo de envío
        double costoEnvio = calcularCostoEnvio(peso, zona);

        // Validar zona
        if (costoEnvio == -1) {
            System.out.println("Zona de envío no válida. Debe ser 'Nacional' o 'Internacional'.");
        } else {
            // Calcular total
            double total = calcularTotalCompra(precioProducto, costoEnvio);

            // Mostrar resultados
            System.out.println("El costo de envío es: " + costoEnvio);
            System.out.println("El total a pagar es: " + total);
        }

        input.close();
    }
}
    