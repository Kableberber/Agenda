/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author rhdtp
 */
public class Asunto {
    
    int ID_Asunto;
    String Fecha;
    String Texto;
    int Usuario;

    public Asunto(int ID_Asunto, String Fecha, String Texto, int Usuario) {
        this.ID_Asunto = ID_Asunto;
        this.Fecha = Fecha;
        this.Texto = Texto;
        this.Usuario = Usuario;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public int getID_Asunto() {
        return ID_Asunto;
    }

    public void setID_Asunto(int ID_Asunto) {
        this.ID_Asunto = ID_Asunto;
    }

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String Texto) {
        this.Texto = Texto;
    }

    public int getUsuario() {
        return Usuario;
    }

    public void setUsuario(int Usuario) {
        this.Usuario = Usuario;
    }
    
}
