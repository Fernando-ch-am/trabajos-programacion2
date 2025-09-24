/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso3;

/**
 *
 * @author Fernando
 */
public class Caso3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Universidad uni = new Universidad("Universidad Nacional");

        // 1) Crear profesores
        Profesor prof1 = new Profesor("P001", "Juan Perez", "Matemática");
        Profesor prof2 = new Profesor("P002", "Ana Gomez", "Física");
        Profesor prof3 = new Profesor("P003", "Carlos Ruiz", "Programación");

        // 2) Crear cursos
        Curso c1 = new Curso("C101", "Álgebra");
        Curso c2 = new Curso("C102", "Física I");
        Curso c3 = new Curso("C103", "Programación I");
        Curso c4 = new Curso("C104", "Cálculo");
        Curso c5 = new Curso("C105", "Física II");

        // 3) Agregar profesores y cursos a la universidad
        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // 4) Asignar profesores a cursos
        uni.asignarProfesorACurso("C101", "P001");
        uni.asignarProfesorACurso("C104", "P001");
        uni.asignarProfesorACurso("C102", "P002");
        uni.asignarProfesorACurso("C105", "P002");
        uni.asignarProfesorACurso("C103", "P003");

        // 5) Listar cursos y profesores
        uni.listarCursos();
        uni.listarProfesores();

        // 6) Cambiar profesor de un curso
        System.out.println("---- Cambiar profesor de C105 ----");
        uni.asignarProfesorACurso("C105", "P003");
        uni.listarCursos();
        uni.listarProfesores();

        // 7) Eliminar un curso
        System.out.println("---- Eliminar curso C102 ----");
        uni.eliminarCurso("C102");
        uni.listarCursos();
        uni.listarProfesores();

        // 8) Eliminar un profesor
        System.out.println("---- Eliminar profesor P001 ----");
        uni.eliminarProfesor("P001");
        uni.listarProfesores();
        uni.listarCursos();

        // 9) Reporte de cantidad de cursos por profesor
        uni.reporteCantidadCursosPorProfesor();
    }
    }
    
