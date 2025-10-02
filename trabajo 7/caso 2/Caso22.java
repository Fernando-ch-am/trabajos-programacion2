/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso2.pkg2;

/**
 *
 * @author Fernando
 */
public class Caso22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Array de figuras (polimorfismo)
        Figura[] figuras = new Figura[3];
        figuras[0] = new Circulo(5);        // Radio = 5
        figuras[1] = new Rectangulo(4, 6);  // Base=4, Altura=6
        figuras[2] = new Circulo(3);        // Radio = 3

        // Mostrar áreas
        for (Figura f : figuras) {
            System.out.println(f.getNombre() + " Area = " + f.calcularArea());
        }
    }
    
}
