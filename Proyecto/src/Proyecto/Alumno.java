package Proyecto;

/**
 *
 * @author Pineda
 */
public class Alumno extends Persona{
    
    private int anio,materiasReprobadas,materiasAprobadas,matricula;
    
    public Alumno(){
        super();
    }
    
    public Alumno(int anio,int materiasReprobadas,int materiasAprobadas,int matricula,
            int edad,String nombre,String apellidoM,String apellidoP,String sexo){
        super(edad,nombre,apellidoM,apellidoP,sexo);
        this.anio=anio;
        this.materiasAprobadas=materiasAprobadas;
        this.materiasReprobadas=materiasReprobadas;
        this.matricula=matricula;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMateriasReprobadas() {
        return materiasReprobadas;
    }

    public void setMateriasReprobadas(int materiasReprobadas) {
        this.materiasReprobadas = materiasReprobadas;
    }

    public int getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(int materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    @Override
    public String toString(){
        return "Nombre: "+super.getNombre()+" "+super.getApellidoP()+" "+super.getApellidoM()
                +"\nEdad:"+super.getEdad()+"\nSexo"+super.getSexo()+"\nMatricula: "+matricula
                +"\nTiene "+materiasAprobadas+" materias aprobadas y "+materiasReprobadas+" materias reprobadas"
                ;
    }
}
