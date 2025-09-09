/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto1.pkg5;

/**
 *
 * @author Fernando
 */
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;        // Composición
    private Titular titular;  // Asociación bidireccional

    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato); // Composición → el pasaporte crea y contiene la foto
    }

    // Getters y setters
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getFechaEmision() { return fechaEmision; }
    public void setFechaEmision(String fechaEmision) { this.fechaEmision = fechaEmision; }

    public Foto getFoto() { return foto; }

    public Titular getTitular() { return titular; }
    public void setTitular(Titular titular) {
        this.titular = titular;
        titular.setPasaporte(this); // mantener la relación bidireccional
}
