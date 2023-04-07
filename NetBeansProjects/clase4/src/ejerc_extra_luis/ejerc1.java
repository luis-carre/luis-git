/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc_extra_luis;

import java.util.Scanner;

/**Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo,
 * si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 *
 * @author luis-
 */
public class ejerc1 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
     Scanner leer=new Scanner(System.in);
      System.out.println("ingrese la cantidad de minutos a comparar");
      double minutos=leer.nextDouble();
      double dias; 
      double horas;
      if (minutos>=1440 ) {
     dias= minutos/1440;
     minutos=minutos-1440;
       horas=minutos/60;
       System.out.println("los minutos ingresados equivalen a "+dias+" dias y "+horas+" horas.");
      }else {
      horas=minutos/60;
       System.out.println("los minutos ingresados equivalen a "+horas+" horas.");
      }
      
     
   }
   
}
