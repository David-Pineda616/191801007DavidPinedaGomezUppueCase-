package Frame;
import java.awt.*;
import java.awt.font.*;
import java.text.*;
import javax.swing.*;
/**
 *
 * @author Pineda
 */
public class Diseño extends JFrame{
    public Diseño(){
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Image miImage = miPantalla.createImage("img\\logo.png");
        Dimension dimencionPantalla = miPantalla.getScreenSize();
        int dimencion1 = dimencionPantalla.height;
        int dimencion2 = dimencionPantalla.width;
        setBounds(dimencion2/4,dimencion1/4,dimencion2/2,dimencion1/2);
        setIconImage(miImage);
        setTitle("Base de Datos Albaro Obregon");
        setResizable(false);
       
        Lamina1 lam = new Lamina1();
        add(lam);
    }
    
    
    /*//////////////////////////////////
     public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_RENDERING,
        RenderingHints.VALUE_RENDER_QUALITY);
        g2.setColor(Color.DARK_GRAY);
        String texto = "ALBARO OBREGON";
// AttributedString
        AttributedString ast = new AttributedString (texto);
        Font f = new Font("Arial", Font.ITALIC,30);
        ast.addAttribute(TextAttribute.FONT,f,0,texto.length());
        AttributedCharacterIterator it = ast.getIterator();
        FontRenderContext frc = g2.getFontRenderContext();
        TextLayout tl = new TextLayout(it,frc);
        tl.draw(g2,110,40);
  
 
    }
    
    
    
    ///////////////////////////*/
}
