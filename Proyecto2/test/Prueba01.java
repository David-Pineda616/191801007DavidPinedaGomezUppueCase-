/**
 *
 * @author Pineda
 */
import Concectar.Conetion;
import java.sql.SQLException;
public class Prueba01 {
    public static void main(String[] args) throws SQLException{
        Conetion add =new Conetion();
        /*
        add.UpdateEstudiante(21, 10, 2,9999, 191801007);
        add.close(add.getConnection());
        */
        add.DeleteEmpleado(191801007);
    }
}
