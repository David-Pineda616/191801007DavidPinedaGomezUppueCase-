/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;


import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;


/**
 *
 * @author Pineda
 */
public class Lamina1 extends JPanel {
    private Image imagen;
    /*
    public Lamina1(){
        setLayout(new BorderLayout());
       
        add(new JButton("EMPLEADO"),BorderLayout.WEST);
        add(new JButton("ALUMNO"),BorderLayout.EAST);
        
}
*/
    public void paintComponent(Graphics g){
	File miimagen = new File("img\\logo.png");
        try{
	imagen=ImageIO.read(miimagen);
        }
        catch(IOException e){
            System.out.println("Sin imagen");
        }
        g.drawImage(imagen,100, 100, null);
    }

}
