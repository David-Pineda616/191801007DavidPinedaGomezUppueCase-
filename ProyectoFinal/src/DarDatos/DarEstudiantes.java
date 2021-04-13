package DarDatos;

import java.sql.*;
import java.util.*;
import Personal.Estudiante;
import Conexion.Conecctar;

/**
 *
 * @author Pineda
 */
public class DarEstudiantes {
    private static String SQL = "jdbc:mysql://localhost/secundaria";
    public static List <Estudiante> listaestudiante() throws SQLException{
        List <Estudiante> listaestudiante = new ArrayList<>();
        Connection conexion = Conecctar.getConnection();
        Statement declaracion= conexion.createStatement();
        SQL = "SELECT * FROM estudiantes";
        ResultSet resultado = declaracion.executeQuery(SQL);
        while (resultado.next()){
            Estudiante estudiante = new Estudiante();
            listaestudiante.add(estudiante);
        }
        Conecctar.Close(conexion, declaracion, resultado);
        return listaestudiante;
    }
    
    public static void insertar(Estudiante estudiante) throws SQLException{
        Connection conexion = Conecctar.getConnection();
        SQL = "INSERT INTO estudiantes "
                + "(matricula,nombre,apellidoP,apellidoM,edad,materiasAprobadas,materiasReprobadas,creditos)"
                + "VALUES(?,?,?,?,?,?,?,?)";
        PreparedStatement declaracion= conexion.prepareStatement(SQL);
        declaracion.setInt(1,estudiante.getMatricula());
        declaracion.setString(2, estudiante.getNombre());
        declaracion.setString(3, estudiante.getApellidoP());
        declaracion.setString(4, estudiante.getApellidoM());
        declaracion.setInt(5, estudiante.getEdad());
        declaracion.setInt(6, estudiante.getMateriasAprobadas());
        declaracion.setInt(7, estudiante.getMateriasReprobadas());
        declaracion.setInt(8, estudiante.getCreditos());
        declaracion.executeUpdate();
        Conecctar.Close(conexion, declaracion);
    }
    
    public static void eliminar(Estudiante estudiante) throws SQLException{
         Connection conexion = Conecctar.getConnection();
         SQL= "DELETE FROM estudiantes WHERE id = ?";
         PreparedStatement declaracion= conexion.prepareStatement(SQL);
         declaracion.setInt(1, estudiante.getMatricula()); 
         declaracion.executeUpdate();
         Conecctar.Close(conexion, declaracion);
    }
    
    public static void modificar(Estudiante estudiante) throws SQLException{
        Connection conexion = Conecctar.getConnection();
        SQL= "UPDATE estudiantes SET edad = ? ,materiasAprobadas = ?,materiasReprobadas = ?,creditos = ? WHERE matricula = ?";
        PreparedStatement declaracion= conexion.prepareStatement(SQL);
        declaracion.setInt(1, estudiante.getEdad());
        declaracion.setInt(2, estudiante.getMateriasAprobadas());
        declaracion.setInt(3, estudiante.getMateriasReprobadas());
        declaracion.setInt(4, estudiante.getCreditos());
        declaracion.setInt(5, estudiante.getMatricula()); 
        declaracion.executeUpdate();
        Conecctar.Close(conexion, declaracion);
    }
}
