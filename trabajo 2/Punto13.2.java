/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto13.pkg2;

/**
 *
 * @author Fernando
 */
public class Punto132 {

    // Función recursiva para imprimir los precios
    public static void imprimirPrecios(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.println("Precio: $" + precios[indice]);
            imprimirPrecios(precios, indice + 1);  // llamada recursiva con el siguiente índice
        }
    }

    public static void main(String[] args) {
        // a. Declarar e inicializar el array con precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // b. Mostrar precios originales usando recursión
        System.out.println("Precios originales:");
        imprimirPrecios(precios, 0);

        // c. Modificar el precio del producto en la posición 2
        precios[2] = 129.99;

        // d. Mostrar precios modificados usando recursión
        System.out.println("Precios modificados:");
        imprimirPrecios(precios, 0);
    }
}
