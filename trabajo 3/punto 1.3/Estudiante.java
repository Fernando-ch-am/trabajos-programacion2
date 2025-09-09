package punto1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fernando
 */
public class Estudiante{
    public String Nombre;
    public String Apellido;
    public int Calificaciones;
    public String Curso;
    
   public void mostrarInfo(){ 
        System.out.println(Nombre + " " + Apellido + ", su calificacion es: " + Calificaciones + ", su curso es: " + Curso);
    }
    
   public int subirCalificacion(int puntos){
   return Calificaciones+=puntos;
   }
   
    public int bajarCalificacion(int puntos){
        if(puntos<=Calificaciones);
   return Calificaciones-=puntos;
    }
}
