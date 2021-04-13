
package Personal;

/**
 *
 * @author Pineda
 */
public class Empleado {
    
    private int ID,edad,salario,añosTrabajando;
    private String nombre,apellidoP,apellidoM,puesto;
    
    public Empleado(){
        
    }

    public Empleado(int ID,int edad,int salario,int añosTrabajando,String nombre,String apellidoP,String apellidoM,String puesto){
        
        this.ID=ID;
        this.edad=edad;
        this.salario=salario;
        this.añosTrabajando=añosTrabajando;
        this.nombre=nombre;
        this.apellidoM=apellidoM;
        this.apellidoP=apellidoP;
        this.puesto=puesto;
        
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getAñosTrabajando() {
        return añosTrabajando;
    }

    public void setAñosTrabajando(int añosTrabajando) {
        this.añosTrabajando = añosTrabajando;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    @Override
    public String toString(){
        return "";
    }
    
}
