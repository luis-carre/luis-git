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
public class ejerc_2 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic her
           System.out.println("Ingrese un tamaño para el vector");
        Scanner leer= new Scanner(System.in);
        int n= leer.nextInt();
        
        int [] vector=new int[n];
          System.out.println("  ");
        
        for (int i = 0; i < n; i++) {
            vector[i]= (int) ((Math.random()*20)+1);
            
            System.out.println(vector[i]);
            
        }
        
      
        
        System.out.println("Ingrese un número");
        int num=leer.nextInt();
        int cont=0;
        
       //boolean seguir= true;
       
        for (int i = 0; i < n; i++) {
            if (num==vector[i]){
                cont++;
                
            } if(num== vector[i] && cont==1){
                System.out.println("El número ingresado se encuentra por primera vez en la posición "+ i);
            }   
           }   
        
        if(cont>0){
            System.out.println("El número ingresado se encuentra "+ cont+ " veces");
        }
        
       if(cont==0){
           System.out.println("El número ingresado no se encuentra en el arreglo");
       }
           
       }
    }
   
   

