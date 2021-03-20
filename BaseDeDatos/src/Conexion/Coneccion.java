
package Conexion;

import java.sql.*;
import java.util.Date;
/**
 *
 * @author Pineda
 */
public class Coneccion {
    
    private static final String url="jdbc:mysql://localhost/usuario",usuario="root",contrasenia="";
	Connection conexion;
    public Coneccion() throws SQLException {
        this.conexion = DriverManager.getConnection(url,usuario,contrasenia);
        
    }
    public Connection getConnection() throws SQLException{

	return DriverManager.getConnection(url,usuario,contrasenia);
    }
    public void close(Connection conex) throws SQLException{
	conex.close();
    }
    public void close(Connection conexion,ResultSet resultado,Statement declaracion )throws SQLException{
	conexion.close();
	resultado.close();
	declaracion.close();
    }
    public void Update(String nombre,String contrasenia,String status,int edad,int id)throws SQLException{
        String SQL = "UPDATE usuario SET nombre = ?, contrasena = ?, status = ?, edad = ? WHERE id = ?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        declaracion.setString(1, nombre);
        declaracion.setString(2, contrasenia);
        declaracion.setString(3,status);
        declaracion.setInt(4, edad);
        declaracion.setInt(5, id);
        declaracion.executeUpdate(); 
    }
    public void Insert(int id,String nombre,String contrasenia,String status,int edad) throws SQLException{
        String SQL = "INSERT INTO usuario(id,nombre,contrasena,status,fecha,edad) VALUES (?,?,?,?,?,?)";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        declaracion.setInt(1,id);
        declaracion.setString(2, nombre);
        declaracion.setString(3, contrasenia);
        declaracion.setString(4,status);
        declaracion.setDate(5,null);
        declaracion.setInt(6,edad);
        declaracion.executeUpdate();
    }
    public void Delete(int id) throws SQLException{
        String SQL = "DELETE FROM usuario WHERE id = ?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        declaracion.setInt(1, id);
        declaracion.executeUpdate();
    }
    
}
