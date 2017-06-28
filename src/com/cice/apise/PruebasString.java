/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.apise;
 //ana.leal@ciceonline.com
/**
 *
 * @author cice
 */
public class PruebasString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean esMayor=2 > 4;
        boolean esIgual= 2 == 3-1;
        boolean comparaValoresBool = (esMayor == esIgual);
        boolean comparaChars = 'a' != 'A';
        
        System.out.println(esMayor + " " + esIgual + " " + comparaValoresBool + " " + comparaChars );
        
        String nombre = new String ("Miguel");
        String otroNombre = "Miguel";
        
        boolean nombresIguales = (nombre == otroNombre);
        
        System.out.println(nombresIguales);
        
        StringBuilder sb = new StringBuilder();
        sb.append("Miguel");
        
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Miguel");
       
        System.out.println("sb == sb2");
      
    }
    
}
