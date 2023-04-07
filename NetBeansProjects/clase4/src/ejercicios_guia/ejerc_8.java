/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_guia;

import java.util.Scanner;

/**Escriba un programa que valide si una nota está entre 0 y 10, sino está
 * entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

 *
 * @author luis-
 */
public class ejerc_8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese la nota entre cero y diez");
         int nota=leer.nextInt();
        while (nota < 0 && nota > 10 ){
            System.out.println("su nota se encuentra fuera de rango, ingrese su nota de nuevo");
            
            
        
    }
        System.out.println("su nota ingresada este dentro del rango");
    }
 
}
