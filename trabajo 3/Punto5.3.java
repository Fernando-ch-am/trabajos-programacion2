/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto5.pkg3;

/**
 *
 * @author Fernando
 */
public class Punto53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         NaveEspacial nave = new NaveEspacial("Explorer I", 50);

        // Despegar
        nave.despegar();

        // Intentar avanzar sin recargar
        System.out.println("\nIntentando avanzar 30 unidades...");
        nave.avanzar(30); // necesitaría 60 de combustible → debería fallar

        // Recargar 40 unidades
        System.out.println("\nRecargando 40 unidades de combustible...");
        nave.recargarCombustible(40); // debería quedar en 90

        // Avanzar ahora que tiene suficiente combustible
        System.out.println("\nAvanzando 30 unidades...");
        nave.avanzar(30); // consumo: 60 → debe ser exitoso

        // Mostrar estado final
        System.out.println("\nEstado final:");
        nave.mostrarEstado();
    }
    
}
