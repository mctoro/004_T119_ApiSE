/*
En este ejercicio crearemos un sencillo programa que solicite al usuario la introducción de dos
números y muestre en la consola un mensaje indicando cual es el mayor y cual el menor de los
números suministrados.
 */
package com.cice.ejercicios;

import java.util.Scanner;


/**
 *
 * @author Miguel
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //necesitamos pedir al usuario dos numeros
        
        int a = 0;
        int b = 0;
        
        int c = Math.min(a, b);

        
        
        System.out.print("Introduce el primer numero: ");
        Scanner sc1 = new Scanner (System.in);
        a = sc1.nextInt();

        
        System.out.print("Introduce el segundo numero: ");
        Scanner sc2 = new Scanner (System.in);
        b = sc2.nextInt(); 
        if (c==a) {
            System.out.println(a + " es menor que " + b);
            System.out.println(b + " es mayor que " + a);
        } else {
            System.out.println(b + " es menor que " + a);
            System.out.println(a + " es mayor que " + b);
        }
        
        
    }
    
}
