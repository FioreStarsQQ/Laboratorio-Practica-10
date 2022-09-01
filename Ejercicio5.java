
/*
 * * Laboratorio Nro 09 - Ejercicio5: Realizar un juego donde se ingrese el nivel de dificultad inicialmente (valor entre 1 y 5), 
 * Luego la computadora genera un aleatorio entre 1 y el nivel de dificultad ingresados, se le pide al jugador que introduzca 
 * un número entre 1 y el nivel de dificultad (ej. 5) tratando de adivinar el número generado por la computadora.
Al final del juego informar los siguientes datos: nivel de dificultad, número generado, número ingresado y quién ganó el juego, 
el jugador o la computadora.
 * Autor: Fiorela Clariza Quispe Quispe
 * Colaboró: 
 * Tiempo: 
 */
import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        int nivelDif, numAleatorio, numAdivin; // Las variables

        // Obteniendo el nivel de dificultad
        nivelDif = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nivel de dificultad:"));
        // Seleccionando un número al azar
        numAleatorio = (int) ((Math.random() * nivelDif) + 1);
        // Número con el que se va a comparar el número al azar
        numAdivin = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entre 1 y " + nivelDif + ":"));
        // Salida
        if (numAleatorio == numAdivin) {
            JOptionPane.showMessageDialog(null, "El nivel de dificultad fue: " + nivelDif + "\nEl número generado fue: "
                    + numAleatorio + "\nEl número ingresado fue: " + numAdivin
                    + "\n¡Felicidades! Usted adivino el número elegido aleatoriamente por la computadora.");
        } else {
            JOptionPane.showMessageDialog(null, "El nivel de dificultad fue: " + nivelDif + "\nEl número generado fue: "
                    + numAleatorio + "\nEl número ingresado fue: " + numAdivin
                    + "\nUsted no adivino el número elegido aleatoriamente por la computadora.");
        }
    }

}