import java.util.Scanner;
public class CicloFor {
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingresa la serie ");
        int serie=scanner.nextInt();
        for(int i=0;i<serie;i++)
            System.out.println(i);
        int i=serie;
        while(i>=0){
            System.out.println(i);
            i--;
        }
        
    }
}
