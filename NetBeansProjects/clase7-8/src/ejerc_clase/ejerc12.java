/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc_clase;

import java.util.Scanner;

/**
 *
 * @author luis-
 */
public class ejerc12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer= new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        int num1=leer.nextInt();
          System.out.println("ingrese el segundo numero");
        int num2=leer.nextInt();
        System.out.print(validador("num1,num2"));
    }
     public static String validador(int num1, intm num2 ){
         int multiplo= num1 % num2 ;
         String resultado;
         if (multiplo == 0){
             
         }
         
     }
}
