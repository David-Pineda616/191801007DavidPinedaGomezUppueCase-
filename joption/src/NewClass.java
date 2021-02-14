
import javax.swing.JOptionPane;

/**
 *
 * @author Pineda
 */
public class NewClass {
    public static void main(String[] args){
        String frase1,frase2;
        //Leer String
        frase1=JOptionPane.showInputDialog("Ingresa una palabra");
        frase2=JOptionPane.showInputDialog("Ingresa otra palabra");
        //Mostrar lo que sea
        JOptionPane.showMessageDialog(null, "La palabra 1 es "+frase1);
        JOptionPane.showMessageDialog(null, "La palabra 2 es "+frase2);
    }
}
