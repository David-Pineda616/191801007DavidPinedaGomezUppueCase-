
import java.util.ArrayList;

/**
 *
 * @author Pineda
 */
public class TestCancion {
    public static void main(String[] args){
        ArrayList <Cancion> canciones=new ArrayList();
        Cancion cancion1=new Cancion(1,"Como una novela",3.46);
        Cancion cancion2=new Cancion(2,"Contra el dragon",3.48);
        Cancion cancion3=new Cancion(3,"viri viri bombom",3.5);
        canciones.add(cancion1);
        canciones.add(cancion2);
        canciones.add(cancion3);
        Disco losacosta=new Disco("nombre","artista",2005,3,canciones);
    }
}
