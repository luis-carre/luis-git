/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc_guia;

import java.util.Scanner;

/**Crea una aplicación que nos pida un número por teclado y con una función se 
 * lo pasamos por parámetro para que nos indique si es o no un número primo, 
 * debe devolver true si es primo, sino false.

 *
 * @author luis-
 */
public class ejerc4 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {

    Scanner leer=new Scanner(System.in);
      System.out.println("ingrese un numero para saber si es primo o no ");
     double num=leer.nextDouble();
      boolean resultado;
      resultado = reemplazar(num);
   
      System.out.println(resultado);
      if (num==0 || num==1){
         System.out.println("el numero ingresado no es considerado un numero entero");
      }
      
   }
   public static boolean reemplazar(double num){
   
     boolean r = false ;
     int conta = 0;
     
      for (int i=1; i<num; i++ ){
    
        if (num%i == 0) {
         conta++;
        } 
       if (conta>=2){
           r=false;
        } else{
           r=true;
        }
      }
      return r;
   }
}



