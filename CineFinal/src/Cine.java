/**
 *
 * @author Pineda
 */import java.util.*;
public class Cine {
    public String nombreCine;
    private int tamanio,i=0;
    public int horaInicio, horaFin;
    public String menuPeliculas="";
    public ArrayList <Pelicula> peliculas=new ArrayList();
    public Cine(){
        this.horaFin= 0;
        this.horaInicio= 0;
        this.nombreCine= "";
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
    @Override
    public String toString(){
        return "Cine: "+nombreCine+"\nHora de inicio: "+horaInicio+"\nHora final: "+horaFin;
    }
    public void AgregarPelicula(Pelicula titulo){
        this.peliculas.add(titulo);
       
    }
    
    ///////////////////////////////////////
    public boolean abierto(int hora){
        if(hora>horaInicio&&hora<horaFin)
                return true;
        else
            return false;   
    }
    public int CantidadPeliculas(){
        tamanio = peliculas.size();
        return tamanio;
    }
    public String MostrarPeliuclas(){
        for(Pelicula pelicula:peliculas){
            menuPeliculas=peliculas.toString()+"\n\n";
        }
        return menuPeliculas;
        
    }
}
