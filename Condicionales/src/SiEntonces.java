
import java.util.Scanner;


public class SiEntonces {
    public static void main(String[] args){
        int numero;
        Scanner leer=new Scanner(System.in);
        System.out.print("Ingresa un numero ");
        numero=leer.nextInt();
        if(numero<0)
            System.out.println("El numero es negativo ");
        else
            System.out.println("El numero es positivo ");
    }
}
