
import java.sql.*;
import java.util.*;

/**
 *
 * @author Pineda
 */
public class Insertar {
    public static void main(String args[]){
        
        try{
            //crear conexion con BD
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/usuario","root","");
            //crear una declaracion de como se jva a trabajar con la BD
            String SQL = "INSERT INTO usuario(id,nombre,contrasena,status,fecha,edad) VALUES (?,?,?,?,?,?)";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            System.out.println("Ingrese el nombre del Usuario:");
            Scanner scan = new Scanner(System.in);
            String nombre = scan.nextLine();
            System.out.println("Ingrese la contraseña:");
            String contraseña = scan.nextLine();
            System.out.println("Ingrese el status");
            String status=scan.nextLine();
            System.out.println("Ingrese la edad");
            int edad=scan.nextInt();
            System.out.println("Ingrese el ID");
            int id=scan.nextInt();
            declaracion.setInt(1,id);
            declaracion.setString(2, nombre);
            declaracion.setString(3, contraseña);
            declaracion.setString(4,status);
            declaracion.setDate(5,null);
            declaracion.setInt(6,edad);
            declaracion.executeUpdate();
            
            
            //cerrar toda conexion con la BD
            
            declaracion.close();
            conexion.close();
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }
}
