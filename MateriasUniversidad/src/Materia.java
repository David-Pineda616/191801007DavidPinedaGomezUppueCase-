/**
 *
 * @author Pineda
 */
public class Materia {
    public String nombreMateria,carreraMateria;
    public int creditosMateria,codigoMateria,cuatrimestre;
    public Materia(){
        
    }
    public Materia(String nombreMateria,String carreraMateria,int creditosMateria,int codigomateria,int cuatrimestre){
        this.cuatrimestre=cuatrimestre;
        this.codigoMateria=codigoMateria;
        this.creditosMateria=creditosMateria;
        this.carreraMateria=carreraMateria;
        this.nombreMateria=nombreMateria;
    }
    @Override
    public String toString(){
        return "La materia de "+nombreMateria+" se cursa en el cuatrimestre "+cuatrimestre+
                "\nen la carrera de "+carreraMateria+ " con un codigo de "
                +codigoMateria+"\ncon un valor de "+creditosMateria+" creditos";
    }
}
