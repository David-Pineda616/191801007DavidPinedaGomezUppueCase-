package herencia;
/**
 *
 * @author Pineda
 */
public class Empleado {
    private int dni;
    private String apellidop,apellidom,nombre;
    public Empleado(){
        
    }
    public Empleado(int dni,String apellidop,String apellidom,String nombre){
        this.dni=dni;
        this.apellidop=apellidop;
        this.apellidom=apellidom;
        this.nombre=nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public String getApellidom() {
        return apellidom;
    }

    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString(){
        return "";
    }
}
