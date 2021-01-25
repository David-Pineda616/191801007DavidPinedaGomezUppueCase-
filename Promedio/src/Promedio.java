import java.util.Scanner;
public class Promedio {
    public static void main(String[] args){
        Double[] calificaciones=new Double[3];
        int i;
        Double promedio=0.0;
        Scanner s=new Scanner(System.in);
        for(i=0;i<calificaciones.length;i++){
            System.out.print("Ingresa la calificacion del alumno "+i+" ");
            calificaciones[i]=s.nextDouble();
        }
        for(i=0;i<calificaciones.length;i++)
            promedio+=calificaciones[i];
        System.out.println("El promedio general es de "+(promedio/3));
        
    }
}
