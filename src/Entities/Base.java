/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Entities;

/**
 * Clase base abstracta para las entidades del sistema.
 *
 * Propósito:
 * - Proporcionar campos comunes a todas las entidades (id, eliminado).
 * - Implementar el patrón de herencia para evitar duplicación de código.
 * - Mantener encapsulamiento, permitiendo acceso solo mediante getters/setters.
 * - Soportar eliminación lógica en lugar de eliminación física.
 */
public abstract class Base {

    // Atributos encapsulados
    private long id;
    private boolean eliminado;

    // Constructor vacío
    public Base() {}

    // Constructor con parámetros
    public Base(long id, boolean eliminado) {
        this.id = id;
        this.eliminado = eliminado;
    }

    // Getters y Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    @Override
    public String toString() {
        return "id=" + id + ", eliminado=" + eliminado;
    }
}
