/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc_extra_luis;

import java.util.Scanner;

/**Escribir un programa que lea un número entero y devuelva el número de dígitos
 * que componen ese número Por ejemplo, si introducimos el número 12345, el programa 
 * deberá devolver 5 Calcular la cantidad de dígitos matemáticamente utilizando el
 * operador de división Nota: recordar que las variables de tipo entero truncan los números o resultados.

 *
 * @author luis-
 */
public class ejerc11 {
 public static void main(String [] args){
    Scanner leer=new Scanner(System.in);
    System.out.println("ingrese un numero entero");
    int num=leer.nextInt();
    int conta=0, divi;
    while (num>=1){
       conta++;
      divi=num/10;
      num=divi;
    }
    System.out.println("la cantidad de digitos ingresados son: "+conta);
 }  
}
