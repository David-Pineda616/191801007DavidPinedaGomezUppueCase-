/**
 *
 * @author Pineda
 */
public class Usuario {
    public int dni,telefono;
    public String nombre;
    public int edad;
    Carro carro=new Carro();
    public Usuario(int dni,int telefono,String nombre,Carro carro,int edad){
        this.dni=dni;
        this.telefono=telefono;
        this.nombre=nombre;
        this.carro=carro;
        this.edad=edad;
    }
    public Usuario(){
        
    }
    @Override
    public String toString(){
        return "El usuario de nombre "+dni+" con el nombre "+nombre+" y numero de telefono "+telefono+" tiene un carro con los datos "+carro;
    }
}
