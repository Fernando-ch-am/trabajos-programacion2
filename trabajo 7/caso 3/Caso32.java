/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso3.pkg2;

import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class Caso32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Ana", 50000));
        empleados.add(new EmpleadoTemporal("Luis", 20, 2000));
        empleados.add(new EmpleadoTemporal("Maria", 15, 1800));

        // Uso polimorfico de calcularSueldo
        for (Empleado e : empleados) {
            System.out.println("Empleado: " + e.getNombre() + 
                               " - Sueldo: " + e.calcularSueldo());

            // Clasificacion con instanceof
            if (e instanceof EmpleadoPlanta) {
                System.out.println(" -> Es un empleado de planta.");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println(" -> Es un empleado temporal.");
            }
    }
    }
}
