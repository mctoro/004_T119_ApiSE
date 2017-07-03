/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.ejercicios;

/**
 *
 * @author cice
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Texto donde se insertaran barras delante de los espacios");

        int pos = 0;
        
        
/*  esto es otra forma (más optima)
        int pos = sb.indexOf(" ");
        while (pos !=-1) {
sb.indexOf(pos, "/");
pos = sb.indexOf(" ", pos+2);
            System.out.println("el resultado es " + sb);
            
        }
*/        
        do {
            /*
            if (pos != 0) { //no haría falta este primer IF

                pos = sb.indexOf(" ");

                if (pos != -1) {
                    sb.insert(pos, "/");
                    pos += 2;
                }

            } else {
                pos = sb.indexOf(" ", pos);
                if (pos !=-1){
                        sb.insert(pos, "/");
                pos += 2;
                }
            }
             */

            //solo con esta parte de código podríamos haberlo hecho, esto ahorra recursos
            pos = sb.indexOf(" ", pos);
            if (pos != -1) {
                sb.insert(pos, "/");
                pos += 2;
            }

        } while (pos != -1);

        System.out.println("El resultado es: " + sb);
        
        
    }

}
