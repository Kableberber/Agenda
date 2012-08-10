package Control;

/**
 * Clase de Control para ejecutar los DAO de la Clase "Asunto"
 *
 * @author Roberto Herrera Díaz
 * @version 1.0
 */
import Modelo.Asunto;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Constructor por defecto de Transaccion_Asunto
 */
public class Transaccion_Asunto {

    static Asunto UsuntoPasado;
    static int id_Asunto;
    static String fecha = "";
    static String texto = "";
    static int usuario;

    /**
     * Método para extraer una fila de la tabla "Asunto" de la BD
     *
     * @throws SQLException
     * @return r Retorna los datos obtenidos de la fila
     */
    public static Asunto dameUnAsuntoDelaBD() {
        Asunto r = null;

        try {


            if (ServiciosBD.resultado.next()) {
                id_Asunto = ServiciosBD.resultado.getInt("ID_Asunto");
                fecha = ServiciosBD.resultado.getString("fecha");
                texto = ServiciosBD.resultado.getString("texto");
                usuario = ServiciosBD.resultado.getInt("fk_usuario");
                r = new Asunto(id_Asunto, fecha, texto, usuario);
            }
        } catch (SQLException e) {
            System.out.println("Error en la ejecución...");
            e.printStackTrace();
        }
        return r;
    }

    /**
     * Método para extraer la primera fila de la tabla "Asunto" de la BD
     *
     * @throws SQLException
     * @return r Retorna los datos obtenidos de la fila
     */
    public static Asunto dameelPrimero() {
        Asunto r = null;

        try {

            if (ServiciosBD.resultado.first()) {
                id_Asunto = ServiciosBD.resultado.getInt("ID_Asunto");
                fecha = ServiciosBD.resultado.getString("fecha");
                texto = ServiciosBD.resultado.getString("texto");
                usuario = ServiciosBD.resultado.getInt("fk_usuario");
                r = new Asunto(id_Asunto, fecha, texto, usuario);
            }
        } catch (SQLException e) {
            System.out.println("Error en la ejecución...");
            e.printStackTrace();
        }
        return r;
    }

    /**
     * Método para insertar un registro nuevo en la tabla "Asunto" de la BD
     *
     * @param x Recive como parámetro un objeto Asunto
     */
    public static void insertaAsunto(Asunto x) {
        String q = "INSERT INTO Asunto VALUES ('" + x.getID_Asunto() + "','" + x.getFecha() + "','" + x.getTexto() + "','" + x.getUsuario() + "')";
        ServiciosBD.ejecutarUpdate(q);

        JOptionPane.showMessageDialog(null, "Asunto Insertado...");

    }

    /**
     * Método para borrar un registro de la tabla "Asunto" de la BD
     *
     * @param id_Asunto Recive como parámetro el id de un Asunto
     */
    public static void borrarAsunto(int id_Asunto) {
        String q = "DELETE FROM Asunto WHERE ID_Asunto ='" + id_Asunto + "'";
        ServiciosBD.ejecutarUpdate(q);
        JOptionPane.showMessageDialog(null, "Asunto Borrado...");

    }

    /**
     * Método para modificar un registro de la tabla "Asunto" de la BD
     *
     * @param x Recive como parámetro un objeto Asunto
     */
    public static void modificarAsunto(Asunto x) {
        String q = "UPDATE  Asunto  SET fecha = '" + x.getFecha() + "' ," + " texto ='" + x.getTexto() + "' " + "WHERE ID_Asunto ='" + x.getID_Asunto() + "'";
        ServiciosBD.ejecutarUpdate(q);
        JOptionPane.showMessageDialog(null, "Asunto Modificado...");

    }

    /**
     * Método para buscar un registro por id en la tabla "Asunto" de la BD
     *
     * @param id_Asunto
     * @return r Retorna un registro de la tabla "Asunto"
     */
    public static Asunto buscarAsunto(int id_Asunto) {
        Asunto r = null;
        String q = "SELECT *  FROM Asunto  " + "WHERE ID_Asunto='" + id_Asunto + "'";
        ServiciosBD.ejecutarConsulta(q);
        r = dameUnAsuntoDelaBD();
        //JOptionPane.showMessageDialog(null, "Asunto Encontrado...");
        return r;
    }

    /**
     * Método para buscar un registro en la tabla "Asunto" de la BD donde el id 
     * sea el registro maximo
     *
     * @return r Retorna un registro de la tabla "Asunto"
     */
    public static Asunto buscarAsuntoID_Asunto() {
        Asunto r = null;
        String q = "SELECT * FROM asunto WHERE id_asunto=(SELECT MAX(id_asunto) FROM asunto)";
        ServiciosBD.ejecutarConsulta(q);
        r = dameUnAsuntoDelaBD();
        //JOptionPane.showMessageDialog(null, "Asunto Encontrado...");
        return r;
    }
}