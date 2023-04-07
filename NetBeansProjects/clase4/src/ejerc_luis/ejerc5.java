/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc_luis;

import java.util.Scanner;

/**Escriba un programa en el cual se ingrese un valor límite positivo, y a 
 * continuación solicite números al usuario hasta que la suma de los números 
 * introducidos supere el límite inicial.
 *
 * @author luis-
 */
public class ejerc5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in);
     int suma=0;
        System.out.println("ingrese el numero limite");
        int num_limit = leer.nextInt();
        do {
            System.out.println("ingrese un numero");
            int num = leer.nextInt();
            suma=suma + num;
            
        } while (suma < num_limit );
        System.out.println("la suma de los numeros es "+ suma);
        }
    }
    

