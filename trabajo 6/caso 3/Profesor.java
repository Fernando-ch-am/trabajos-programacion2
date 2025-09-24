/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso3;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    public List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
        }
        // Sincronizar lado del curso
        if (c.getProfesor() != this) {
            c.setProfesor(this);
        }
    }

   public void eliminarCurso(Curso c) {
    if (cursos.contains(c)) {
        cursos.remove(c);
    }
    // Romper relación desde el curso SOLO si el curso apunta a este profesor
    if (c.getProfesor() == this) {
        c.profesor = null; // ⚡ Accedemos directamente para evitar recursión
    }
}

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println(nombre + " no dicta cursos actualmente.");
        } else {
            System.out.println("Cursos de " + nombre + ":");
            for (Curso c : cursos) {
                System.out.println(" - " + c.getCodigo() + ": " + c.getNombre());
            }
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + " | ID: " + id + " | Especialidad: " + especialidad
                + " | Cantidad de cursos: " + cursos.size());
    }
}

