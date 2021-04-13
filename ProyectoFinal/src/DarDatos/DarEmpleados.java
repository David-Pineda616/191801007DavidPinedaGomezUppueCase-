
package DarDatos;

import java.sql.*;
import java.util.*;
import Personal.Empleado;
import Conexion.Conecctar;

/**
 *
 * @author Pineda
 */
public class DarEmpleados {
    private static String SQL = "jdbc:mysql://localhost/secundaria";
    public static List <Empleado> listaempleado() throws SQLException{
        List <Empleado> listaUsuarios = new ArrayList<>();
        Connection conexion = Conecctar.getConnection();
        Statement declaracion= conexion.createStatement();
        SQL = "SELECT * FROM empleados";
        ResultSet resultado = declaracion.executeQuery(SQL);
        while (resultado.next()){
            Empleado empleado = new Empleado();
            listaUsuarios.add(empleado);
        }
        Conecctar.Close(conexion, declaracion, resultado);
        return listaUsuarios;
    }
    
    public static void insertar(Empleado empleado) throws SQLException{
        Connection conexion = Conecctar.getConnection();
        SQL = "INSERT INTO empleados "
                + "(nombre,apellidoP,apellidoM,añosTrabajando,salario,puesto,edad,ID)"
                + "VALUES(?,?,?,?,?,?,?,?)";
        PreparedStatement declaracion= conexion.prepareStatement(SQL);
        declaracion.setString(1, empleado.getNombre());
        declaracion.setString(2, empleado.getApellidoP());
        declaracion.setString(3, empleado.getApellidoM());
        declaracion.setInt(4, empleado.getAñosTrabajando());
        declaracion.setInt(5, empleado.getSalario());
        declaracion.setString(6, empleado.getPuesto());
        declaracion.setInt(7, empleado.getEdad());
        declaracion.setInt(8, empleado.getID());
        declaracion.executeUpdate();
        Conecctar.Close(conexion, declaracion);
    }
    
    public static void eliminar(Empleado empleado) throws SQLException{
         Connection conexion = Conecctar.getConnection();
         SQL= "DELETE FROM empleadoss WHERE ID = ?";
         PreparedStatement declaracion= conexion.prepareStatement(SQL);
         declaracion.setInt(1, empleado.getID()); 
         declaracion.executeUpdate();
         Conecctar.Close(conexion, declaracion);
    }
    
    public static void modificar(Empleado empleado) throws SQLException{
        Connection conexion = Conecctar.getConnection();
        SQL= "UPDATE empleados SET edad = ?, puesto = ?, salario = ?,añosTrabajando = ? WHERE ID = ?";
        PreparedStatement declaracion= conexion.prepareStatement(SQL);
        declaracion.setInt(1, empleado.getEdad());
        declaracion.setString(2, empleado.getPuesto());
        declaracion.setInt(3, empleado.getSalario());
        declaracion.setInt(4, empleado.getAñosTrabajando());
        declaracion.setInt(5, empleado.getID()); 
        declaracion.executeUpdate();
        Conecctar.Close(conexion, declaracion);
    }
}
