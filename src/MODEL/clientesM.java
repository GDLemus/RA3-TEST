
package MODEL;

import java.io.Serializable;

public class clientesM implements Serializable{
    int codigo;
    String nombre;
     String nit;
     String correo;
     String genero;

    public clientesM() {
    }
    
    
    public clientesM(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public clientesM(String nombre, String nit, String correo, String genero) {
        this.nombre = nombre;
        this.nit = nit;
        this.correo = correo;
        this.genero = genero;
    }

    public clientesM(int codigo, String nombre, String nit, String correo, String genero) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nit = nit;
        this.correo = correo;
        this.genero = genero;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}
