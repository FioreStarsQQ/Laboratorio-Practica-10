
/*
    - Laboratorio Nro 10 - Ejercicio 4: Un programa que lea dos números enteros y que muestre la suma y resta si el primer número 
    es mayor o igual al segundo número, en otro caso que muestre su multiplicación, división y módulo.
    - Autor: Fiorela Clariza Quispe Quispe
    - Colaboró: 
    - Tiempo: 
*/

import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        int num1, num2, suma, resta, multiplicacion, division, modulo; // Variables
        Scanner scan = new Scanner(System.in);
        System.out.println(
                "Bienvenido(a) al programa para calcular operaciones en caso los números ingresado cumplan las condiciones.\nSe muestra la suma y resta si el primer número es mayor o igual al segundo número, en otro caso que muestre su multiplicación, división y módulo.");
        // Entradas
        System.out.print("A continuación ingrese un número: ");
        num1 = scan.nextInt();
        System.out.print("Ingrese otro número: ");
        num2 = scan.nextInt();
        // Aplicando condicional para determinar las operaciones +-*/%
        if (num1 >= num2) {
            suma = num1 + num2;
            resta = num1 - num2;
            System.out.println(
                    "Debido a que el primer número ingresado es mayor que el segundo, se realizó las siguientes operaciones:\n- Suma: "
                            + suma + "\n- Resta: " + resta);
        } else {
            multiplicacion = num1 * num2;
            division = num2 / num1;
            modulo = num2 % num1;
            System.out.println(
                    "Debido a que el segundo número ingresado es mayor que el primero, se realizó las siguientes operaciones:\n- Multiplicación: "
                            + multiplicacion + "\n- División: " + division + "\n- Módulo: " + modulo);
        }
        scan.close();
    }
}
