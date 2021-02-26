package Proyecto;
import java.util.*;
/**
 *
 * @author Pineda
 */
public class Escuela {
    public static void main(String[] args){
        Scanner scanf=new Scanner(System.in);
        ArrayList <Empleado> empleados=new ArrayList();
        ArrayList <Alumno> alumnos=new ArrayList();
        int opcion;
        
        /////////////Herencia
        
        String nombre="",apellidoM="",apellidoP="";
        String sexo="";
        int edad=0;
        
        ////////////Clases
        String texto1,texto2;
        int entero1,entero2,entero3,entero4,opciona;
        Double doble1;
        /////Codigo
        boolean salir=true;
        do{
            System.out.println("1.-Agregar alumno");
            System.out.println("2.-Agregar empleado");
            System.out.println("3.-Mostrar alumnos");
            System.out.println("4.-Mostrar empleados");
            System.out.println("5.-Salir");
            opcion=scanf.nextInt();
            if(opcion==1||opcion==2){
                System.out.print("Ingresa el nombre ");
                scanf.nextLine();
                nombre=scanf.nextLine();
                System.out.print("Ingresa el apellido paterno ");
                
                apellidoP=scanf.nextLine();
                System.out.print("Ingresa el apellido marterno ");
                
                apellidoM=scanf.nextLine();
                 do{
                    System.out.print("1.-Hombre\n2.-Mujer\n3.-Personalizado\n     :");
                    opciona=scanf.nextInt();
                    switch(opciona){
                        case 1:
                            sexo="Hombre";
                            break;
                        case 2:
                            sexo="Mujer";
                            break;
                        case 3:
                            scanf.nextLine();
                            System.out.println("Ingresa el sexo ");
                            sexo=scanf.nextLine();
                            break;
                        }
                    }while(opciona>3||opciona<1);
                    System.out.println("Ingresa la edad");
                    edad=scanf.nextInt();
            }
            switch(opcion){
                case 1:
                    //anio,materiasReprobadas,materiasAprobadas,matricula;
                    System.out.print("Ingresa el anio que se encuentra ");
                    entero1=scanf.nextInt();
                    System.out.print("Ingresa el numeor de materias reprobadas ");
                    entero2=scanf.nextInt();
                    System.out.print("Ingresa el numero de materias aprobadas ");
                    entero3=scanf.nextInt();
                    System.out.print("ingresa su matricula ");
                    entero4=scanf.nextInt();
                    Alumno alumno=new Alumno(entero1,entero2,entero3,entero4,edad,nombre,apellidoM,apellidoP,sexo);
                    alumnos.add(alumno);
                    break;
                case 2:
                    ///String puesto,grupo---int anio,aniosDeTrabajo,dias---Double salario,sueldo
                    System.out.print("Ingresa el anio de su aula ");
                    entero1=scanf.nextInt();
                    System.out.print("Ingresa la aula ");
                    scanf.nextLine();
                    texto2=scanf.nextLine();
                    System.out.print("Ingresa los anios que lleva de trabajo ");
                    entero2=scanf.nextInt();
                    System.out.print("Ingresa el puesto que tiene ");
                    scanf.nextLine();
                    texto1=scanf.nextLine();
                    System.out.print("Ingresa el salario que tiene al dia ");
                    doble1=scanf.nextDouble();
                    Empleado empleado=new Empleado(texto1,texto2,entero1,entero2,doble1,30,edad,nombre,apellidoM,apellidoP,sexo);
                    empleado.getSueldo();
                    empleados.add(empleado);
                    break;
                case 3:
                    
                    for(Alumno aalumno:alumnos){
                        System.out.println("-----------------------------------");
                        System.out.println(aalumno);
                        System.out.println("-----------------------------------");
                    }

                    break;
                case 4:
                    
                    for(Empleado eempleado:empleados){
                        System.out.println("-----------------------------------");
                        System.out.println(eempleado);
                        System.out.println("-----------------------------------");
                    }
                    
                    break;
                case 5:
                    salir=false;
                    break;
            }
            
        }while(salir);
    }
}
