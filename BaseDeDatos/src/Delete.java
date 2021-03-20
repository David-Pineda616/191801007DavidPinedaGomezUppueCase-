
import java.sql.*;
import java.util.*;

/**
 *
 * @author Pineda
 */
public class Delete {
    public static void main(String args[]){
        
        try{
            //crear conexion con BD
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/usuario","root","");
            //crear una declaracion de como se va a trabajar con la BD
            String SQL = "DELETE FROM usuario WHERE id = ?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            Scanner scan = new Scanner(System.in);
            System.out.println("Ingrese el id del usuario a eliminar:");
            int id = scan.nextInt();
            
            declaracion.setInt(1, id);
            declaracion.executeUpdate();
            System.out.println("id eliminado");
            
            //cerrar toda conexion con la BD
            
            declaracion.close();
            conexion.close();
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }
}
