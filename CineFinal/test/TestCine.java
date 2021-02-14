/**
 *
 * @author Pineda
 */
import java.util.*;
public class TestCine {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
     String titulo,agregar;
     int menu,hora;
    boolean verificar=true,open;
    int n = 0,horaIn,horaOut;
    Cine cine=new Cine();
    do{
        System.out.println("Ingresa el titulo de la pelicula: ");
        titulo = scan.nextLine();
        //scan.nextLine();peli
        Pelicula nueva=new Pelicula(titulo);
        cine.AgregarPelicula(nueva);
        System.out.print("Quieres agregar otra pelicula? ");
        agregar = scan.nextLine();
        //scan.nextLine();
        if(agregar.equalsIgnoreCase("no"))
            verificar=false;
    }while(verificar);
    verificar=true;
    do{
        System.out.println("1.-Imprimir total de peliculas ");
        System.out.println("2.-Imprimir menu de peliculas ");
        System.out.println("3.-Verificar si esta abierto ");
        System.out.println("4.-salir ");
        menu = scan.nextInt();
        switch (menu){
            case 1:
                System.out.println("Hay un total de "+cine.CantidadPeliculas()+" en la cartelera");
                break;
            case 2:
                System.out.println(cine.MostrarPeliuclas());
                break;
            case 3:
                System.out.print("Ingresa la hora ");
                hora=scan.nextInt();
                open=cine.abierto(hora);
                if(open)
                    System.out.print("Esta abierto");
                else
                    System.out.print("No esta abierto");
                break;
            case 4:
                verificar=false;
                break;
        }
    }while(verificar);
    }
    
    
}
