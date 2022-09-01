
/*
    - Laboratorio Nro 10 - Ejercicio 2: Realizar un programa que determine si una persona tiene sobrepeso. 
    Esto sucede cuando su Índice de Masa Corporal (IMC) es mayor o igual a 25. IMC = peso [kg]/ estatura2 [mts].
    - Autor: Fiorela Clariza Quispe Quispe
    - Colaboró: 
    - Tiempo: 
*/

import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        double peso, talla, imc; // Variables
        Scanner scan = new Scanner(System.in);        
        System.out.println(
                "Bienvenido(a) al programa para calcular el Índice de Masa Corporal y determinar si Ud. tiene sobrepeso.");
        // Entradas
        System.out.print("A continuación ingrese su peso en kilogramos: ");
        peso = scan.nextDouble();
        System.out.print("Ingrese su talla en metros: ");
        talla = scan.nextDouble();
        // Fórmula IMC
        imc = (double) Math.round(peso / (Math.pow(talla, 2)) * 100) / 100;
        // Aplicando condicional para determinar sobrepeso
        System.out.println("Listo, su IMC es: " + imc);
        if (imc < 25) {
            System.out.println("Usted se encuentra saludable.");
        } else {
            System.out.println("Usted tiene sobrepeso.");
        }
        scan.close();
    }
}
