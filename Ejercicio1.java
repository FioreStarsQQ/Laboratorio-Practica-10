
/*
    - Laboratorio Nro 10 - Ejercicio 1: Programa que indique si un número entero es un número par o impar.
    - Autor: Fiorela Clariza Quispe Quispe
    - Colaboró: 
    - Tiempo: 
*/

import java.util.*;

public class Ejercicio1 {

    public static void main(String[] args) {
        int num1; // Variables
        Scanner scan = new Scanner(System.in);
        // Entrada
        System.out.print("Bienvenido(a), a continuación ingrese un número: ");
        num1 = scan.nextInt();
        // Aplicando condicional para saber si el número es par o impar
        if (num1 % 2 == 0) {
            System.out.println("El número ingresado es un número par.");
        } else {
            System.out.println("El número ingresado es un número impar.");
        }
        scan.close();
    }
}
