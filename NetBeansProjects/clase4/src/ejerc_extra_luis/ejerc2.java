/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc_extra_luis;

/**Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una
 *A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el
 * valor de A, A tome el valor de D y D tome el valor de B Mostrar los valores iniciales
 *  y los valores finales de cada variable Utilizar sólo una variable auxiliar.

 *
 * @author luis-
 */
public class ejerc2 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
     int A=9,  B=8, C=7, D=6, AUX;
      System.out.println("los valores iniciales seran los siguientes; A:" +A+"  B:"+B+ "  C:"+C+" D:"+D);
      System.out.println("REASIGNACIÓN");
    AUX=B;
    B=C;
    C=A;
    A=D;
    D=AUX;
    System.out.println("los valores nuevos asignados son los siguientes; A:" +A+"  B:"+B+ "  C:"+C+" D:"+D);
   }
   
}
