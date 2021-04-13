
package Conexion;

import java.sql.*;


/**
 *
 * @author Pineda
 */
public class Conecctar {
    private static final String URL= "jdbc:mysql://localhost/secundaria";
    private static final String USUARIO= "root", CONTRASENA= "";
    
    public static Connection getConnection()throws SQLException, SQLException, SQLException{
        return DriverManager.getConnection(URL,USUARIO,CONTRASENA); 
    }
    
    public void close(Connection conexion) throws SQLException{
        conexion.close();
    }
    
    public void close(Statement declaracion) throws SQLException{
        declaracion.close();
    }
    public void close(ResultSet resultado) throws SQLException{
        resultado.close();
    }
    public void Close(Connection conexion, Statement declaracion, ResultSet resultado)throws SQLException{
        resultado.close();
        declaracion.close();
        conexion.close();
    }
    public void Close(Statement declaracion, ResultSet resultado)throws SQLException{
        resultado.close();
        declaracion.close();
    }
    public void Close(Connection conexion, Statement declaracion)throws SQLException{
        conexion.close();
        declaracion.close();
    }
    
    ///////////////////////////////////
    
}
