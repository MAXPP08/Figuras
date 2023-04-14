/**
 * Autor: Maximiliano, Kevin Arnold, Gonzalo
 * Fecha de Creación: 012/04/2023
 * Fecha de Actualización: 14/04/2023
 * Descripción: Programa que calcula area, perimetro y volumen de figuras
 */
package figura;

// Clase Hexagono
public class Hexagono extends Poligono {

    private double lado;

    public Hexagono(String color, String material, double lado) {
        super(color, material, 6, lado, (lado / 2) * Math.sqrt(3));
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return super.calcularArea();
    }

    @Override
    public double calcularPerimetro() {
        return super.calcularPerimetro();
    }
}
