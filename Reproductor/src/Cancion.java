/**
 *
 * @author Pineda
 */
public class Cancion {
    public int orden;
    public String titulo;
    Double duracion;
    
    public Cancion(){
        
    }
    public Cancion(int orden,String titulo,Double duracion){
        this.orden=orden;
        this.titulo=titulo;
        this.duracion=duracion;
    }
    
    @Override
    public String toString(){
        return " ";
    }
    
}
