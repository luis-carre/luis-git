
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
public class ejercicio2 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner leer = new Scanner(System.in);
                String frase;
                System.out.println("ingrese la frase");
                frase = leer.nextLine();
                if (frase.equals("eureka"))
                    System.out.println("es igual");
                else 
                    System.out.println("son distintas ");
    }
                

    }