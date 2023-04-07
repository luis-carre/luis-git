/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercclase;

import java.util.Scanner;

/**
 *
 * @author luis-
 */
public class ejerc2 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
Scanner leer = new Scanner(System.in);
        //ingreso cantidad de compañeros
        System.out.print("Ingrese cantidad de compañeros: ");
        int comp = leer.nextInt();
        //declaro matriz y dimensiono 
        String [] Equipo = new String [comp];
        
        //Llenar vector
        for(int i = 0; i < comp; i++){
             System.out.print("Nombre [" + i + "]= ");
            //acceder al valor i del vector
            Equipo[i] = leer.next();
        }
        //solo genera espacio linea 40
        System.out.println("");
        //Mostrar Vector
        for (int i = 0; i < comp; i++) {
            System.out.print("[" + Equipo[i] + "] ");
        }
        System.out.println("");
    }
// Aqui los valores se introducen al declarar el arreglo.
String[] frutas = {"mango", "uva", "pera", "manzana"};

// Aqui los valores se introducen despues de declarar el arreglo. 
// Este es un arreglo de 4 posiciones, el numero de elementos que puede  
// almacenar se declara en la instancia de este.
String[] nombres = new String[4];
nombres[0] = "Jose";
nombres[1] = "Pedro";
nombres[2] = "Juan";
nombres[3] = "Rafael";
}