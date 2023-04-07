
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
public class ejercicio11 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
  Scanner leer= new Scanner(System.in);
      System.out.println("ingrese una frase");
      String frase=leer.nextLine();
      reemplazar(frase);
   }
 
  public static void reemplazar ( String frase) {

  
   StringBuilder resultado = new StringBuilder();
    for (int i=0; i<frase.length(); i++){
         char caracter = frase.charAt(i);
       switch (caracter){
          case 'a':
        
              resultado.append("@");
             break;
              case 'e':
        
              resultado.append("#");
             break;
              case 'i':

              resultado.append("$");
             break;
              case 'o':
 
             resultado.append("%");
             break;
              case 'u':
  
              resultado.append("*");
             break;
          default:
             resultado.append(caracter);
       }
       
    } 
     System.out.println(resultado.toString());
 
  } 
}
