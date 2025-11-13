/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Entities;

import java.time.LocalDate;

public class SeguroVehicular extends Base {

    // Atributos privados
    private String aseguradora;
    private String nroPoliza;
    private Cobertura cobertura;
    private LocalDate vencimiento;
   


    // Constructor vacío
    public SeguroVehicular() {}

    // Constructor con parámetros
    public SeguroVehicular(long id, boolean eliminado, String aseguradora, String nroPoliza, Cobertura cobertura, LocalDate vencimiento) {
        super(id, eliminado);
        this.aseguradora = aseguradora;
        this.nroPoliza = nroPoliza;
        this.cobertura = cobertura;
        this.vencimiento = vencimiento;
    }

    // Getters y Setters
    public String getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }

    public String getNroPoliza() {
        return nroPoliza;
    }

    public void setNroPoliza(String nroPoliza) {
        this.nroPoliza = nroPoliza;
    }

    public Cobertura getCobertura() {
        return cobertura;
    }

    public void setCobertura(Cobertura cobertura) {
        this.cobertura = cobertura;
    }

    public LocalDate getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(LocalDate vencimiento) {
        this.vencimiento = vencimiento;
    }

@Override
public String toString() {
    return "SeguroVehicular {\n" +
            "  id=" + getId() + ",\n" +
            "  eliminado=" + isEliminado() + ",\n" +
            "  aseguradora='" + aseguradora + "',\n" +
            "  nroPoliza='" + nroPoliza + "',\n" +
            "  cobertura=" + (cobertura != null ? cobertura : "sin cobertura") + ",\n" +
            "  vencimiento=" + (vencimiento != null ? vencimiento : "sin fecha") + "\n" +
            '}';
}
}

