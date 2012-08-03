package Control;

import Modelo.Usuario;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Transaccion_Usuario {

    static Usuario UsuarioPasado;
    static int id_Usuario;
    static String password = "";
    static String nombre = "";

    public static Usuario dameUnUsuarioDelaBD() {
        Usuario r = null;

        try {


            if (ServiciosBD.resultado.next()) {
                id_Usuario = ServiciosBD.resultado.getInt("ID_Usuario");
                password = ServiciosBD.resultado.getString("Password");
                nombre = ServiciosBD.resultado.getString("Nombre");
                r = new Usuario(id_Usuario, password, nombre);
            }
        } catch (SQLException e) {
            System.out.println("Error en la ejecución...");
            e.printStackTrace();
        }
        return r;
    }

    public static Usuario dameelPrimero() {
        Usuario r = null;

        try {

            if (ServiciosBD.resultado.first()) {
                id_Usuario = ServiciosBD.resultado.getInt("ID_Usuario");
                password = ServiciosBD.resultado.getString("Password");
                nombre = ServiciosBD.resultado.getString("Nombre");
                r = new Usuario(id_Usuario, password, nombre);
            }
        } catch (SQLException e) {
            System.out.println("Error en la ejecución...");
            e.printStackTrace();
        }
        return r;
    }

    public static void insertaUsuario(Usuario x) {
        String q = "INSERT INTO Usuario VALUES ('" + x.getID_Usuario() + "','" + x.getPassword() + "','" + x.getNombre() + "')";
        ServiciosBD.ejecutarUpdate(q);

        JOptionPane.showMessageDialog(null, "Usuario Insertado...");

    }

    public static void borrarUsuario(int id_Usuario) {
        String q = "DELETE FROM Usuario WHERE ID_Usuario ='" + id_Usuario + "'";
        ServiciosBD.ejecutarUpdate(q);
        JOptionPane.showMessageDialog(null, "Usuario Borrado...");

    }

    public static void modificarUsuario(Usuario x) {
        String q = "UPDATE  Usuario  SET NOMBRE = '" + x.getPassword() + "' ," + " DIRECCION ='" + x.getNombre() + "' " + "WHERE ID_Usuario ='" + x.getID_Usuario() + "'";
        ServiciosBD.ejecutarUpdate(q);
        JOptionPane.showMessageDialog(null, "Usuario Modificado...");

    }

    public static Usuario buscarUsuario(int id_Usuario) {
        Usuario r = null;
        String q = "SELECT *  FROM Usuario  " + "WHERE ID_Usuario='" + id_Usuario + "'";
        ServiciosBD.ejecutarConsulta(q);
        r = dameUnUsuarioDelaBD();
        //JOptionPane.showMessageDialog(null, "Usuario Encontrado...");
        return r;
    }

    public static Usuario buscarUsuarioPorIDyPASS(int id_Usuario, String password) {
        Usuario r = null;
        String q = "SELECT * FROM Usuario " + "WHERE ID_Usuario='" + id_Usuario + "' AND Password='" + password + "'";
        ServiciosBD.ejecutarConsulta(q);
        r = dameUnUsuarioDelaBD();
        //JOptionPane.showMessageDialog(null, "Usuario Encontrado...");
        return r;
    }

    public static Usuario buscarUsuarioID_Usuario() {
        Usuario r = null;
        String q = "SELECT * FROM Usuario WHERE ID_Usuario=(SELECT MAX(ID_Usuario) FROM Usuario)";
        ServiciosBD.ejecutarConsulta(q);
        r = dameUnUsuarioDelaBD();
        //JOptionPane.showMessageDialog(null, "Usuario Encontrado...");
        return r;
    }
}