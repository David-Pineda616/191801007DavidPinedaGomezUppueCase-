public class Ak {
    //Atrubutos
    public String material,disponibilidad;
    public int municion;
    public Double danio,precio,velocidadDisparo;
    //Metodos
    public String MostrarCaracteristica(){
        return "La arma es de "+material+" con una disponibilidad "+disponibilidad+"\ncon "+municion+" municiones"
                +" con danio de "+danio+" y un precio de "+precio+"\ncon una velocidad de disparo de "+velocidadDisparo;
    }
    @Override
    public String toString(){
        return MostrarCaracteristica();
        
    }
}
