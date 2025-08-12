/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto12.pkg2;

/**
 *
 * @author Fernando
 */
public class Punto122 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // a. Declarar e inicializar el array de precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // b. Mostrar los precios originales
        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }

        // c. Modificar el precio de un producto específico (por ejemplo, el tercero)
        precios[2] = 129.99;

        // d. Mostrar los precios modificados
        System.out.println("Precios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
    }
    
