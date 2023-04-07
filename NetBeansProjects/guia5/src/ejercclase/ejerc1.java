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
public class ejerc1 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
 
Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String[]equipo= new String[8];
        for (int i = 0; i < 7; i++) {
            System.out.println("ingrese un  nombre de integrante del equipo");
            
          equipo[i] = leer.nextLine() ;
  
          
                
            }
        for (int i = 0; i < 7; i++) {
            System.out.print(equipo[i] + " , " );
            
            //
        }
        System.out.println("");
        }
        
    }