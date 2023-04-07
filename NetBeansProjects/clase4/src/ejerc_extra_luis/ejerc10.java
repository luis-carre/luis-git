/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc_extra_luis;

import java.util.Scanner;

/**ealice un programa para que el usuario adivine el resultado de una multiplicación
 * entre dos números generados aleatoriamente entre 0 y 10 El programa debe indicar
 * al usuario si su respuesta es o no correcta En caso que la respuesta sea incorrecta 
 * se debe permitir al usuario ingresar su respuesta nuevamente Para realizar este
 * ejercicio investigue como utilizar la función Math.random() de Java.

 *
 * @author luis-
 */
public class ejerc10 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
  Scanner leer=new Scanner(System.in);
      System.out.println("ingrese el resultado de la multiplicacion de dos numeros entre cero y diez.");
      int resultado=leer.nextInt();
      int num1=(int)(Math.random()*11);
      int num2=(int)(Math.random()*(11));
      double multi=num1*num2;
      if(multi==resultado){
         System.out.println("su respuesta es correcta");
      }else{
         System.out.println("su respuesta es incorrecta");
         System.out.println("el resultado correcto es: "+multi);
      }
     
   }
   
}
