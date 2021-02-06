
import javax.swing.JOptionPane;

/**
 *
 * @author Pineda
 */
import java.util.Scanner;
public class TestMateria {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String nombreMateria,nombreCarrera;
        nombreMateria=JOptionPane.showInputDialog("Ingresa el nombre de la materia ");
        nombreCarrera=JOptionPane.showInputDialog("Ingresa el nombre de la carrera ");
        int creditosMateria,codigoMateria,cuatrimestre;
        System.out.print("Ingresa los creditos de esta materia ");
        creditosMateria=scanner.nextInt();
        System.out.print("Ingresa el codigo de esta materia ");
        codigoMateria=scanner.nextInt();
        System.out.print("Ingresa el cuatrimestre que se cuersa esta materia ");
        cuatrimestre=scanner.nextInt();
        Materia materia1=new Materia("Fundamentos de la programacion", "Tecnologias de la informacion", 5, 1991, 1);
        Materia materia2=new Materia("Quimica", "Tecnologias de la informacion", 10, 1931, 2);
        Materia materia3=new Materia("Matematicas", "Tecnologias de la informacion", 2, 1291, 5);
        Materia materia4=new Materia(nombreMateria,nombreCarrera,creditosMateria,codigoMateria,cuatrimestre);
        System.out.println("--------------------");
        System.out.println(materia1);
        System.out.println("--------------------");
        System.out.println(materia2);
        System.out.println("--------------------");
        System.out.println(materia3);
        System.out.println("--------------------");
        System.out.println(materia4);
    }
}
