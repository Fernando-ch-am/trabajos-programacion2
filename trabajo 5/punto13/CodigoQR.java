/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto13.pkg5;

/**
 *
 * @author Fernando
 */
public class CodigoQR {
      private String valor;
    private Usuario usuario;

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    // Getters y setters
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    // Mostrar información
    public void mostrarInfo() {
        System.out.println("Código QR generado: " + valor);
        System.out.println("Usuario: " + usuario.getNombre() + " <" + usuario.getEmail() + ">");
    }
}
