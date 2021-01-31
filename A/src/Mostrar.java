import java.awt.Graphics;
import javax.swing.JPanel;
/**
 *
 * @author Pineda
 */
public class Mostrar extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("A",250,150);
    }
}
