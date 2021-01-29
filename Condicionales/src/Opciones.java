import java.util.Scanner;
public class Opciones {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int numero1,numero2,opcion;
        System.out.print("Dame el primer valor ");
        numero1=scanner.nextInt();
        System.out.print("Dame el segundo valor ");
        numero2=scanner.nextInt();
        System.out.print("1.-Suma\n2.-Resta\n   :");
        opcion=scanner.nextInt();
        switch(opcion){
            case 1:
                System.out.print("La suma de "+numero1 +" con "+numero2+" es igual a "+(numero1+numero2));
                break;
            case 2:
                System.out.print("La resta de "+numero1 +" con "+numero2+" es igual a "+(numero1-numero2));
                break;
            default:
                System.out.println("No existe esta opcion");
        }
    }
}
