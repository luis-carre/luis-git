/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc_guia;

import java.util.Scanner;

/**Crea una aplicación que le pida dos números al usuario y este pueda elegir entre
 * sumar, restar, multiplicar y dividir. La aplicación debe tener una función para
 * cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 
 *
 * @author luis-
 */
public class ejerc1 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
      System.out.println("ingrese el primer numero");
      double num1=leer.nextDouble();
      System.out.println("ingrese el segundo numero numero");
      double num2=leer.nextDouble();
       boolean login= true;
       int opcion;
   do {
      
      System.out.println("*****MENU*****");
      System.out.println("***1. SUMA***");
      System.out.println("***2. RESTA**");
      System.out.println("***3. MULT***");
      System.out.println("***4. DIVI***");
      System.out.println("***5. SALIR**");
          System.out.println("INGRESA LA OPCION QUE DESEAS REALIZAR");
      opcion=leer.nextInt();
         
        
         switch (opcion) {
            case 1:
               System.out.println("la suma de los numeros es " + suma(num1, num2));
               break;
            case 2:
               System.out.println("la resta de los numeros es: "  + resta(num1,num2));
               break;  
            case 3:
               System.out.println("la multiplicacion de los numeros es: " + mult(num1,num2));
               break; 
             case 4:
               System.out.println("la division de los numeros es: " + divi(num1,num2));
               break;
            case 5:
               System.out.println("hasta la proxima ") ;
               login= false;
               break;   
            default:
               System.out.println("la opcion ingresada no es correcta intente de nuevo");
         }
             System.out.println(" ");
          } while (login);
    
   }
   
       public static double suma(double num1, double num2){
      return num1 +num2;
   }
       public static double resta(double num1, double num2) {
          return num1 - num2;
       }
       public static double mult(double num1, double num2) {
          return num1 * num2;
          
       }
       public static double divi(double num1, double num2) {
          if (num2==0){
             System.out.println("opcion no valida estas intentando dividir por cero");
             return 0;
          }else{
             return num1 / num2;
       }
       }    
   }

