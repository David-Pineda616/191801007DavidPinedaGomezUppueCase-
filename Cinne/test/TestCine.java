/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Pineda
 */
public class TestCine {
     public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        String titulo;
        int n = 0,horaIn,horaOut;
        
        Cine cine = new Cine();
        
        while(n==0){
            System.out.println("Ingresa el titulo de la pelicula: ");
            titulo = scan.nextLine();
            scan.nextLine();
            
            Pelicula nue=new Pelicula(titulo);

            cine.AgregarPelicula(nue);
            System.out.println("Prueba3");
            System.out.println("Si desea continuar ingrese 0");
            n = scan.nextInt();
        }
        System.out.println(cine.imprimirPeliculas());
    }
}
