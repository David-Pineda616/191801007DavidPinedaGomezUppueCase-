package DaUsuarios;
import Conexion.*;
import java.sql.Connection;
import java.util.Date;
import java.util.Scanner;
import java.sql.SQLException;

/**
 *
 * @author Pineda
 */
public class Funciones {
    public static void main(String[] args) throws SQLException{
        Scanner scanner =new Scanner(System.in);
        Coneccion conectar = new Coneccion();
        boolean salir=true;
        String nombre,contrasenia,status;
        int edad,id;
        
        
        do{
            System.out.print("1.-Actualizar datos\n2.-Insertar nuevo usuario\n3.-Eliminar usuario\n4.-Salir");
            System.out.println("  :");
            int opcion=scanner.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el id del usuario a actulizar:");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Actualice el nombre del Usuario:");
                    nombre = scanner.nextLine();
                    System.out.println("Actualice la contraseña:");
                    contrasenia = scanner.nextLine();
                    System.out.println("Actualice el estado:");
                    status = scanner.nextLine();
                    System.out.println("Actualice la edad");
                    edad=scanner.nextInt();
                    conectar.Update(nombre, contrasenia, status, edad, id);
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Ingrese el nombre del Usuario:");
                    nombre = scanner.nextLine();
                    System.out.println("Ingrese la contraseña:");
                    contrasenia= scanner.nextLine();
                    System.out.println("Ingrese el status");
                    status=scanner.nextLine();
                    System.out.println("Ingrese la edad");
                    edad=scanner.nextInt();
                    System.out.println("Ingrese el ID");
                    id=scanner.nextInt();
                    conectar.Insert(id, nombre, contrasenia, status, edad);
                    break;
                case 3: 
                    System.out.println("Ingrese el id del usuario a eliminar:");
                    id = scanner.nextInt();
                    conectar.Delete(id);
                    break;
                case 4:
                    salir=false;
                    conectar.close(conectar.getConnection());
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion invalidad");
            }
        }while(salir);
    }

}
