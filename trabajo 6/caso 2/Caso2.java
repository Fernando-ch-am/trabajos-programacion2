/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso2;

/**
 *
 * @author Fernando
 */
public class Caso2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // 1) Crear biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // 2) Crear autores
        Autor autor1 = new Autor("A001", "Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("A002", "J.K. Rowling", "Británica");
        Autor autor3 = new Autor("A003", "George Orwell", "Británico");

        // 3) Agregar 5 libros
        biblioteca.agregarLibro("ISBN001", "Cien Años de Soledad", 1967, autor1);
        biblioteca.agregarLibro("ISBN002", "Harry Potter y la Piedra Filosofal", 1997, autor2);
        biblioteca.agregarLibro("ISBN003", "1984", 1949, autor3);
        biblioteca.agregarLibro("ISBN004", "Harry Potter y la Cámara Secreta", 1998, autor2);
        biblioteca.agregarLibro("ISBN005", "El Amor en los Tiempos del Cólera", 1985, autor1);

        // 4) Listar todos los libros
        biblioteca.listarLibros();

        // 5) Buscar libro por ISBN
   
        Libro buscado = biblioteca.buscarLibroPorIsbn("ISBN002");
        if(buscado != null) buscado.mostrarInfo();

        // 6) Filtrar libros por año
        
        biblioteca.filtrarLibrosPorAnio(1997);

        // 7) Eliminar un libro
     
        if(biblioteca.eliminarLibro("ISBN003")) {
            System.out.println("Libro eliminado correctamente.");
        }

        // Listar libros restantes
        biblioteca.listarLibros();

        // 8) Mostrar cantidad total de libros
        System.out.println("Cantidad total de libros: " + biblioteca.obtenerCantidadLibros());

        // 9) Listar todos los autores
  
        biblioteca.mostrarAutoresDisponibles();
}}

