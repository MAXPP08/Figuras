/**
 * Autor: Maximiliano, Kevin Arnold, Gonzalo
 * Fecha de Creación: 012/04/2023
 * Fecha de Actualización: 14/04/2023
 * Descripción: Programa que calcula area, perimetro y volumen de figuras
 */
package figura;

// Clase Figura2D
public class Figura2D extends Figura {

    private double base;
    private double altura;
    private double radio;
    
    public Figura2D(String color, String material) {
        super(color, material);
    }
    public Figura2D(String color, String material, double radio) {
        super(color,material);
//super(color, material);
        this.radio = radio;
    }
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }
}
