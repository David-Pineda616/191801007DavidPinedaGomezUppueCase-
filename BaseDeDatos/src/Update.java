
import java.sql.*;
import java.util.*;

/**
 *
 * @author Pineda
 */
public class Update {
    public static void main(String args[]){
        
        try{
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/usuario","root","");
            String SQL = "UPDATE usuario SET nombre = ?, contrasena = ?, status = ?, edad = ? WHERE id = ?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            Scanner scan = new Scanner(System.in);
            System.out.println("Ingrese el id del usuario a actulizar:");
            int id = scan.nextInt();
            scan.nextLine();
            System.out.println("Actualice el nombre del Usuario:");
            String nombre = scan.nextLine();
            System.out.println("Actualice la contraseña:");
            String contraseña = scan.nextLine();
            System.out.println("Actualice el estado:");
            String status = scan.nextLine();
            System.out.println("Actualice la edad");
            int edad=scan.nextInt();
            declaracion.setString(1, nombre);
            declaracion.setString(2, contraseña);
            declaracion.setString(3,status);
            declaracion.setInt(4, edad);
            declaracion.setInt(5, id);
            declaracion.executeUpdate();          
            declaracion.close();
            conexion.close();
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }
}
