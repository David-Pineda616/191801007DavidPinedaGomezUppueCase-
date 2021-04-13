
package Concectar;

import java.sql.*;

/**
 *
 * @author Pineda
 */
public class Conetion {
    private String SQL;
    private static final String url="jdbc:mysql://localhost/secundaria",usuario="root",contrasenia="";
    private Connection conexion;
    public Conetion() throws SQLException {
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
    public void UpdateEstudiante(int edad,int materiasAprobadas,int materiasReprobadas,int creditos,int matricula )throws SQLException{
        SQL= "UPDATE estudiantes SET edad = ? , materiasAprobadas = ?, materiasReprobadas = ?, creditos = ? WHERE matricula = ?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        declaracion.setInt(1,edad);
        declaracion.setInt(2,materiasAprobadas);
        declaracion.setInt(3,materiasReprobadas);
        declaracion.setInt(4,creditos);
        declaracion.setInt(5,matricula); 
        declaracion.executeUpdate();
    }
    public void InsertEstudiante(int matricula,String nombre,String apellidoP,String apellidoM,
            int edad,int materiasAprobadas,int materiasReprobadas,int creditos) throws SQLException{
        SQL = "INSERT INTO estudiantes (matricula,nombre,apellidoP,apellidoM,edad,materiasAprobadas,materiasReprobadas,creditos) VALUES(?,?,?,?,?,?,?,?)";
        PreparedStatement declaracion= conexion.prepareStatement(SQL);
        declaracion.setInt(1,matricula);
        declaracion.setString(2,nombre);
        declaracion.setString(3,apellidoP);
        declaracion.setString(4,apellidoM);
        declaracion.setInt(5,edad);
        declaracion.setInt(6,materiasAprobadas);
        declaracion.setInt(7,materiasReprobadas);
        declaracion.setInt(8,creditos);
        declaracion.executeUpdate();
    }
    public void DeleteEstudiante(int matricula) throws SQLException{
        String SQL = "DELETE FROM estudiantes WHERE matricula = ?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        declaracion.setInt(1, matricula);
        declaracion.executeUpdate();
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void UpdateEmpleado(int añosTrabajando,Double salario,String puesto,int edad,int ID)throws SQLException{
        SQL= "UPDATE empleados SET edad = ?, puesto = ?, salario = ?,añosTrabajando = ? WHERE ID = ?";
        PreparedStatement declaracion= conexion.prepareStatement(SQL);
        declaracion.setInt(1, edad);
        declaracion.setString(2, puesto);
        declaracion.setDouble(3, salario);
        declaracion.setInt(4, añosTrabajando);
        declaracion.setInt(5, ID); 
        declaracion.executeUpdate();
    }
    public void InsertEmpleado(String nombre,String apellidoP,String apellidoM,
            int añosTrabajando,Double salario,String puesto,int edad,int ID) throws SQLException{
        SQL = "INSERT INTO empleados "
                + "(nombre,apellidoP,apellidoM,añosTrabajando,salario,puesto,edad,ID)"
                + "VALUES(?,?,?,?,?,?,?,?)";
        PreparedStatement declaracion= conexion.prepareStatement(SQL);
        declaracion.setString(1,nombre);
        declaracion.setString(2,apellidoP);
        declaracion.setString(3,apellidoM);
        declaracion.setInt(4, añosTrabajando);
        declaracion.setDouble(5,salario);
        declaracion.setString(6,puesto);
        declaracion.setInt(7,edad);
        declaracion.setInt(8,ID);
        declaracion.executeUpdate();
    }
    public void DeleteEmpleado(int ID) throws SQLException{
        String SQL = "DELETE FROM empleados WHERE ID = ?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        declaracion.setInt(1,ID);
        declaracion.executeUpdate();
    }
    
    

}
