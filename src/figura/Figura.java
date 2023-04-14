/**
 * Autor: Maximiliano, Kevin Arnold, Gonzalo
 * Fecha de Creación: 012/04/2023
 * Fecha de Actualización: 14/04/2023
 * Descripción: Programa que calcula area, perimetro y volumen de figuras
 */
// Clase Figura
package figura;

public class Figura {

    private double radio;

    public Figura(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    private String color;
    private String material;

    public Figura(String color, String material) {
        this.color = color;
        this.material = material;
    }
     
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
  
    
    public double calcularArea() {
        return 0;
    }

    public double calcularPerimetro() {
        return 0;
    }
}
