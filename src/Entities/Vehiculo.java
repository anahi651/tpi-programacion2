/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Entities;

/**
 * Clase que representa un vehículo dentro del sistema.
 *
 * Propósito:
 * - Modelar los datos básicos de un vehículo.
 * - Heredar de la clase Base los campos comunes (id y eliminado).
 * - Aplicar encapsulamiento mediante atributos privados y métodos de acceso.
 */
public class Vehiculo extends Base {

    // Atributos privados
    private String dominio;
    private String marca;
    private String modelo;
    private int anio;
    private String nroChasis;
    private SeguroVehicular seguro;//indica que cada vehículo puede tener un solo seguro asociado.
    // Constructor vacío
    public Vehiculo() {}

    // Constructor con parámetros
    public Vehiculo(long id, boolean eliminado, String dominio, String marca, String modelo, int anio, String nroChasis) {
        super(id, eliminado);
        this.dominio = dominio;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.nroChasis = nroChasis;
    }
    // Relación 1..1 unidireccional con SeguroVehicular
    public SeguroVehicular getSeguro() {
    return seguro;
}

    public void setSeguro(SeguroVehicular seguro) {
    this.seguro = seguro;
}
    // Getters y Setters
    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getNroChasis() {
        return nroChasis;
    }

    public void setNroChasis(String nroChasis) {
        this.nroChasis = nroChasis;
    }

@Override
public String toString() {
    return "Vehiculo {\n" +
            "  id=" + getId() + ",\n" +
            "  eliminado=" + isEliminado() + ",\n" +
            "  dominio='" + dominio + "',\n" +
            "  marca='" + marca + "',\n" +
            "  modelo='" + modelo + "',\n" +
            "  anio=" + anio + ",\n" +
            "  nroChasis='" + nroChasis + "',\n" +
            "  seguro=" + (seguro != null ? seguro.getNroPoliza() : "sin seguro") + "\n" +
            '}';
}


 
}
