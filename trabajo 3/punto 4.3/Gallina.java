/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto4.pkg3;

/**
 *
 * @author Fernando
 */
public class Gallina {
   public int idGallina;
   public int edad;
   public int huevosPuestos;
   public int ponerHuevo(int huevos){
   return huevosPuestos+=huevos;
   }
   public void envejecer(){
   edad++;
   }
   public void mostrarEstado(){
       System.out.println("el id de la gallina es: " + idGallina + "\nsu edad es de: " + edad  + " anios\npuso  " + huevosPuestos +  " huevos" );}
}
