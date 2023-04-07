/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc_guia_teorica;

import java.util.Scanner;

/**
 *
 * @author luis-
 */
public class ejerc_13 {

   /**Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo
    * y define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.

    * @param args the command line arguments
    */
   public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);  
     String [] equipo= new String[8];
     	for (int i = 0; i < 8; i++) {
               System.out.println("ingrese el numbre de su compañero");
               String nombre=leer.nextLine();
               equipo[i] ="nombre";
   }
   
}
}