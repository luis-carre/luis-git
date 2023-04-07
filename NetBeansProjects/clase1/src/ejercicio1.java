
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis-
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
                int numero;
                
                System.out.println("ingrese un numero");
                 numero = leer.nextInt();
                if (numero %2 ==0){
                    System.out.println("el numero es par");
                }else {
                    System.out.println("es impar");    
                }
    
}
}

    
