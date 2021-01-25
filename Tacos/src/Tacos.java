import java.util.Scanner;
public class Tacos {
    public static void main(String[] args){
        int tacos,refrescos,total;
        Scanner s=new Scanner(System.in);
        System.out.print("Cuantos tacos pido? ");
        tacos=s.nextInt();
        System.out.print("Cuantos refrescos pido? ");
        refrescos=s.nextInt();
        total=(refrescos*10)+(tacos*17);
        System.out.println("La cuenta es de "+total);
    }
}
