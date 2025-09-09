/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto8.pkg5;

/**
 *
 * @author Fernando
 */
public class Documento {
    private String titulo;
    private String contenido;

    // Composición: Documento → FirmaDigital
    private FirmaDigital firmaDigital;

    public Documento(String titulo, String contenido, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;

        // El documento crea su propia firma digital (composición)
        String codigoHash = generarHash(contenido);
        this.firmaDigital = new FirmaDigital(codigoHash, "2025-09-09", usuario);
    }

    // Simulación de hash (en la práctica usarías un algoritmo real como SHA-256)
    private String generarHash(String texto) {
        return Integer.toHexString(texto.hashCode());
    }

    // Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }

    public void setFirmaDigital(FirmaDigital firmaDigital) {
        this.firmaDigital = firmaDigital;
    }

    // Mostrar información del documento y su firma
    public void mostrarInfo() {
        System.out.println("Documento: " + titulo);
        System.out.println("Contenido: " + contenido);
        System.out.println("Firma digital: " + firmaDigital.getCodigoHash() + " (" + firmaDigital.getFecha() + ")");
        System.out.println("Firmado por: " + firmaDigital.getUsuario().getNombre() + " <" + firmaDigital.getUsuario().getEmail() + ">");
    }
}
