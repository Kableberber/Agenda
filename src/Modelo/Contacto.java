/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author rhdtp
 */
public class Contacto {

    int ID_Contacto;
    String Nombre;
    String A_Paterno;
    String A_Materno;
    int Edad;
    String Domicilio;
    int Usuario;

    public Contacto(int ID_Contacto, String Nombre, String A_Paterno, String A_Materno, int Edad, String Domicilio, int Usuario) {
        this.ID_Contacto = ID_Contacto;
        this.Nombre = Nombre;
        this.A_Paterno = A_Paterno;
        this.A_Materno = A_Materno;
        this.Edad = Edad;
        this.Domicilio = Domicilio;
        this.Usuario = Usuario;
    }

    public String getA_Materno() {
        return A_Materno;
    }

    public void setA_Materno(String A_Materno) {
        this.A_Materno = A_Materno;
    }

    public String getA_Paterno() {
        return A_Paterno;
    }

    public void setA_Paterno(String A_Paterno) {
        this.A_Paterno = A_Paterno;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getID_Contacto() {
        return ID_Contacto;
    }

    public void setID_Contacto(int ID_Contacto) {
        this.ID_Contacto = ID_Contacto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getUsuario() {
        return Usuario;
    }

    public void setUsuario(int Usuario) {
        this.Usuario = Usuario;
    }
    
}
