
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author Pineda
 */
public class Tienda {
    public static void main (String[] args){ 
        Scanner scanner=new Scanner(System.in);
        Libretas libreta1=new Libretas("Norma",200, 90.5, false);
        Libretas libreta2=new Libretas("Norma",500, 250.32, true);
        String marca,pastaDura;
        marca= JOptionPane.showInputDialog("Ingresa la marcar de la libreta ");
        pastaDura=JOptionPane.showInputDialog("Tiene pasta dura?");
        boolean pasta;
        if(pastaDura.equalsIgnoreCase("si")||pastaDura.equalsIgnoreCase("simios")||pastaDura.equalsIgnoreCase("simon"))
            pasta=true;
        else
            pasta=false;
        System.out.print("Ingresa el numero de paginas ");
        int numeroPaginas=scanner.nextInt();
        System.out.print("Ingresa el precio de la libreta ");
        Double precioLibreta=scanner.nextDouble();
        Libretas libreta3=new Libretas(marca,numeroPaginas,precioLibreta,pasta);
        System.out.println("------------------");
        System.out.println(libreta1);
        System.out.println("------------------");
        System.out.println(libreta2);
        System.out.println("------------------");
        System.out.println(libreta3);
        System.out.println("------------------");
    }
}
