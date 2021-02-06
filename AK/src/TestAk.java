
import javax.swing.JOptionPane;

/**
 *
 * @author Pineda
 */
public class TestAk {
    public static void main(String[] args){
        //Crear un obeto (Instanciar)
        Ak cobre=new Ak();
        Ak diamante=new Ak();
        cobre.material="cobre";
        cobre.disponibilidad="Alta";
        cobre.municion=5;
        cobre.precio=10.0;
        cobre.velocidadDisparo=10.5;
        cobre.danio=5.0;
        
        diamante.material="diamante";
        diamante.disponibilidad="baja";
        diamante.municion=20;
        diamante.precio=12000.0;
        diamante.velocidadDisparo=13.0;
        diamante.danio=15.0;
        
        //System.out.println(cobre.MostrarCaracteristica());
        
        //System.out.println("\n\n\n"+diamante.MostrarCaracteristica());
        JOptionPane.showMessageDialog(null,diamante);
        JOptionPane.showMessageDialog(null,cobre);
        
    }
}
