/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_2y3;

import java.util.Scanner;

/**Dada una cantidad de grados centígrados se debe mostrar su equivalente
 * en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

 *
 * @author luis-
 */
public class ejerc_pract4 {
public static void main (String [] args) {
    Scanner leer = new Scanner (System.in);
    int grados;
    System.out.println("ingrese temperatura en grados centigrados");
    grados = leer.nextInt();
    int fare = 32 + (9* grados / 5);
    System.out.println("los grados ingresados, en fahrenheit son: " + fare);
}    
}
