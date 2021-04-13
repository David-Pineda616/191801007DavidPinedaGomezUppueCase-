
package factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el numero   ");
        CalcularFactorial.ingresar=scanner.nextInt();
        for(int i=1;i<=CalcularFactorial.ingresar;i++){
            CalcularFactorial.Ingresarnumero(i);
            CalcularFactorial.regresaFactorial();
            if(i!=CalcularFactorial.ingresar)
                System.out.print(CalcularFactorial.numero+" * ");
            else
                System.out.print(i+" = "+CalcularFactorial.numeroFactorial+"\n");
        }
    }  
}
