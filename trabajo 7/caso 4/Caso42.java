/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso4.pkg2;

import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class Caso42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Firulais"));
        animales.add(new Gato("Misu"));
        animales.add(new Vaca("Lola"));

        // Uso polimorfico: cada animal hace su sonido
        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();
            System.out.println("-----");
        }
    }
    
}
