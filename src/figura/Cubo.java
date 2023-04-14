/**
 * Autor: Maximiliano, Kevin Arnold, Gonzalo
 * Fecha de Creación: 012/04/2023
 * Fecha de Actualización: 14/04/2023
 * Descripción: Programa que calcula area, perimetro y volumen de figuras
 */
package figura;

// Clase Cubo
public class Cubo extends Figura3D {

    private double lado;

    public Cubo(String color, String material, double radio, double lado) {
        super(color, material, radio);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return 6 * lado * lado;
    }

    public double calcularVolumen() {
        return lado * lado * lado;
    }
}
