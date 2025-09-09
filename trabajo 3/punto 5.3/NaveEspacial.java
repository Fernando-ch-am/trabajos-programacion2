/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto5.pkg3;

/**
 *
 * @author Fernando
 */
public class NaveEspacial {
      private String nombre;
    private int combustible;
    private final int combustibleMaximo = 100; // límite superior

    // Constructor
    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        if (combustibleInicial <= combustibleMaximo) {
            this.combustible = combustibleInicial;
        } else {
            this.combustible = combustibleMaximo;
        }
    }

    // Método para despegar
    public void despegar() {
        System.out.println(nombre + " ha despegado.");
    }

    // Método para avanzar cierta distancia
    public void avanzar(int distancia) {
        int consumo = distancia * 2; // regla: 2 unidades por unidad de distancia
        if (consumo <= combustible) {
            combustible -= consumo;
            System.out.println(nombre + " ha avanzado " + distancia + " unidades.");
        } else {
            System.out.println("Combustible insuficiente para avanzar " + distancia + " unidades.");
        }
    }

    // Método para recargar combustible
    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= combustibleMaximo) {
            combustible += cantidad;
            System.out.println("Combustible recargado en " + cantidad + " unidades.");
        } else {
            System.out.println("No se puede recargar. Excedería el límite de " + combustibleMaximo + " unidades.");
        }
    }

    // Mostrar estado
    public void mostrarEstado() {
        System.out.println("Nave: " + nombre);
        System.out.println("Combustible actual: " + combustible + "/" + combustibleMaximo);
    }
    
}
