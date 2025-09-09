/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto3.pkg3;

/**
 *
 * @author Fernando
 */
public class Libro {
   private String Titulo="Programacion 2";
   private String Autor="Fernando Chacon";
   private int anoPublicacion;

    public String getTitulo() {
       return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public int setAnoPublicacion(int anoPublicacion) {
        if(anoPublicacion>=0 && anoPublicacion<=2025)
        this.anoPublicacion = anoPublicacion;
        return this.anoPublicacion;
        }
        
    }
   
