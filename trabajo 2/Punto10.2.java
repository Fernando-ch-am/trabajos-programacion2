/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto10.pkg2;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Punto102 {

    // Método que calcula el nuevo stock
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = input.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = input.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = input.nextInt();

        // Calcular nuevo stock
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        // Mostrar resultado
        System.out.println("El nuevo stock del producto es: " + nuevoStock);

        input.close();
    }
}
