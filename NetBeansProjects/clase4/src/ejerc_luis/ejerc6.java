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
public class ejerc6 {

  

    /**Realizar un programa que pida dos números enteros positivos por teclado
     * y muestre por pantalla el siguiente menú:El usuario deberá elegir una
     * opción y el programa deberá mostrar el resultado por pantalla y luego
     * volver al menú. El programa deberá ejecutarse hasta que se elija la
     * opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
     * vez de salir del programa directamente, se debe mostrar el siguiente
     * mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)?
     * Si el usuario selecciona el carácter ‘S’ se sale del programa,
     * caso contrario se vuelve a mostrar el menú.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer= new Scanner (System.in);
    
   
    
  
        System.out.println("ingrese el primer numero");
        int num1 = leer.nextInt();
           System.out.println("ingrese el segundo numero");
           int num2 = leer.nextInt();
           System.out.println("****** MENU******");
           System.out.println("****1 SUMAR******");
           System.out.println("****2  RESTAR****");
           System.out.println("****3 MULTIPLICAR");
           System.out.println("****4 DIVIDIR****");
           System.out.println("****5 SALIR******");
           
         boolean ciclo = true;
         
     do {
           System.out.println("ingrese la opcion que desea realizar");
           int  opcion =leer.nextInt();
           
          
           switch (opcion){
               case 1:
                   System.out.println("la suma es: "+(num1+num2));
                   break;
               case 2: 
                   System.out.println("la resta es: "+ (num1-num2));
                   break;
               case 3:
                   System.out.println("la multiplicacion es: "+(num1*num2));
                   break;
               case 4: 
                   System.out.println("la division es: "+(num1/num2));
                   break;
               case 5:
                   System.out.println("ingrese s (si)  y n (no)");
                   leer.nextLine();
                   String resp=leer.nextLine();
                   if (resp.equals("s")){
                      System.out.println("hasta la proxima");
                      ciclo=false;
                      break;
                   } else {
                      System.out.println("gracias por contunuar");
                      break;
                   }
               default:
                   System.out.println("no ingreso un valor correcto, intente nuevamente");
                   break;
           }
        }  while (ciclo); 
            
    }
    
}
