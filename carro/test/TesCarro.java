/**
 *
 * @author Pineda
 */
public class TesCarro {
    public static void main(String[] args){ 
        Carro carro1 =new Carro();
        carro1.asientosDePiel=true;
        carro1.calefactor=false;
        carro1.color="Blue";
        carro1.numeroDeAsientos=5;
        carro1.peso=200.0;
        carro1.precio=50000.0;
        System.out.println(carro1);
        Carro carro2 =new Carro();
        carro2.asientosDePiel=true;
        carro2.calefactor=true;
        carro2.color="red";
        carro2.numeroDeAsientos=2;
        carro2.peso=100.0;
        carro2.precio=5000.0;
        System.out.println(carro2);
    }
}
