/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    // 1) Agregar libro
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(libro);
    }

    // 2) Listar todos los libros
    public void listarLibros() {
        if(libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            for (Libro l : libros) {
                l.mostrarInfo();
            }
        }
    }

    // 3) Buscar libro por ISBN
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                return l;
            }
        }
        return null;
    }

    // 4) Eliminar libro por ISBN
    public boolean eliminarLibro(String isbn) {
        Libro libroEliminar = buscarLibroPorIsbn(isbn);
        if(libroEliminar != null) {
            libros.remove(libroEliminar);
            return true;
        }
        return false;
    }

    // 5) Obtener cantidad total de libros
    public int obtenerCantidadLibros() {
        return libros.size();
    }

    // 6) Filtrar libros por año
    public void filtrarLibrosPorAnio(int anio) {
        boolean encontrado = false;
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                l.mostrarInfo();
                encontrado = true;
            }
        }
        if(!encontrado) {
            System.out.println("No se encontraron libros publicados en el año " + anio);
        }
    }

    // 7) Mostrar autores disponibles
    public void mostrarAutoresDisponibles() {
        List<Autor> autoresMostrados = new ArrayList<>();
        for (Libro l : libros) {
            Autor autor = l.getAutor();
            if (!autoresMostrados.contains(autor)) {
                autoresMostrados.add(autor);
                autor.mostrarInfo();
            }
        }
    }
}
