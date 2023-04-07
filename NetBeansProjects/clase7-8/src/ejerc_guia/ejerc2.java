/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc_guia;

import java.util.Scanner;

/**Diseñe una función que pida el nombre y la edad de N personas e imprima los datos
 * de las personas ingresadas por teclado e indique si son mayores o menores de edad.
 * Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
 * mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 *
 * @author luis-
 */
public class ejerc2 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
     Scanner leer=new Scanner(System.in);
     boolean login= true;

     do{
         System.out.println("ingrese nombre");
         String nombre=leer.nextLine();
         System.out.println("ingrese la edad");
         int edad=leer.nextInt();
         remplazo(nombre, edad);
         System.out.println("desea cargar otra persona, ingrese si (continiuar), no (salir) ");
         String salir=leer.nextLine();
         salir=leer.nextLine();
         if (salir.equals("si")){
            
            login=true;
         } else{
            System.out.println("hasta la proxima");
            login=false;
         }
     } while (login);
   }
   public static void remplazo(String nombre, int edad){
      String retorno;
     if (edad>=18){
        retorno=" mayor de edad";
     } else{
        retorno=" menor de edad";
     }
      System.out.println(nombre+ " es: "+retorno);
   } 
   
   
}
