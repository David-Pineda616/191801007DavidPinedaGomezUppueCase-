package Pruebas;


import Conexion.Conecctar;
import DarDatos.DarEmpleados;
import DarDatos.DarEstudiantes;
import Personal.Empleado;
import Personal.Estudiante;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author Pineda
 */
public class Prueba01 {
    public static void main(String[] args ) throws SQLException{
        Conecctar cone = new Conecctar();
        cone.getConnection();
    }
    
}
