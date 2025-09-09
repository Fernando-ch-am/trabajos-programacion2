/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto5.pkg5;

/**
 *
 * @author Fernando
 */
public class Computadora {
    private String marca;
    private String numeroSerie;

    // Composición: Computadora → PlacaMadre
    private PlacaMadre placaMadre;

    // Asociación bidireccional: Computadora ↔ Propietario
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, PlacaMadre placaMadre, Propietario propietario) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = placaMadre;
        this.propietario = propietario;

        // Mantener la asociación bidireccional
        propietario.setComputadora(this);
    }

    // Getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public void setPlacaMadre(PlacaMadre placaMadre) {
        this.placaMadre = placaMadre;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        propietario.setComputadora(this);
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Número de Serie: " + numeroSerie);
        System.out.println("Propietario: " + propietario.getNombre() + " (DNI: " + propietario.getDni() + ")");
        System.out.println("Placa Madre: " + placaMadre.getModelo() + ", Chipset: " + placaMadre.getChipset());
    }
}
