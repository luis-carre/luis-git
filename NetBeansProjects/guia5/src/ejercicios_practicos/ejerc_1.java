/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_practicos;

/**Realizar un algoritmo que llene un vector con los 100 primeros números enteros
 * y los muestre por pantalla en orden descendente.

 *
 * @author luis-
 */
public class ejerc_1 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
    int cien [] =new int[100];
    for (int i=99; i>=0; i--){
       cien[i]=i;
       System.out.println(cien[i]);
    }
    
    
   }
   
}
