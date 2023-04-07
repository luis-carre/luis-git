/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc_luis;

import java.util.Scanner;

/**
 *
 * @author luis-
 */
public class ejerc1 {

    /**Crear un programa que dado un número determine si es par o impar.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese un numero");
        int num =leer.nextInt();
          if (num % 2 == 0 )  
            System.out.println("el numero ingresado es par");
          else
             System.out.println("el numero ingresa es impar");
        
    }
    
}
