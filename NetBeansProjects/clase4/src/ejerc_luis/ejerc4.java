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
public class ejerc4 {

    /**Escriba un programa que pida una frase o palabra y valide si la primera
     * letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se debera
     * ́ de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
     * contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la 
     * función Substring y equals() de Java.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
        System.out.println("ingrese una frase que comience con A");
        String frase =leer.nextLine();
        if (frase.substring(0,1). equals("A")){
            System.out.println("correcto");
    } else 
            System.out.println("incorrecto");
    
}
}
