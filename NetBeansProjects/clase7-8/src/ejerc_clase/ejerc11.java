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
public class ejerc11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una secuencia de caracteres terminada en punto: ");
        String cadena = sc.nextLine();

        codificarVocales(cadena);
        
    }

    public static void codificarVocales(String cadena) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            switch (caracter) {
                case 'a':
                    resultado.append('@');
                    break;
                case 'e':
                    resultado.append('#');
                    break;
                case 'i':
                    resultado.append('$');
                    break;
                case 'o':
                    resultado.append('%');
                    break;
                case 'u':
                    resultado.append('*');
                    break;
                case 'A':
                    resultado.append('@');
                    break;
                case 'E':
                    resultado.append('#');
                    break;
                case 'I':
                    resultado.append('$');
                    break;
                case 'O':
                    resultado.append('%');
                    break;
                case 'U':
                    resultado.append('*');
                    break;
                default:
                    resultado.append(caracter);
                    break;
            }
        }
        System.out.println(resultado.toString());
    }
}