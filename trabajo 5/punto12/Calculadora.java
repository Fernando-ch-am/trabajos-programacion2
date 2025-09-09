/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto12.pkg5;

/**
 *
 * @author Fernando
 */
public class Calculadora {
     public void calcular(Impuesto impuesto) {
        double monto = impuesto.getMonto();
        double total = monto * 1.21; // simula IVA 21%

        System.out.println("🧾 Impuesto para: " + impuesto.getContribuyente().getNombre() +
                           " (CUIL: " + impuesto.getContribuyente().getCuil() + ")");
        System.out.println("Monto base: $" + monto);
        System.out.println("Total con IVA (21%): $" + total);
    }
}
