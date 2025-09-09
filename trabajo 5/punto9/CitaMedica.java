/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto9.pkg5;

/**
 *
 * @author Fernando
 */
public class CitaMedica {
    private String fecha;
    private String hora;

    // Asociación unidireccional con Paciente y Profesional
    private Paciente paciente;
    private Profesional profesional;

    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }

    // Getters y setters
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    // Método para mostrar la info de la cita
    public void mostrarInfo() {
        System.out.println("📅 Cita médica:");
        System.out.println("Fecha: " + fecha + " Hora: " + hora);
        System.out.println("Paciente: " + paciente.getNombre() + " (Obra Social: " + paciente.getObraSocial() + ")");
        System.out.println("Profesional: " + profesional.getNombre() + " - " + profesional.getEspecialidad());
    }
}
