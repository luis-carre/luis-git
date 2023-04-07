/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc_clase;

import java.util.Scanner;

/**
 *
 * @author luis-
 */
public class ejerc_3 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
          System.out.println("Ingrese un tamaño para el vector");
        Scanner leer= new Scanner(System.in);
        int n= leer.nextInt();
        
        System.out.println(" ");
        
        int[] vector= new int[n];
        
        for (int i = 0; i < n; i++) {
            vector[i]= (int) ((Math.random()*100000)+1);
            System.out.println(vector[i]);
        }
        
        int cont5=0;
        int cont4=0;
        int cont3=0;
        int cont2=0;
        int cont1=0;

        for (int i = 0; i < n; i++) {
            int aux=vector[i]/10;
            
            if(aux>=1000){
                cont5++;
            }
            if(aux>=100 && aux<1000){
                cont4++;
            }
            if(aux>=10 && aux<100){
                cont3++;
            }
            if(aux>=1 && aux<10){
                cont2++;
            }
            if(aux<1){
                cont1++;
            }
        }
            System.out.println("La cantidad de números de una cifra es " + cont1);
            System.out.println("La cantidad de números de dos cifras es " + cont2);
            System.out.println("La cantidad de números de tres cifras es " + cont3);
            System.out.println("La cantidad de números de cuatro cifras es " + cont4);
            System.out.println("La cantidad de números de cinco cifras es " + cont5);
        
    }
   }
   
