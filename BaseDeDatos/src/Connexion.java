
import java.sql.*;

/**
 *
 * @author Pineda
 */
public class Connexion {
    public static void main(String[] args) {
        
        try{
            //crear conexion con base de datos
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/usuario","root","");
            //crear una declaracion de como se va a trabajar en la base de datos
            Statement declaracion=conexion.createStatement();
            String SQL="SELECT * FROM usuario";
            //Variable que recibirá el resultado de ejecutar la secuenta SQL
            ResultSet resultado=declaracion.executeQuery(SQL);
           
            //imprimir valores
            while(resultado.next())
            {   //System.out.println(resultado.getString("id"));
                System.out.println(resultado.getInt("id"));
                System.out.println(resultado.getString("nombre"));
                System.out.println(resultado.getString("contrasena"));
                System.out.println(resultado.getString("status"));
                System.out.println(resultado.getInt("edad"));
                System.out.println("\n\n");
                //System.out.println(resultado.getInt("id_usuario"));
            }
            resultado.close();
            declaracion.close();
            conexion.close();
            
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }
}
