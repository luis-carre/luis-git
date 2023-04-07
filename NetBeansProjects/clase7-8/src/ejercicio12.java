
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**Crea un procedimiento EsMultiplo que reciba los dos números pasados por el 
 * usuario, validando que el primer número múltiplo del segundo e imprima si el
 * primer número es múltiplo del segundo, sino informe que no lo son.

 *
 * @author luis-
 */
public class ejercicio12 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
     Scanner leer= new Scanner(System.in);
    
      System.out.println("ingrese el primer numero");
       int num1 = leer.nextInt();
      System.out.println("ingrese el segundo numero");
      int num2 = leer.nextInt(); 
      esmultiplo(num1, num2);
      
   }
    public static void esmultiplo(int num1, int num2) {
       if (num2 % num1 == 0){
          System.out.println(num1+" es multiplo de "+num2);
       }else {
          System.out.println(num1+" no es multiplo de "+num2);
       }
      
   }
}
