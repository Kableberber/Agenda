package Modelo;

public class Usuario {

    public int ID_Usuario;
    String Password;
    String Nombre;
    public int id;

    public Usuario(int ID_Usuario, String Password, String Nombre) {
        this.ID_Usuario = ID_Usuario;
        this.Password = Password;
        this.Nombre = Nombre;
        id = ID_Usuario;
    }
    
    public Usuario(){
    }

    public int getID_Usuario() {
        id = ID_Usuario;
        return ID_Usuario;
    }

    public void setID_Usuario(int ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
        id = ID_Usuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
   
}