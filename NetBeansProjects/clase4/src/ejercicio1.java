
import java.util.Scanner;

/**
 *
 * @author 
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner leer = new Scanner(System.in);
                int numero;
                
                System.out.println("ingrese un numero");
                 numero = leer.nextInt();
                if (numero %2 ==0){
                    System.out.println("el numero es par");
                }else {
                    System.out.println("es impar");
                }
                        

        
    }
    
}
