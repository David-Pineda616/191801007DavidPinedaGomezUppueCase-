
import Proyecto.Alumno;
import Proyecto.Empleado;

/**
 *
 * @author Pineda
 */
public class Prueba1 {
    public static void main (String[] args){
    Empleado e1=new Empleado();
    Alumno a1=new Alumno();
    e1.getDescripcion();
    System.out.println(e1.getDescripcion());
    System.out.println("----------------------------");
    System.out.println(a1.getDescripcion());
   
}
}
