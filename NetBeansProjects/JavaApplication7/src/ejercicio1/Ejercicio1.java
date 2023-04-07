/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/*
 * @author Ger
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Defino las dos variables de los números enteros
        int num1;
        int num2;
        Scanner leer=new Scanner(System.in);
        
        // Pido por teclado que se ingresen los dos números
        System.out.print("Ingrese el primer número: ");
        num1 = leer.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = leer.nextInt();
        // Devuelve en pantalla la suma de los dos números
        System.out.println("La suma de " + num1 + " y " + num2 + " es igual a " + (num1+num2))
    }
    
}