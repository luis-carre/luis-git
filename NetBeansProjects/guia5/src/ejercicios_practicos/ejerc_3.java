/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_practicos;

import static java.lang.Math.random;
import java.util.Scanner;

/**Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
 * cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

 *
 * @author luis-
 */
public class ejerc_3 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
     Scanner leer=new Scanner(System.in);
      System.out.println("ingresa un numero");
      int num=leer.nextInt();
      System.out.println("************************");
      int uno=0, dos=0, tres=0, cuatro=0, cinco=0;
      int vector[]=new int[num];
      for (int i=0; i<num; i++){
         vector[i]=(int)(random() *100000);
         System.out.println(vector[i]);
         if (vector[i]>=0 && vector[i]<=9){
            uno++;
         }
         if (vector[i]>=10 && vector[i] <=99){
            dos++;
         }
         if (vector[i]>=100 && vector[i]<=999){
            tres++;
         }
         if (vector[i]>=1000 && vector[i]<=9999){
            cuatro++;
         }
         if (vector[i]>=10000){
            cinco++;
         }
      }
      System.out.println("los numeros ingresados de un digito son: "+uno);
      System.out.println("los numeros ingresados de dos digitos son: "+dos);
      System.out.println("los numeros ingresados de tres digitos son: "+tres);
      System.out.println("los numeros ingresados de cuatro digitos son: "+cuatro);
      System.out.println("los numeros ingresados de cinco o mas digitos son: "+cinco);
   }
   
}
