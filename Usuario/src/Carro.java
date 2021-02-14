/**
 *
 * @author Pineda
 */
public class Carro {
    public String marca,color;
    public Double precio;
    public int matricula;
    public boolean cuero;
    public Carro(){
    }
    public Carro(String marca,String color,Double precio,int matricula,boolean cuero){
        this.marca=marca;
        this.precio=precio;
        this.matricula=matricula;
        this.cuero=cuero;
    }
    @Override
    public String toString(){
        if(cuero)
            return "\nLa marca es "+marca+"\nCon un color "+color+"\nSu precio fue de "+precio+"\nTiene la matricula "+matricula+"\nY tiene asientos de cuero";
        else
            return "\nLa marca es "+marca+"\nCon un color "+color+"\nSu precio fue de "+precio+"\nTiene la matricula "+matricula+"\nY no tiene asientos de cuero";
    }
}
