/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto2.pkg5;

/**
 *
 * @author Fernando
 */
public class Celular {
     private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;   // Agregación
    private Usuario usuario;   // Asociación bidireccional

    public Celular(String imei, String marca, String modelo) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getImei() { return imei; }
    public void setImei(String imei) { this.imei = imei; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public Bateria getBateria() { return bateria; }
    public void setBateria(Bateria bateria) { this.bateria = bateria; } // agregación: se inyecta

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        usuario.setCelular(this); // mantener bidireccionalidad
    }
}
