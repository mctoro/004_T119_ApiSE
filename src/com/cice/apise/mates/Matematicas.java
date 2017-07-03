/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.apise.mates;

/**
 *
 * @author cice
 */
public class Matematicas {
    
    public static void main (String... args){
    
double res = Math.abs(-17.242);
        System.out.println(res);
        
double res1 = Math.ceil(3.1);
        System.out.println(res1);
        
double res2 = Math.floor(3.1);
        System.out.println(res2);
        
        long res3 = Math.round(3.1);
        System.out.println(res3);
        
        double res4 = Math.max(4, 2);
        System.out.println(res4);
        
        double res5 = Math.min(4, 2);
        System.out.println(res5);
        
        double res6 = Math.random();
        System.out.println(res6);
        
        
   //devolver un numero random entre 0 y 100
   
   double valorEntero = Math.floor(Math.random()*(100-0+1)+0);
   
   while (valorEntero != 12.00) {
   
       valorEntero = Math.floor(Math.random()*(100-0+1)+0);
       System.out.println(valorEntero);
   }
        
    }
    
}
