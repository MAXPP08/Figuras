/**
 * Autor: Maximiliano, Kevin Arnold, Gonzalo
 * Fecha de Creación: 012/04/2023
 * Fecha de Actualización: 14/04/2023
 * Descripción: Programa que calcula area, perimetro y volumen de figuras
 */
package figura;

// Clase Poligono
public class Poligono extends Figura2D {

    private int numLados;
    private double longitudLados;
    private double apotema;
    private double perimetro;

    public Poligono(String color, String material, int numLados, double longitudLados, double apotema) {
        super(color, material);
        this.numLados = numLados;
        this.longitudLados = longitudLados;
        this.apotema = apotema;
        this.perimetro = numLados * longitudLados;
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public double getLongitudLados() {
        return longitudLados;
    }

    public void setLongitudLados(double longitudLados) {
        this.longitudLados = longitudLados;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public double calcularArea() {
        return (perimetro * apotema) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return perimetro;
    }
}
