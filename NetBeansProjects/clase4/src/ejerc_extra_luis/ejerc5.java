/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc_extra_luis;

import java.util.Scanner;

/**Una obra social tiene tres clases de socios: Los socios tipo ‘A’ abonan una cuota mayor,
 * pero tienen un 50% de descuento en todos los tipos de tratamientos Los socios tipo ‘B’ abonan
 * una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que 
* represente el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar
* por dicho socio.

 *
 * @author luis-
 */
public class ejerc5 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
      System.out.println("ingrese la letra que represente que tipo de socio es A, B ó C.");
      String opcion=leer.nextLine();
      
      System.out.println("ingrese el valor del tratamiento");
      int valor=leer.nextInt();
      double desc = 0;
      switch (opcion){
         case "a":
            desc=valor*0.5;
            System.out.println("el valor del tratamiento con el descuento es: "+ desc);
            break;
         case "b":
            desc=valor*0.35;
            System.out.println("el valor del tratamiento con el descuento es: "+ desc);
            break;
         case "c":
            System.out.println("no cuenta con descuento para este tratamiento, el valor es: "+ valor);
            break;
         default:
            System.out.println("no ha ingresado un valor correcto.");
      }
   }
   
}
