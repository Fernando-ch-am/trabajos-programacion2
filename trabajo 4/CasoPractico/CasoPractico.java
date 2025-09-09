/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso.practico;

/**
 *
 * @author Fernando
 */
public class CasoPractico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Crear empleados usando constructor completo
        Empleado emp1 = new Empleado("Ana Gómez", "Gerente", 75000);
        Empleado emp2 = new Empleado("Carlos Pérez", "Desarrollador", 55000);

        // Crear empleados usando constructor con nombre y puesto
        Empleado emp3 = new Empleado("Lucía Martínez", "Diseñadora");
        Empleado emp4 = new Empleado("Javier Díaz", "Tester");

        // Actualizar salario con porcentaje
        emp1.actualizarSalario(10); // Aumentar 10%
        emp3.actualizarSalario(15); // Aumentar 15%

        // Actualizar salario con cantidad fija
        emp2.actualizarSalario(5000); // Aumentar $5000
        emp4.actualizarSalario(2000); // Aumentar $2000

        // Imprimir información de los empleados
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);

        // Mostrar total de empleados
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
    
}
