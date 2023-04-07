/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc_extra_luis;

import java.util.Scanner;

/**Realice un programa que calcule y visualice el valor máximo, el valor mínimo
 * y el promedio de n números (n>0) El valor de n se solicitará al principio del
 * programa y los números serán introducidos por el usuario Realice dos versiones
 * del programa, una usando el bucle “while” y otra con el bucle “do - while”.

 *
 * @author luis-
 */
public class ejerc7 {
   public static void main(String [] args) {
      Scanner leer=new Scanner(System.in);
      System.out.println("ingrese la cantidad de numeros a calcular");
      int n=leer.nextInt();
      int i=0, min=1, max=1, prom=0;
      double promtotal=0;
      if (n>0){
         while (i<n){
            i++;
            System.out.println("ingrese el "+i+"° numero");
            int num=leer.nextInt();
          
            if (i<=1){
               min=num;
               max=num;
               prom+=num;
              
            }
            if(num<min){
               min=num;
               prom+=num;
            }
            if(num>max){
               max=num;
               prom+=num;
            }
      
         }
         promtotal=prom/i;
         System.out.println("el numero menmor ingresado es: " +min);
         System.out.println("el mayor numero ingresado es: "+max);
         System.out.println("el promedio de los numeros ingresados es: "+promtotal);
        
      }else{
         System.out.println("no ingreso un numero correcto");
      }
   }
}
