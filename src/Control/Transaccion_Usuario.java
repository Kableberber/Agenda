package Control;

/**
 * Clase de Control para ejecutar los DAO de la clase "Usuario"
 *
 * @author Roberto Herrera Díaz
 * @version 1.0
 */
import Modelo.Usuario;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Transaccion_Usuario {

    static Usuario UsuarioPasado;
    static int id_Usuario;
    static String password = "";
    static String nombre = "";

    /**
     * Método para extraer una fila de la tabla "Usuario" de la BD
     *
     * @throws SQLException
     * @return r Retorna los datos obtenidos de la fila
     */
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

    /**
     * Método para extraer la primera fila de la tabla "Usuario" de la BD
     *
     * @throws SQLException
     * @return r Retorna los datos obtenidos de la fila
     */
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

    /**
     * Método para insertar un registro nuevo en la tabla "Usuario" de la BD
     *
     * @param x Recive como parámetro un objeto Usuario
     */
    public static void insertaUsuario(Usuario x) {
        String q = "INSERT INTO Usuario VALUES ('" + x.getID_Usuario() + "','" + x.getPassword() + "','" + x.getNombre() + "')";
        ServiciosBD.ejecutarUpdate(q);

        JOptionPane.showMessageDialog(null, "Usuario Insertado...");

    }

    /**
     * Método para borrar un registro de la tabla "Usuario" de la BD
     *
     * @param id_Usuario Recive como parámetro el id de un Usuario
     */
    public static void borrarUsuario(int id_Usuario) {
        String q = "DELETE FROM Usuario WHERE ID_Usuario ='" + id_Usuario + "'";
        ServiciosBD.ejecutarUpdate(q);
        JOptionPane.showMessageDialog(null, "Usuario Borrado...");

    }

    /**
     * Método para modificar un registro de la tabla "Usuario" de la BD
     *
     * @param x Recive como parámetro un objeto Usuario
     */
    public static void modificarUsuario(Usuario x) {
        String q = "UPDATE  Usuario  SET NOMBRE = '" + x.getPassword() + "' ," + " DIRECCION ='" + x.getNombre() + "' " + "WHERE ID_Usuario ='" + x.getID_Usuario() + "'";
        ServiciosBD.ejecutarUpdate(q);
        JOptionPane.showMessageDialog(null, "Usuario Modificado...");

    }

    /**
     * Método para buscar un registro por id en la tabla "Usuario" de la BD
     *
     * @param id_Usuario
     * @return r Retorna un registro de la tabla "Contacto" de ser encontrado
     */
    public static Usuario buscarUsuario(int id_Usuario) {
        Usuario r = null;
        String q = "SELECT *  FROM Usuario  " + "WHERE ID_Usuario='" + id_Usuario + "'";
        ServiciosBD.ejecutarConsulta(q);
        r = dameUnUsuarioDelaBD();
        //JOptionPane.showMessageDialog(null, "Usuario Encontrado...");
        return r;
    }

    /**
     * Método para buscar un registro en la tabla "Usuario" de la BD por medio
     * de una condición donde id y password sean iguales
     *
     * @param id_Usuario Recive como parámetro el id de un Usuario
     * @param password Recive como parámetro el password de un Usuario
     * @return Retorna un registro de la tabla "Usuario" de cumplirse la
     * condición
     */
    public static Usuario buscarUsuarioPorIDyPASS(int id_Usuario, String password) {
        Usuario r = null;
        String q = "SELECT * FROM Usuario " + "WHERE ID_Usuario='" + id_Usuario + "' AND Password='" + password + "'";
        ServiciosBD.ejecutarConsulta(q);
        r = dameUnUsuarioDelaBD();
        //JOptionPane.showMessageDialog(null, "Usuario Encontrado...");
        return r;
    }
}