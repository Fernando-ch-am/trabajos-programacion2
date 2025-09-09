/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto14.pkg5;

/**
 *
 * @author Fernando
 */
public class Render {
     private String formato;
    private Proyecto proyecto;

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    // Getters y setters
    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public void mostrarInfo() {
        System.out.println("🎞 Render del proyecto: " + proyecto.getNombre());
        System.out.println("Duración: " + proyecto.getDuracionMin() + " minutos");
        System.out.println("Formato de exportación: " + formato);
    }
}
