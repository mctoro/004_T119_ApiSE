/*
 * En este ejercicio vamos a realizar un programa que nos muestre la suma de todos los números
 * enteros comprendidos entre dos números aleatorios generados por el propio programa. Los
 * números aleatorios serán mayores de 0 y menores de 100.
 */
package com.cice.ejercicios;

/**
 *
 * @author cice
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

int a = aleatorioEnRango(100, 0);
int b = aleatorioEnRango(100, 0);
int c = Math.min(a, b);
int d = Math.max(a, b);

int diferencia = 0;
/*
int d = Math.max(a, b);
int e = d-c;
int f = c-d;
*/

        System.out.println("El primer numero es: " + a);
        System.out.println("El segundo numero es: " + b); 
        if (a==c) {
           diferencia = b-a; 
           
        } else {
            diferencia = a-b;
            
        }
        
        for (int i = (c+1); i <= d; i++) {
            c=c+i;
        } System.out.println("La suma es: " + c);
    }
    
    
    
    public static int aleatorioEnRango(int m, int n) {
     int resultado;
     
     resultado = (int) Math.floor(Math.random()*(m-n+1)+n);
     
    
    
     
        return resultado;
        
    
    }
    
}
