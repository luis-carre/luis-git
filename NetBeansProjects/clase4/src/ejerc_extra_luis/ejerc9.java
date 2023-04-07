/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc_extra_luis;

import java.util.Scanner;

/**Simular la división usando solamente restas Dados dos números enteros mayores que uno,
 * realizar un algoritmo que calcule el cociente y el residuo usando sólo restas
 * Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
 * este resultado es el residuo, y el número de restas realizadas es el cociente.

 *
 * @author luis-
 */
public class ejerc9 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
     Scanner leer=new Scanner(System.in);
      System.out.println("ingresa dos numeros mayores >1");
      int num1=leer.nextInt();
      int num2=leer.nextInt();
      int residuo;
      int conta=0;
      if (num1>0 && num2>0){
     do{
        conta++;
        residuo=(num1- num2);
        num1=residuo;
       
     } while (num1>num2);
      System.out.println("el residuo es: "+num1+"  el cociente es: "+conta);
      }else{
         System.out.println("el valor es incorrecto");
      }
   } 
  
  
}
