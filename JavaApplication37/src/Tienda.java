
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pineda
 */
public class Tienda{
    public static void main (String args){ 
        Scanner scanner=new Scanner(System.in);
        Libretas libreta1=new Libretas("Norma",200, 90.5, false);
        Libretas libreta2=new Libretas("Norma",500, 250.32, true);
        String marca,pastaDura;
        marca= JOptionPane.showInputDialog("Ingresa la marcar de la libreta ");
        pastaDura=JOptionPane.showInputDialog("Tiene pasta dura?");
        boolean pasta;
        if(pastaDura.equals("SI"))
            pasta=true;
        else
            pasta=false;
        System.out.print("Ingresa el numero de paginas ");
        int numeroPaginas=scanner.nextInt();
        System.out.print("Ingresa el precio de la libreta");
        Double precioLibreta=scanner.nextDouble();
        Libretas libreta3=new Libretas(marca,numeroPaginas,precioLibreta,pasta);
    }
}

