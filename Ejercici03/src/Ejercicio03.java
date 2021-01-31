import java.util.Scanner;
/**
 *
 * @author Pineda
 */
public class Ejercicio03 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Double numero1,numero2,resultado=0.0;
        int menu;
        System.out.print("Ingresa el primer numero  ");
        numero1=scanner.nextDouble();
        System.out.print("Ingresa el segundo numero  ");
        numero2=scanner.nextDouble();
        System.out.print("1.-Sumar \n2.-Restar \n3.-Multiplicar \n4.-Dividir \n    : ");
        menu=scanner.nextInt();
        switch(menu){
            case 1:
                resultado=numero1+numero2;
                break;
            case 2:
                resultado=numero1-numero2;
                break;
            case 3:
                resultado=numero1*numero2;
                break;
            case 4:
                resultado=numero1/numero2;
                break;
            default:
                System.out.println("Opcion no valida");
                
        }
        if(menu>0&&menu<5)
        System.out.println("resultado :"+resultado);
    }
}
