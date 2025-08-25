/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto3.pkg3;

/**
 *
 * @author Fernando
 */
public class Punto33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro L1= new Libro();
        L1.setAnoPublicacion(2007);
        L1.setAnoPublicacion(-32);
        System.out.println("el autor es: " + L1.getAutor());
        System.out.println("el titulo del libro es: " + L1.getTitulo());
        System.out.println("el anio de publicacion del libro fue en: " + L1.getAnoPublicacion());
    }
    
}
