/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_2y3;

import java.util.Scanner;

/**Escribir un programa que pida tu nombre, lo guarde en una variable
 * y lo muestre por pantalla.

 *
 * @author luis-
 */
public class ejerc_pract2 {
    
  public static void main(String[] args ) {
      Scanner leer = new Scanner (System.in);
      String nombre; 
      System.out.println("ingrese su nombre");
      nombre= leer.next();
      System.out.println("bienvenido " + nombre);
      
  }
}
