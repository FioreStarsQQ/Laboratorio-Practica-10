
/*
    - Laboratorio Nro 10 - Ejercicio 3: Determinar si un alumno aprueba o no un curso, sabiendo que aprobará si su promedio
    calculado en base a su nota de teoría con peso de 75% y la nota de laboratorio con peso de 25% es mayor o igual a 10.5 
    reprueba en caso contrario.
    - Autor: Fiorela Clariza Quispe Quispe
    - Colaboró: 
    - Tiempo: 
*/

import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        double notaTeoria, notaLab, promedio; // Variables
        Scanner scan = new Scanner(System.in);        
        System.out.println(
                "Bienvenido(a) al programa para calcular su promedio de notas y si usted esta aprobado o no en el curso.");
        // Entradas
        System.out.print("A continuación ingrese su nota de teoría: ");
        notaTeoria = scan.nextDouble();
        System.out.print("Ingrese su nota de laboratorio: ");
        notaLab = scan.nextDouble();
        // Fórmula IMC
        promedio = (double) Math.round((notaTeoria*0.75+notaLab*0.25) * 100) / 100;
        // Aplicando condicional para determinar si aprueba o no el curso
        System.out.println("Listo, promedio de acuerdo al peso % correspondiente es: " + promedio);
        if (promedio < 10.5) {
            System.out.println("Usted está desaprobado.");
        } else {
            System.out.println("¡Felicidades! Usted está aprobado.");
        }
        scan.close();
    }
}
