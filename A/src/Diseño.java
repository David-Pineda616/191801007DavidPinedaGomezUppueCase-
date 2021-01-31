import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
/**
 *
 * @author Pineda
 */
public class Diseño extends JFrame {
    public Diseño(){
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Image miImagen=miPantalla.getImage("a.png");
        Dimension dimenciones=miPantalla.getScreenSize();
        int altura=dimenciones.height;
        int largo=dimenciones.width;
        setBounds(largo/4,altura/4,largo/2,altura/2);
        setIconImage(miImagen);
        setTitle("A");
        setResizable(false);
        Mostrar lamina=new Mostrar();
        add(lamina);
        
    }
}
