/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc_luis;

import java.util.Scanner;

/** Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X
 * y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE),
* y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. Para resolver el ejercicio deberá 
* investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().

 *
 * @author luis-
 */
public class ejerc7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer= new Scanner(System.in);
         int correcto=0;
         int incorrecto=0;
         System.out.println("ingrese una frase de 5 caracteres que comience con x y termine con o para terminar ingrese &&&&&");
         String frase=leer.nextLine();
         while (!frase.equals("&&&&&")){
             if (frase.substring(0,1).equals("x") && frase.endsWith("o") && frase.length()==5){
              correcto++;
               
             }else{
             incorrecto++;
         
             } System.out.println("ingrese una frase de 5 caracteres que comience con x y termine con o para terminar ingrese &&&&&");
          frase=leer.nextLine();    
         }
         System.out.println("las frases correctas son" + correcto);
         System.out.println("las frases incorrectas son " + incorrecto);
         
    }
    
}
