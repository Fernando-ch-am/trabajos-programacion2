/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso3;

/**
 *
 * @author Fernando
 */
import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p) {
        if (!profesores.contains(p)) {
            profesores.add(p);
        }
    }

    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
        }
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) return p;
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) return c;
        }
        return null;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);
        if (c != null && p != null) {
            c.setProfesor(p);
        } else {
            System.out.println("Curso o profesor no encontrado.");
        }
    }

    public void listarProfesores() {
        System.out.println("Profesores en " + nombre + ":");
        for (Profesor p : profesores) {
            p.mostrarInfo();
            p.listarCursos();
            System.out.println("----------------");
        }
    }

    public void listarCursos() {
        System.out.println("Cursos en " + nombre + ":");
        for (Curso c : cursos) {
            c.mostrarInfo();
            System.out.println("----------------");
        }
    }

    public void eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c != null) {
            // Romper relación con profesor
            if (c.getProfesor() != null) {
                c.setProfesor(null);
            }
            cursos.remove(c);
        }
    }

    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p != null) {
            // Romper relación con cursos
            List<Curso> cursosProfesor = new ArrayList<>(p.cursos); // copia para evitar ConcurrentModification
            for (Curso c : cursosProfesor) {
                c.setProfesor(null);
            }
            profesores.remove(p);
        }
    }

    // Reporte: cantidad de cursos por profesor
    public void reporteCantidadCursosPorProfesor() {
        System.out.println("Reporte de cursos por profesor:");
        for (Profesor p : profesores) {
            System.out.println(p.getNombre() + ": " + p.cursos.size() + " cursos.");
        }
    }
}

