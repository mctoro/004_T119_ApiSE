/*
El siguiente ejercicio consiste en realiza un programa que nos muestre el número de vocales
existentes en una cadena de caracteres dada.
 */
package com.cice.ejercicios;

import jdk.nashorn.internal.objects.NativeString;

/**
 *
 * @author cice
 */
public class Ejercicio01 {
    public static void main(String[] args){
    
        int contador = 0;
            
        String cadena = "Esto es una cadena de caracteres con muchas vocales";
        
        for (int i=0; i<cadena.length() ; i++){
            char ch = cadena.toLowerCase().charAt(i);
                switch(ch){
                    case 'a':
                    case 'e': 
                    case 'i':
                    case 'o':
                    case 'u':
                        contador++;
                        
                        
                        
                } 

        
        }
             System.out.println(contador);   
    
    }
}
