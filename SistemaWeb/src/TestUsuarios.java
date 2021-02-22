/**
 *
 * @author Pineda
 */
public class TestUsuarios {
    public static void main(String[] args){
        Usuarios usuario1=new Usuarios("corre@correo.com","Alberth","123456",11111);
        System.out.println(usuario1);
        usuario1.setId(999999);
        System.out.println(usuario1);
    }
}
