package Proyecto;
/**
 *
 * @author Pineda
 */
public class Empleado extends Persona{
    private String puesto,grupo;
    private int anio,aniosDeTrabajo,dias;
    private Double salario,sueldo;
    public Empleado(){
        super();
        
    }
    
    public Empleado(String puesto,String grupo,int anio,int aniosDeTrabajo,Double salario,int dias,
    int edad,String nombre,String apellidoM,String apellidoP,char sexo){
        super(edad, nombre, apellidoM, apellidoP,sexo);
        this.puesto=puesto;
        this.grupo=grupo;
        this.anio=anio;
        this.aniosDeTrabajo=aniosDeTrabajo;
        this.salario=salario;
        this.dias=dias;
    }
    
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAño(int anio) {
        this.anio = anio;
    }

    public int getAniosDeTrabajo() {
        return aniosDeTrabajo;
    }

    public void setAñosDeTrabajo(int aniosDeTrabajo) {
        this.aniosDeTrabajo = aniosDeTrabajo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public void setDias(int dias){
        this.dias=dias;
    }
    
    public int getDias(){
        return dias;
    }
    
    public Double getSueldo(){
        if(aniosDeTrabajo>7)
            sueldo=(salario+(salario*.25))*dias;
        else
            sueldo=salario*dias;
        return sueldo;
    }
    
    public String getDescripcion(){
        return "Nombre: "+super.getNombre()+" "+super.getApellidoP()+" "+super.getApellidoM()+
                "\nSexo:"+super.getSexo()+"\nEdad:"+super.getEdad()
                +"\nTiene el puesto "+puesto+" en el grupo "+anio+"-"+grupo+"\nLleva trabajando "+
                aniosDeTrabajo+" anios con un sueldo de "+sueldo;
    }
}
