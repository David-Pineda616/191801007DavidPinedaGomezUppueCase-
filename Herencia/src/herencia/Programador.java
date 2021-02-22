package herencia;

/**
 *
 * @author Pineda
 */
public class Programador extends Empleado{
    private Double sueldo;
    public Programador(){
        super();
    }
    public Programador(Double sueldo){
        super(1, "", "", "");
        this.sueldo=sueldo;
    }
}
