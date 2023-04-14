/**
 * Autor: Maximiliano, Kevin Arnold, Gonzalo
 * Fecha de Creación: 012/04/2023
 * Fecha de Actualización: 14/04/2023
 * Descripción: Programa que calcula area, perimetro y volumen de figuras
 */
package figura;

// Clase Figura3D
public class Figura3D extends Figura {

    private double radio;

    public Figura3D(String color, String material, double radio) {
        super(color,material);
//super(color, material);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return 0;
    }

    public double calcularVolumen() {
        return 0;
    }
}
