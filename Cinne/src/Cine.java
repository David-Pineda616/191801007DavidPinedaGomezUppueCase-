import java.util.*;
/**
 *
 * @author Pineda
 */
public class Cine {
    public String nombreCine;
    public int horaInicio, horaFin;
    public ArrayList <Pelicula> peliculas=new ArrayList();
  
    public Cine(){
        this.horaFin= 0;
        this.horaInicio= 0;
        this.nombreCine= "";
        
    }
    public boolean abierto(int hora){
        if(hora>horaInicio&&hora<horaFin)
                return true;
        else
            return false;   
    }
    public Cine(String nombreCine, int horaInicio, int horaFin, ArrayList <Pelicula> peliculas){
        this.horaFin= horaFin;
        this.horaInicio= horaInicio;
        this.nombreCine= nombreCine;
        this.peliculas= peliculas;
    }
    public String imprimirPeliculas(){
        String cartelera= "";
        for(Pelicula pelicula: peliculas){
            cartelera+= pelicula.titulo+"\n";
        }
        return cartelera;
    }
    public Cine(String nombreCine,int horaInicio,int horaFin){
        this.horaFin=horaFin;
        this.horaInicio=horaInicio;
        this.nombreCine=nombreCine;
    }
    public void AgregarPelicula(Pelicula pelicula){
 
	peliculas.add(pelicula);
       
        
    }
    @Override
    public String toString(){
        return "Cine: "+nombreCine+"\nHora de inicio: "+horaInicio+"\nHora final: "+horaFin;
    }
}
