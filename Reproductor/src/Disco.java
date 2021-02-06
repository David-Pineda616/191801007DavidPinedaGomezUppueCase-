import java.util.ArrayList;
/**
 *
 * @author Pineda
 */
public class Disco {
    //public Cancion cancion=new Cancion();
    public String nombre,artista;
    public static int numeroCancion;
    public int anio;
    public ArrayList <Cancion> canciones;
    public Disco(String nombre,String artista,int anio,int numeroCancion,ArrayList <Cancion> canciones){
        this.anio=anio;
        this.artista=artista;
        this.canciones=canciones;
        this.nombre=nombre;
    }
    public Disco(){
        
    }
    @Override
    public String toString(){
        return " ";
    }
    
}
