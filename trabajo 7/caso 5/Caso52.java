/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso5.pkg2;

/**
 *
 * @author Fernando
 */
public class Caso52 {
 public static void main(String[] args) {
        ProcesarPagos posnet = new ProcesarPagos();

        Pagable tarjeta = new TarjetaCredito();
        Pagable transferencia = new Transferencia();
        Pagable efectivo = new Efectivo();

        posnet.procesarPago(tarjeta);       // Se pago con TarjetaCredito
        posnet.procesarPago(transferencia);  // Se pago con Transferencia
        posnet.procesarPago(efectivo);       // Se pago en Efectivo
    }
}
