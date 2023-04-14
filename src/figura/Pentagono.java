/**
 * Autor: Maximiliano, Kevin Arnold, Gonzalo
 * Fecha de Creación: 012/04/2023
 * Fecha de Actualización: 14/04/2023
 * Descripción: Programa que calcula area, perimetro y volumen de figuras
 */
package figura;

// Clase Pentagono
public class Pentagono extends Poligono {

    private double lado;

    public Pentagono(String color, String material, double lado) {
        super(color, material, 5, lado, (lado / 2) * Math.sqrt(5 - 2 * Math.sqrt(5)));
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
