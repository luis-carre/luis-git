
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis-
 */
public class ejercicio3 {
    




   public static void main(String[ ] args) {
       //*Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
       //Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
       //por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
      String palabra;
      Scanner leer = new Scanner (System.in);
       System.out.println("ingrese una palabra");
       palabra = leer.nextLine();
       
       if (palabra.length() == 8) {
       System.out.println("Es correcto");
      } else{ 
       System.out.println("Es incorrecto");
       }
   }
}