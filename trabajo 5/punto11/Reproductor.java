/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto11.pkg5;

/**
 *
 * @author Fernando
 */
public class Reproductor {
    public void reproducir(Cancion cancion) {
        System.out.println("▶ Reproduciendo: " + cancion.getTitulo() +
                           " - " + cancion.getArtista().getNombre() +
                           " (" + cancion.getArtista().getGenero() + ")");
    }
}
