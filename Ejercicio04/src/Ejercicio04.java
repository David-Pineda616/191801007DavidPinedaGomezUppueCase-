/**
 *
 * @author Pineda
 */
import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int lado1,lado2,lado3;
        System.out.print("Ingresa valor del primer lado ");
        lado1=scanner.nextInt();
        System.out.print("Ingresa valor del segundo lado ");
        lado2=scanner.nextInt();
        System.out.print("Ingresa valor del tercer lado ");
        lado3=scanner.nextInt();
        System.out.println(lado1+" "+lado2+" " +lado3);
        if((lado1==lado2)&&(lado2==lado3))
            System.out.println("Es un triangulo equilatero");
        else if(lado1!=lado2&&lado2!=lado3&&lado3!=lado1)
            System.out.println("Es un triangulo escaleno");
        else
            System.out.println("Es un triangulo isoceles");
    }
}
