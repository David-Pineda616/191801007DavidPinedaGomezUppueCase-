package Proyecto;
import java.util.*;
/**
 *
 * @author Pineda
 */
public class Escuela {
    public static void main(){
        Scanner scanf=new Scanner(System.in);
        ArrayList <Empleado> empleados=new ArrayList();
        ArrayList <Alumno> alumnos=new ArrayList();
        int opcion;
        
        /////////////Herencia
        
        String nombre,apellidoM,apellidoP;
        char sexo;
        int edad;
        
        ////////////Clases
        String caracter;
        int entero1,entero2,entero3,entero4;
        Double doble1,doble2;
   
        boolean salir=true;
        do{
            System.out.println("1.-Agregar alumno");
            System.out.println("2.-Agregar empleado");
            System.out.println("3.-Mostrar alumnos");
            System.out.println("4.-Mostrar empleados");
            System.out.println("5.-Salir");
            opcion=scanf.nextInt();
            switch(opcion){
                case 1:
                    System.out.print("Ingresa el nombre ");
                    nombre=scanf.nextLine();
                    System.out.print("Ingresa el apellido paterno ");
                    apellidoP=scanf.nextLine();
                    System.out.print("Ingresa el apellido marterno ");
                    apellidoM=scanf.nextLine();
                    do{
                        System.out.print("1.-Hombre\n2.-Mujer");
                        
                        caracter=scanf.nextLine();
                    }while(salir);
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    salir=false;
                    break;
            }
            
        }while(salir);
    }
}
