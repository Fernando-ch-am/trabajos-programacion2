/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte1.pkg8;

/**
 *
 * @author Fernando
 */
public class PayPal extends PagoConDescuento {
    public void procesarPago(double monto) {
        System.out.println("Pagando con PayPal: $" + monto);
    }

    public double aplicarDescuento(double monto) {
        return monto * 0.90; // 10% de descuento
    }
}
