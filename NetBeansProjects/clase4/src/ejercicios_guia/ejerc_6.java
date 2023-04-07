/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_guia;

import java.util.Scanner;

/**Implementar un programa que le pida dos números enteros al usuario y 
 * determine si ambos o alguno de ellos es mayor a 25.
 *
 * @author luis-
 */
public class ejerc_6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese el primer numero entero");
        int num1= leer.nextInt();
        System.out.println("ingrese el segundo numero entero");
        int num2 = leer.nextInt();
        if (num1 > 25  && num2 > 25){
            System.out.println("ambos numeros ingresados son mayores a 25");
              
        }
         if (num1 > 25) {
        System.out.println("el primer numero ingresado es mayor a 25 ");
        } 
        if (num2 > 25) {
        System.out.println("el segundo numero ingresado es mayor a 25 ");
    }
    }
}
