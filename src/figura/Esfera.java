/**
 * Autor: Maximiliano, Kevin Arnold, Gonzalo
 * Fecha de Creación: 012/04/2023
 * Fecha de Actualización: 14/04/2023
 * Descripción: Programa que calcula area, perimetro y volumen de figuras
 */
package figura;

// Clase Esfera
public class Esfera extends Figura3D {

    public Esfera(String color, String material, double radio) {
        super(color, material, radio);
    }

    public double calcularArea() {
        return 4 * Math.PI * super.getRadio() * super.getRadio();
    }

    public double calcularVolumen() {
        return 4 * Math.PI * super.getRadio() * super.getRadio() * super.getRadio() / 3;
    }
}
