/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_2y3;

import java.util.Locale;
import java.util.Scanner;

/**Escribir un programa que pida una frase y la muestre toda en mayúsculas y
 * después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.

 *
 * @author luis-
 */
public class ejerc_pract3 {
  public static void main(String [] args){  
 Scanner leer = new Scanner   (System.in) ;
 String frase;
      System.out.println("ingrese una frase");
      frase= leer.next();
      System.out.println("la frase ingresads en mayuscula es " + frase.toUpperCase());
      System.out.println("la frase ingresada en minuscula es " + frase.toLowerCase());
}
}