import Frame.Diseño;
import javax.swing.JFrame;

/**
 *
 * @author Pineda
 */
public class PruebaFrame {
    public static void main(String[] args){
        Diseño pantalla = new Diseño();
        pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        pantalla.setVisible(true);
    }
}
