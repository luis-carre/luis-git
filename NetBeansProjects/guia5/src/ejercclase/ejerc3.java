/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercclase;

import java.util.Scanner;

/**
 *
 * @author luis-
 */
public class ejerc3 {

   /**
    * @param args the command line arguments
    */

public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el tamano del vector");
        int n=leer.nextInt();
        int [] vector = new int [n];
        for (int i = 0; i < n-1; i++) {
            vector[i]=(int) (random()*100);
            
        }
        System.out.println("ingrese el numero a busca");
        int numb=leer.nextInt();
        int x=0;
        for (int i = 0; i < n-1; i++) {
            if (vector[i]==numb) {
               x++;
               
                System.out.println("el numero esta en la posicion " + i);
               
            }
           
        }
         System.out.println("el vector se repite " +x+ " veces");
    }
    
}