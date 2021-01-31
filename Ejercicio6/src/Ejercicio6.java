/**
 *
 * @author Pineda
 */
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        boolean salir=true;
        int opcion;
        double monto,total=0.0;
        do{
            System.out.println("Ingrese 0 para salir");
                do{
                    System.out.print("Ingresa el monto ");
                    monto=scanner.nextDouble();
                    if(monto<0.0)
                        System.out.println("El valor no puede ser negativo");
                }while(monto<0.0);
                total+=monto;
                if(monto==0.0)
                    salir=false;
        }while(salir);
        if(total>999.0)
            total=total-(total*.1);
        System.out.println("EL total es de "+total);
    }
}
