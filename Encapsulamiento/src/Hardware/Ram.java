
package Hardware;

/**
 *
 * @author Pineda
 */
public class Ram {
    private int capacidad,velocidad;
    private String modelo;
    public Ram(){
        
    }
    public Ram(int capacidad,int velocidad,String modelo){
        this.capacidad=capacidad;
        this.velocidad=velocidad;
        this.modelo=modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
