/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc_luis;

import java.util.Scanner;

/**Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
 * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*        *
*        *
* * * *

 *
 * @author luis-
 */
public class ejerc8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer= new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num=leer.nextInt();
        for (int i=1; i<=num; i++){
            for (int r=1; r<=num; r++){
            if(i>1 && i<num && r>1 && r<num){
                System.out.print("   ");
           
            }else{
                System.out.print(" * "); 
     
            }
            
        }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
    
}
