/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * Clase de Asunto
 *
 * @author Roberto Herrera Díaz
 * @version 1.0
 */
public class Asunto {

    int ID_Asunto;
    String Fecha;
    String Texto;
    int Usuario;

    /**
     * Constructor por defecto de la clase "Asunto"
     *
     * @param ID_Asunto
     * @param Fecha
     * @param Texto
     * @param Usuario
     */
    public Asunto(int ID_Asunto, String Fecha, String Texto, int Usuario) {
        this.ID_Asunto = ID_Asunto;
        this.Fecha = Fecha;
        this.Texto = Texto;
        this.Usuario = Usuario;
    }

    /**
     * Método get para obtener Fecha
     *
     * @return Retorna la fecha del objeto Asunto
     */
    public String getFecha() {
        return Fecha;
    }

    /**
     * Método set para establecer Fecha
     *
     * @param Fecha
     */
    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    /**
     * Método get para obtener ID_Asunto
     *
     * @return Retorna el ID_Asunto del objeto Asunto
     */
    public int getID_Asunto() {
        return ID_Asunto;
    }

    /**
     * Método set para establecer ID_Asunto
     * 
     * @param ID_Asunto 
     */
    public void setID_Asunto(int ID_Asunto) {
        this.ID_Asunto = ID_Asunto;
    }
    
    /**
     * Método get para obtener Texto
     * 
     * @return Retorna el Texto del objeto Asunto
     */
    public String getTexto() {
        return Texto;
    }
    
    /**
     * Método set para establecer Texto
     * 
     * @param Texto 
     */
    public void setTexto(String Texto) {
        this.Texto = Texto;
    }
    
    /**
     * Método get para obtener Usuario
     * 
     * @return Retorna el objeto Usuario
     */
    public int getUsuario() {
        return Usuario;
    }
    
    /**
     * Método set para establecer Usuario
     * 
     * @param Usuario 
     */
    public void setUsuario(int Usuario) {
        this.Usuario = Usuario;
    }
}
