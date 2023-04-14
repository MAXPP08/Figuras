/**
 * Autor: Maximiliano, Kevin Arnold, Gonzalo
 * Fecha de Creación: 012/04/2023
 * Fecha de Actualización: 14/04/2023
 * Descripción: Programa que calcula area, perimetro y volumen de figuras
 */
package figura;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Seleccione una figura:");
            System.out.println("1. Cilindro");
            System.out.println("2. Esfera");
            System.out.println("3. Cubo");

            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el radio del Cilindro:");
                    double radioCilindro = sc.nextDouble();
                    System.out.println("Ingrese la altura del Cilindro:");
                    double alturaCilindro = sc.nextDouble();
                    Cilindro cilindro = new Cilindro("azul", "cristal", radioCilindro, radioCilindro);
                    System.out.println("Seleccione una opcion:");
                    System.out.println("1. Calcular area");
                    System.out.println("2. Calcular volumen");
                    int opcionCilindro = sc.nextInt();
                    if (opcionCilindro == 1) {
                        System.out.println("El area de la esfera es: " + cilindro.calcularArea());
                    } else if (opcionCilindro == 2) {
                        System.out.println("El volumen de la esfera es: " + cilindro.calcularVolumen());
                    } else {
                        System.out.println("Opcion invalida");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el radio de la esfera:");
                    double radioEsfera = sc.nextDouble();
                    Esfera esfera = new Esfera("azul", "cristal", radioEsfera);
                    System.out.println("Seleccione una opcion:");
                    System.out.println("1. Calcular area");
                    System.out.println("2. Calcular volumen");
                    int opcionEsfera = sc.nextInt();
                    if (opcionEsfera == 1) {
                        System.out.println("El area de la esfera es: " + esfera.calcularArea());
                    } else if (opcionEsfera == 2) {
                        System.out.println("El volumen de la esfera es: " + esfera.calcularVolumen());
                    } else {
                        System.out.println("Opcion invalida");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el Lado del cubo:");
                    double ladoCubo = sc.nextDouble();
                    Cubo cubo = new Cubo("azul", "cristal", ladoCubo, ladoCubo);
                    System.out.println("Seleccione una opcion:");
                    System.out.println("1. Calcular area");
                    System.out.println("2. Calcular volumen");
                    int opcionCubo = sc.nextInt();
                    if (opcionCubo == 1) {
                        System.out.println("El area de la esfera es: " + cubo.calcularArea());
                    } else if (opcionCubo == 2) {
                        System.out.println("El volumen de la esfera es: " + cubo.calcularVolumen());
                    } else {
                        System.out.println("Opcion invalida");
                    }
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

            System.out.println("¿Desea realizar otra operacion? (s/n)");
            String opcionContinuar = sc.next();

            if (!opcionContinuar.equalsIgnoreCase("s")) {
                boolean continuar = false;
                System.out.println("Gracias por usar la aplicacion");
            }
        } while (opcion != 0); 
    }
}