/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc_extra_luis;

import java.util.Scanner;

/**Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata
 * de una vocal Caso contrario mostrar un mensaje Nota: investigar la función 
 * equals() de la clase String.

 *
 * @author luis-
 */
public class ejerc3 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
     Scanner leer=new Scanner(System.in);
      System.out.println("ingrese una letra");
      String letra=leer.nextLine();
      if (letra.equalsIgnoreCase("a") ||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")|| letra.equalsIgnoreCase("u")){
         System.out.println("se trata de una vocal");
      } else{
         System.out.println("la letra ingresada no se trata de una vocal");
      }
   }
   
}
