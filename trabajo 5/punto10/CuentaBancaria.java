/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto10.pkg5;

/**
 *
 * @author Fernando
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;

    // Composición → la cuenta crea y controla su clave
    private ClaveSeguridad claveSeguridad;

    // Asociación bidireccional
    private Titular titular;

    public CuentaBancaria(String cbu, double saldo, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;

        // Composición: la cuenta siempre tiene su clave
        this.claveSeguridad = new ClaveSeguridad("ABC123", "2025-09-09");

        // Asociación bidireccional
        this.titular = titular;
        titular.setCuentaBancaria(this);
    }

    // Getters y setters
    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }

    public void setClaveSeguridad(ClaveSeguridad claveSeguridad) {
        this.claveSeguridad = claveSeguridad;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    // Mostrar info de la cuenta
    public void mostrarInfo() {
        System.out.println("Cuenta bancaria:");
        System.out.println("CBU: " + cbu + " | Saldo: $" + saldo);
        System.out.println("Titular: " + titular.getNombre() + " (DNI: " + titular.getDni() + ")");
        System.out.println("Clave de seguridad: " + claveSeguridad.getCodigo() +
                           " | Última modificación: " + claveSeguridad.getUltimaModificacion());
    }
}
