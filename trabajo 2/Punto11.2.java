/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto11.pkg2;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Punto112 {

    // ✅ Variable global (estática) para el porcentaje de descuento
    static double descuentoEspecial = 0.10;

    // ✅ Método que aplica el descuento al precio
    public static void calcularDescuentoEspecial(double precio) {
        // Variable local dentro del método
        double descuentoAplicado = precio * descuentoEspecial;
        double precioFinal = precio - descuentoAplicado;

        // Mostrar resultados
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada del usuario
        System.out.print("Ingrese el precio del producto: ");
        double precio = input.nextDouble();

        // Llamada al método
        calcularDescuentoEspecial(precio);

        input.close();
    }
}
