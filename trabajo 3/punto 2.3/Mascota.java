/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto2.pkg3;

/**
 *
 * @author Fernando
 */
public class Mascota {
  public String Nombre;
  public String Especie;
  public int Edad;
  public void mostrarInfo(){
       System.out.println(Nombre + " es un " + Especie + ", y actualmente tiene " + Edad + " anios.");
   }
  public void cumplirAnios(){
       Edad++;
   }
    
}
