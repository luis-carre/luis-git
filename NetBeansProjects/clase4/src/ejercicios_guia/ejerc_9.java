/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_guia;

import java.util.Scanner;

/**Escriba un programa que lea 20 números. Si el número leído es igual a cero
 * se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
 * El programa deberá calcular y mostrar el resultado de la suma de los números
 * leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
 * de la sentencia break
 *
 * @author luis-
 */
public class ejerc_9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num = 0;
        int suma =0;
        int ing;
        do {
            System.out.println("ingrese un numero");
           ing = leer.nextInt();
           num++ ;
        if (ing > 0 ) {
           suma =suma + ing;
        } 
         
        
        } while (num<20 && ing !=0);
        System.out.println("la suma de los numero ingresados es "+ suma);
    }
 
}
