
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercclase;

/**
 *
 * @author luis-
 */
public class ejerc5 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
   }
   
}
Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese tamaño del vector: ");
        int tam = leer.nextInt();
        int[] vector = new int[tam];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }

        // Muestro el vector
        System.out.println("VECTOR: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
        System.out.println("");
        //buscar número
        System.out.print("Ingrese número a buscar:");
        int num = leer.nextInt();
        int cont = 0;
        for (int i = 0; i < vector.length; i++) {
            if (num == vector[i]) {
                cont += 1;
            }
        }
        
        if (cont == 1 || cont > 1){
            System.out.println("El número buscado: "+num+" esta en el vector");
           // if (cont > 1) {
                System.out.println("Se encuentra repetido " + cont+ " veces");
            //}
        } else {
            System.out.println("El número buscado: "+num+" NO esta en el vector");
        }