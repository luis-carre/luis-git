/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc_clase;

/**
 *
 * @author luis-
 */
public class ejerc_4 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
       int [][] matriz= new int[4][4];
        
      for (int i = 0; i < 4; i++) {
          for (int j = 0; j < 4; j++) {
              matriz[i][j]= (int) ((Math.random()*20)+1);
              System.out.print("[" + matriz[i][j]+ "]");
          }
            System.out.println(" ");
        }
          
        System.out.println("  ");
        
        for (int i = 0; i < 4; i++) {
          for (int j = 0; j < 4; j++) {
             
              System.out.print("[" + matriz[j][i]+ "]");
          }
            System.out.println(" ");
        }
      }
    }
   
