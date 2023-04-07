/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc_guia;

import java.util.Scanner;

/**Crea una aplicación que a través de una función nos convierta una cantidad de
 * euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras.
 * La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una
 * cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 *
 * @author luis-
 */
public class ejerc3 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
     Scanner leer= new Scanner(System.in);
      System.out.println("introduzca la cantidad de euros");
      double euros=leer.nextInt();
      
      System.out.println("****  MENU ****");
      System.out.println("***1° LIBRA ***");
      System.out.println("***2° DOLAR ***");
      System.out.println("***3° YENES ***");
      System.out.println(" ");
      System.out.println(" Ingrese la opcion de cambio que desea realizar: ");
      int opcion=leer.nextInt();
      reemplazar(euros,opcion);
      
   }
   public static void reemplazar( double euros, int opcion){
      double cambio;
      switch (opcion){
         case 1:
            cambio=euros*0.86;
            System.out.println("el valor de los euros en libras es: "+cambio);
            break;
         case 2: 
            cambio=euros*1.28611;
            System.out.println("el valor de los euros en dolares es: "+cambio);
            break;
         case 3:
            cambio=euros*129.852;
            System.out.println("el valor de los euros en yenes es: " + cambio);
            break;
         default:
            System.out.println("la opcion ingresada no es correcta");
      }
   }
}
