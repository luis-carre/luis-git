/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_guia;

import java.util.Scanner;

/**Realizar un programa que lea 4 números (comprendidos entre 1 y 20)
 * e imprima el número ingresado seguido de tantos asteriscos como indique 
 * su valor. Por ejemplo:
5 *****

 *
 * @author luis-
 */
public class ejerc_10 {
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        int num=0;
       for (int i=0 ; i<4; i++){
           System.out.println("ingrese un numero");
         num=leer.nextInt();
           System.out.print(num);
           if (num<20){
           for (int j=0 ; j<num; j++){
               System.out.print("*");
           }
               System.out.println(" ");
           
       }  else {
               System.out.println("el numero ingresado es incorrecto");
           }
       }
        System.out.println(" ");
       }
        
}
