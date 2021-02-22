package Proyecto;
/**
 *
 * @author Pineda
 */
public abstract class Persona {
    private int edad;
    private String nombre,apellidoM,apellidoP;
    private char sexo;
    public Persona(){
        
    }
    public Persona(int edad,String nombre,String apellidoM,String apellidoP,char sexo){
        this.edad=edad;
        this.nombre=nombre;
        this.apellidoM=apellidoM;
        this.apellidoP=apellidoP;
        this.sexo=sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public abstract String getDescripcion();
}
