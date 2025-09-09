/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso.practico;

/**
 *
 * @author Fernando
 */
public class Empleado { // Atributos
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    // Atributo estático
    private static int totalEmpleados = 0;
    private static int siguienteId = 1;

    // Constructor completo (todos los atributos)
    public Empleado(String nombre, String puesto, double salario) {
        this.id = siguienteId++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    // Constructor sobrecargado (nombre y puesto)
    public Empleado(String nombre, String puesto) {
        this.id = siguienteId++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 30000.0; // Salario por defecto
        totalEmpleados++;
    }

    // Método sobrecargado: actualizarSalario con porcentaje
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    // Método sobrecargado: actualizarSalario con cantidad fija
    public void actualizarSalario(int cantidadFija) {
        this.salario += cantidadFija;
    }

    // Método toString
    @Override
    public String toString() {
        return "Empleado [ID=" + id + ", Nombre=" + nombre + ", Puesto=" + puesto + ", Salario=" + salario + "]";
    }

    // Método estático para mostrar total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
}
