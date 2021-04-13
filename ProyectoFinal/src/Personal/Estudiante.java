package Personal;
/**
 *
 * @author Pineda
 */
public class Estudiante {
    private int matricula,edad,materiasAprobadas,materiasReprobadas,creditos;
    private String nombre,apellidoP,apellidoM;
    
    public Estudiante(){
        
    }
    
    public Estudiante(int matricula,int edad,int materiasAprobadas,int materiasReprobadas,int creditos,String nombre,String apellidoP,String apellidoM){
        this.matricula=matricula;
        this.edad=edad;
        this.materiasAprobadas=materiasAprobadas;
        this.materiasReprobadas=materiasReprobadas;
        this.creditos=creditos;
        this.nombre=nombre;
        this.apellidoP=apellidoP;
        this.apellidoM=apellidoM;
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(int materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public int getMateriasReprobadas() {
        return materiasReprobadas;
    }

    public void setMateriasReprobadas(int materiasReprobadas) {
        this.materiasReprobadas = materiasReprobadas;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
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
    
    @Override
    
    public String toString(){
        return "";
    }
}
