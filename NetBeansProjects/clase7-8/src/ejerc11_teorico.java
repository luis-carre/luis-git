
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
public class ejerc11_teorico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        System.out.println("ingrese una frase");
        String frase =leer.nextLine();
        reemplazar(frase); 
    }
    
}
public static void reemplazar(String frase){
        int longi;
        String letra;
        longi = frase.length();
        for(int i = 0; i<longi; i++){
            letra = frase.substring(i, i+1);
            switch (letra){
                case "a":
                case "A":
                    System.out.print("@");
                    break;
                case "e":
                case "E":
                    System.out.print("#");
                    break;
                case "i":
                case "I":
                    System.out.print("$");
                    break;
                case "o":
                case "O":
                    System.out.print("%");
                    break;
                case "u":
                case "U":
                    System.out.print("*");
                    break;
                default:
                    System.out.print(letra);
            }
        }
        System.out.println("");
        
    }