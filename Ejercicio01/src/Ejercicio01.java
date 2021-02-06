import java.util.Scanner;
/**
 *
 * @author Pineda
 */
public class Ejercicio01 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int edad,año;
        System.out.print("Ingresa tu edad  ");
        edad=scanner.nextInt();
        año=2021-edad;
        System.out.println("Año que naciste es "+año);
    }
}
