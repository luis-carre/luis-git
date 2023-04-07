/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_2y3;

import java.util.Scanner;

/**Escribir un programa que pida dos números enteros por teclado y calcule 
 * la suma de los dos. El programa deberá después mostrar
 * el resultado de la suma

 *
 * @author luis-
 */
public class ejerc_pract1 {
    public static void main(String[] args ) {
        Scanner leer = new Scanner (System.in);
        int num1; 
        System.out.println("ingresa el primer numero"); 
        num1=leer.nextInt();
        int num2;
        System.out.println("ingresa el segundo numero");
        num2=leer.nextInt();
        
        int suma = num1 + num2 ;
        
        System.out.println("el valor de la suma es" + suma);
}
}