/**
 *
 * @author Pineda
 */
import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Double invertir,interesAnual,ganancias;
        int años;
        System.out.print("Ingresa la cantidad a invertir ");
        invertir=scanner.nextDouble();
        System.out.print("Ingresa la cantidad de interes anual ");
        interesAnual=scanner.nextDouble();
        System.out.print("Ingresa la cantidad de años invertir ");
        años=scanner.nextInt();
        ganancias=(invertir-interesAnual)*años;
        System.out.println("Ganancias :"+ganancias);
    }
}
