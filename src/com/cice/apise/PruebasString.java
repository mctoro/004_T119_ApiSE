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
       
        System.out.println(sb == sb2);
        
        System.out.println(nombre.equals(otroNombre));
        
        
      
        
        /*
        equals(Object cad). Compara la cadena con otra que se le pasa como parámetro,
devolviendo true si ambas son iguales. En la comparación hace distinción entre mayúsculas y
minúsculas.
        
Hay que tener en cuenta que las cadenas de caracteres son objetos y no tipos primitivos, por lo
que habrá que utilizar este método, y no el operador de igualdad (==), cuando queramos
comprobar si dos cadenas son iguales.
        
        equalsIgnoreCase(Object cad). Realiza la misma función que el método anterior, solo que en
este caso no se hace distinción entre mayúsculas y minúsculas.
        
        indexOf(String cad). Nos devuelve la posición que ocupa dentro de la cadena el texto
suministrado como parámetro. En caso de que dicho texto no se encuentre en el interior de la
cadena el método devolverá -1
        
        indexOf(String cad, int inicio). Se trata de una variante de la anterior, donde el segundo
parámetro representa la posición a partir de la cual comienza la búsqueda.
        
        lastIndexOf(String cad). Realiza la misma función que indexOf(), solo que en este caso la
búsqueda del texto comienza desde el final de la cadena hacia el principio. DEVUELVE LA ULTIMA OCURRENCIA DEL STRING QUE ENCUENTRA
        
        lastIndexOf(String cad, int pos). Igual que el anterior, indicando mediante el segundo parámetro
la posición de comienzo de la búsqueda.
        
        Substring(int pos1, int pos2). Devuelve un trozo de la cadena comprendido entre las posiciones
indicadas en pos1 y pos2. El último carácter devuelto será el que ocupe la posición pos2-1. El
siguiente ejemplo muestra en pantalla el texto “caracteres”
        
        split(String separador). Este método devuelve un array formado por las subcadenas que
componen la cadena. Como parámetro se debe indicar el separador de subcadena.
        
        replace(char anterior, char nuevo). Este método devuelve una cadena resultante de
reemplazar en la cadena original todas las ocurrencias del carácter en el primer parámetro por
el segundo. Es importante resaltar que el método replace() no realiza ningún tipo de operación
sobre la cadena original (como ya indicamos, los objetos String son inmutables), sino que
devuelve una segunda cadena de caracteres resultante de realizar la operación de sustitución.
        
        
        */
    }
    
}
