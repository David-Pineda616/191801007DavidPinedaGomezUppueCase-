/**
 *
 * @author Pineda
 */
import java.util.*;
public class test2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        Scanner scan= new Scanner(System.in);
        int o=0;
        ArrayList <Pelicula> peliculas = new ArrayList();
        do{
            System.out.println("¿Quieres agregar una película? ");
            System.out.println("1-Sí\n2-No");
            o= scan.nextInt();
            if(o==1){
                System.out.println("Inserta el título de la película: ");
                String titulo= scanner.nextLine();
                Pelicula nuevaPelicula= new Pelicula(titulo);
                peliculas.add(nuevaPelicula);
                peliculas.size();
            }
            else{
                System.out.println("Terminado");
                System.out.println("\n");
            }
        }
        while(o!=2);
        System.out.println(peliculas.size());
        for(Pelicula pelicula: peliculas){
            System.out.println(pelicula);
        }
    }
}
