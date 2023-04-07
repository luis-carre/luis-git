/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_practicos;

import java.util.Random;
import java.util.Scanner;

/**Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
 * le pida al usuario un número a buscar en el vector El programa mostrará dónde
 * se encuentra el numero y si se encuentra repetido

 *
 * @author luis-
 */
public class ejerc_2 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      Scanner leer= new Scanner(System.in);
      System.out.println("ingrese le tamaño del vector: ");
      int tamaño=leer.nextInt();
      System.out.println(" ");
      int vector [] =new int[tamaño];

      for (int i=0; i<tamaño; i++){
         //100 es el rango que le damos al random
         vector[i]= (int) (Math.random()*100+1);
         System.out.println(vector[i]);
      }
      System.out.println("ingrese un numero para saber si se encuentra en el vector, cual es su posicion y si se encuentra repetido");
      int num =leer.nextInt();
      int conta=0;
      for (int i=0; i<tamaño; i++){
         if (num==vector[i]){
          conta++;
         }
         
         if(conta==1 && num== vector[i]){
            System.out.println("el numero ingresado se encuentra por primera vez en la posicion: "+i);
         }
      }
      if (conta==0){
            System.out.println("el numero no se encuentra en el arreglo");
         }
         if (conta>1){
            System.out.println("el numero ingresado se encuentra mas de una vez en el arreglo");
         }
     
   }
   
}
