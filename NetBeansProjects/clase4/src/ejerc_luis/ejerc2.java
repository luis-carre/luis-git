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
public class ejerc2 {

    /**Crear un programa que pida una frase y si esa frase es igual a “eureka”
     * el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
     * Incorrecto. Nota: investigar la función equals() en Java.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la frase");
        String frase;
        frase = leer.nextLine();
        if (frase.equals( "eureka")){
            System.out.println("correcto");  
        } else 
            System.out.println("incorrecto");
    }
    
}
