/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc_extra_luis;

import java.util.Scanner;

/**Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y 
 * se muestre su equivalente en romano.
 *
 * @author luis-
 */
public class ejerc4 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
    Scanner leer= new Scanner(System.in);
      System.out.println("ingrese un numero entre 1 y 10 para ver su equivalente en numeros romanos");
      int num=leer.nextInt();
      switch (num){
         case 1: 
            System.out.println(num+" en numero romano se escribe I ");
            break;
            case 2: 
            System.out.println(num+" en numero romano se escribe II ");
            break;
            case 3: 
            System.out.println(num+" en numero romano se escribe III ");
            break;
            case 4: 
            System.out.println(num+" en numero romano se escribe IV ");
            break;
            case 5: 
            System.out.println(num+" en numero romano se escribe V ");
            break;
            case 6: 
            System.out.println(num+" en numero romano se escribe VI ");
            break;
            case 7: 
            System.out.println(num+" en numero romano se escribe VII ");
            break;
            case 8: 
            System.out.println(num+" en numero romano se escribe VIII ");
            break;
            case 9: 
            System.out.println(num+" en numero romano se escribe IX ");
            break;
            case 10: 
            System.out.println(num+" en numero romano se escribe X ");
            break;
            default :
               System.out.println("el numero ingresado es incorrecto");
      }
   }
   
}
