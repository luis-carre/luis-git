/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc_clase;

import java.util.Scanner;

/**
 *
 * @author luis-
 */
public class ejerc12_corre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic he
 
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.print("Ingrese el primer número: ");
        num1 = leer.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = leer.nextInt();
        
        System.out.print(validador(num1, num2));
        System.out.println("");
        

    }
    
    public static String validador (int num1, int num2) {
        
            int multiplo = num1 % num2;
        String resultado;
        
        if (multiplo == 0) {
            resultado = "Es múltiplo";
        } else {
            resultado = "No es múltiplo";
        }
      
        
        return resultado;
    }
}