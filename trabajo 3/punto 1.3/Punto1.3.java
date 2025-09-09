/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto1.pkg3;

import punto1.Estudiantes;

/**
 *
 * @author Fernando
 */
public class Punto13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiantes E1= new Estudiantes();
        E1.Nombre="juan";
        E1.Apellido="Gomez";
        E1.Curso="sexto 'b'";
        E1.subirCalificacion(10);
        E1.bajarCalificacion(3);
        E1.mostrarInfo();
    }
}
