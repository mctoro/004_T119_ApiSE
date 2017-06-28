/*
 * Demostrar por pantalla todas las posiciones de las que aparece la letra "a" en una cadena dada
 * cadena -> "esto es una cadena de caracteres"
 */
package com.cice.ejercicios;

/**
 *
 * @author cice
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "esto es una cadena de caracteres";

        int pos = 0;
        /*            
            while (pos >=0) {
                if (pos == 0) {
                    pos =cadena.indexOf("a", pos);
                    
                } else {  //ponemos ++pos y no pos++ porque primero ha de sumarse el valor a la posición y luego hacer el calculo y no al contrario.
                    pos = cadena.indexOf("a", ++pos);
                }
            System.out.println(pos);
        }
            
         */

        do {
            pos = cadena.indexOf("a", pos);
            if (pos != -1) {
                System.out.println("Se ha encontrado la letra 'a' en la posición: " + pos);
            }
            pos += 1;

        } while (pos > 0);

    }

    // encontrada la letra "a" en las posiciones x,x,x,x,x,x
}
