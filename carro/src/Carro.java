/**
 *
 * @author Pineda
 */
public class Carro {
    
    public String color;
    public Double precio,peso;
    public int numeroDeAsientos;
    public boolean calefactor,asientosDePiel;
    public String Caracteristicas(){
        return "su color es "+color+ " con un precio de "+precio+" con "+numeroDeAsientos+" asientos";
    }
    @Override
    public String toString(){
        return Caracteristicas();
    }
}
