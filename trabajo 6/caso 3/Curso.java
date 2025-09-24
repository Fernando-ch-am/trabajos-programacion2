/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso3;

/**
 *
 * @author Fernando
 */
public class Curso {
    private String codigo;
    private String nombre;
    public Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null; // Inicialmente sin profesor
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor p) {
    // Si ya tenía un profesor distinto, quitar de su lista
    if (profesor != null && profesor != p) {
        if (profesor.cursos.contains(this)) {
            profesor.cursos.remove(this); // ⚡ Sin llamar a eliminarCurso para evitar bucle
        }
    }

    profesor = p;

    // Agregar a la lista del nuevo profesor si no estaba
    if (p != null && !p.cursos.contains(this)) {
        p.cursos.add(this); // ⚡ Agregar directamente para evitar recursión
    }
}

    public void mostrarInfo() {
        System.out.println("Curso: " + nombre + " | Código: " + codigo);
        if (profesor != null) {
            System.out.println("Profesor: " + profesor.getNombre());
        } else {
            System.out.println("Profesor: [sin asignar]");
        }
    }
}

