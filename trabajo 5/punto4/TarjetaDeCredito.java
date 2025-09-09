/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fernando
 */
public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;

    // Asociación bidireccional: TarjetaDeCrédito ↔ Cliente
    private Cliente cliente;

    // Agregación: TarjetaDeCrédito → Banco
    private Banco banco;

    public TarjetaDeCredito(String numero, String fechaVencimiento, Cliente cliente, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        this.banco = banco;

        // Vincular bidireccionalmente
        cliente.setTarjeta(this);
    }

    // Getters y setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        cliente.setTarjeta(this); // mantener la asociación bidireccional
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Número de tarjeta: " + numero);
        System.out.println("Fecha de vencimiento: " + fechaVencimiento);
        System.out.println("Cliente: " + cliente.getNombre() + " (DNI: " + cliente.getDni() + ")");
        System.out.println("Banco: " + banco.getNombre() + " (CUIT: " + banco.getCuit() + ")");
    }
}
