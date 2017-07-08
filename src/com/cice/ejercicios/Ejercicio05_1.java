/*
En este ejercicio vamos a realizar un programa que nos muestre la suma de todos los números
enteros comprendidos entre dos números aleatorios generados por el propio programa. Los
números aleatorios serán mayores de 0 y menores de 100.
 */
package com.cice.ejercicios;

/**
 *
 * @author Miguel
 */
public class Ejercicio05_1 {

        
// hemos de crear una formula para que la clase math. nos de numero aleatorio
    public static int variableEnRango (int m, int n){
        int resultado;
        resultado = (int) Math.floor(Math.random()*(m-n+1)+n);
        return resultado;

                
        }
    public static void main(String[] args) {

        

        // necesitamos crear dos variables con numeros aleatorios (enteros)
        
        int a = variableEnRango (100,0);
        int b = variableEnRango (100,0);
        
        // necesitamos saber que numero es el minimo y cual el maximo
        int c = Math.min(a, b);
        int d = Math.max(a, b); 
        int diferencia = 0;
        // hemos de crear un bucle que sume todos los numeros comprendidos entre el menor y el mayor
        System.out.println("El primer numero es: " + a);
        System.out.println("El segundo numero es: " + b);
        
        
        if (a==c) {
            diferencia = b-a;
        } else {
            diferencia = a-b;
        }for (int i = (c+1); i <= d; i++) {
            c = c+i;
            
            
        }System.out.println("La suma de la diferencia es: " + c);
    }
    
}
