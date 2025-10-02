/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso5.pkg2;

/**
 *
 * @author Fernando
 */

public class ProcesarPagos {

    // Método genérico que recibe cualquier Pagable
    public void procesarPago(Pagable medio) {
        medio.pagar();  // Llama al método pagar() específico del medio
    }
}
