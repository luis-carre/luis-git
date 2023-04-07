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
public class ejerc_5 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
         int [][] matriz= {{0,-2,4} , {2,0,2} , {-4,-2,0}};
       
        
        String aux="";
        
      System.out.println(" matriz;");
        
        for (int [] fila : matriz) {
            aux = "";
            //para cada elemento de la fila
            for (int elemento : fila){
              aux+= "[" + elemento+ "]";  
            }
            System.out.println(aux);
           // System.out.println(" ");
        }
          
        System.out.println("  ");
        
        for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
             
              System.out.print("[" + matriz[j][i]+ "]");
          }
            System.out.println(" ");
    }
    
       
        boolean antisimetrica= true;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if( matriz[i][j]!= -matriz[j][i]){
                antisimetrica=false; 
                break;
            }
            
        }
             if (!antisimetrica) {
                break;

        }
         
}
        if(antisimetrica){
            System.out.println("La matriz es antisimétrica");
         }else{
             System.out.println("La matriz NO es antisimétrica");
         }
}
}
   
   

