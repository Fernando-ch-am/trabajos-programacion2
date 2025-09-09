/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto7.pkg5;

/**
 *
 * @author Fernando
 */
public class Motor {
    private String tipo;
    private String numeroSerie;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }
    
    public void MostrarInfo(){
      System.out.println("tipo: " + tipo + ", numero de serie: " + numeroSerie);}
}