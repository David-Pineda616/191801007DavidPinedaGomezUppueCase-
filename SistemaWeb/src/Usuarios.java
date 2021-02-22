/**
 *
 * @author Pineda
 */
public class Usuarios {
    private int id;
    private String correo,usuario,contrasenia;
    public Usuarios(){
        
    }
    public Usuarios(String correo,String usuario,String contrasenia,int id){
        this.id=id;
        this.correo=correo;
        this.usuario=usuario;
        this.contrasenia=contrasenia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    @Override
    public String toString(){
        return "El usurio de nombre "+usuario+" tiene un ID :"+id+" y su correo es "+correo;
    }
}
