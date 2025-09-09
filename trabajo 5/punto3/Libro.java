/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto3.pkg5;

/**
 *
 * @author Fernando
 */
public class Libro {
     private String titulo;
    private String isbn;

    // Asociación unidireccional: Libro -> Autor
    private Autor autor;

    // Agregación: Libro -> Editorial
    private Editorial editorial;

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }

    // Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    // Método para mostrar información del libro
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("ISBN: " + isbn);
        System.out.println("Autor: " + autor.getNombre() + " (" + autor.getNacionalidad() + ")");
        System.out.println("Editorial: " + editorial.getNombre() + ", " + editorial.getDireccion());
    }
}
