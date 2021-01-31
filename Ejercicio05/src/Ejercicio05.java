
import java.util.Scanner;

/**
 *
 * @author Pineda
 */
public class Ejercicio05 {
    public static void main(String[] args){
        int valor,i=2;
        boolean sentinela=true;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingresa el numero  ");
        valor=scanner.nextInt();
        while(i<valor&&sentinela){
            if((valor%i)==0)
                sentinela=false;
            i++;
        }
        if (sentinela)
            System.out.println("El numero es primo ");
        else
            System.out.println("El numero no es primo ");
    }
}
