/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_2y3;

import java.util.Scanner;

/**Escribir un programa que lea un número entero por teclado y
 * muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().

 *
 * @author luis-
 */
public class ejerc_pract5 {
   public static void main (String [] args) {
      Scanner leer = new Scanner (System.in) ;
      int num;
       System.out.println("ingrese un numero entero");
       num=leer.nextInt();
       int doble= num*2;
       int triple= num*3;
       System.out.println("el doble es: "+ doble);
       System.out.println("el triple es "+ triple);
       System.out.println("la raiz cuadrada es " + Math.sqrt(num));
   } 
}
