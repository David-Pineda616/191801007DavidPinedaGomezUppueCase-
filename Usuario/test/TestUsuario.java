/**
 *
 * @author Pineda
 */
import java.util.*;
public class TestUsuario {
    public static void main(String[] args){
        
        Carro carro1=new Carro("Bocho", "Rosa",500.99, 111111,true);
        Usuario usuario1=new Usuario(1,744111564,"Jose",carro1,15);
        System.out.println(usuario1);
    }
}
