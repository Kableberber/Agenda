package Control;

/**
 * Clase de Control para ejecutar los DAO de la clase "Contacto"
 *
 * @author Roberto Herrera Díaz
 * @version 1.0
 */
import Modelo.Contacto;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Transaccion_Contacto {

    static Contacto ContactoPasado;
    static int id_contacto;
    static String nombre = "";
    static String a_paterno = "";
    static String a_materno = "";
    static int edad;
    static String domicilio = "";
    static int usuario;

    /**
     * Método para extraer una fila de la tabla "Contacto" de la BD
     *
     * @throws SQLException
     * @return r Retorna los datos obtenidos de la fila
     */
    public static Contacto dameUnContactoDelaBD() {

        Contacto r = null;

        try {


            if (ServiciosBD.resultado.next()) {
                id_contacto = ServiciosBD.resultado.getInt("id_contacto");
                nombre = ServiciosBD.resultado.getString("nombre");
                a_paterno = ServiciosBD.resultado.getString("a_paterno");
                a_materno = ServiciosBD.resultado.getString("a_materno");
                edad = ServiciosBD.resultado.getInt("edad");
                domicilio = ServiciosBD.resultado.getString("domicilio");
                usuario = ServiciosBD.resultado.getInt("fk_usuario");

                r = new Contacto(id_contacto, nombre, a_paterno, a_materno, edad, domicilio, usuario);
            }
        } catch (SQLException e) {
            System.out.println("Error en la ejecución...");
            e.printStackTrace();
        }
        return r;
    }

    /**
     * Método para extraer la primera fila de la tabla "Contacto" de la BD
     *
     * @throws SQLException
     * @return r Retorna los datos obtenidos de la fila
     */
    public static Contacto dameelPrimero() {
        Contacto r = null;

        try {

            if (ServiciosBD.resultado.first()) {
                id_contacto = ServiciosBD.resultado.getInt("ID_Contacto");
                nombre = ServiciosBD.resultado.getString("Nombre");
                a_paterno = ServiciosBD.resultado.getString("A_Paterno");
                a_materno = ServiciosBD.resultado.getString("A_Materno");
                edad = ServiciosBD.resultado.getInt("Edad");
                domicilio = ServiciosBD.resultado.getString("Domicilio");
                usuario = ServiciosBD.resultado.getInt("usuario");

                r = new Contacto(id_contacto, nombre, a_paterno, a_materno, edad, domicilio, usuario);
            }
        } catch (SQLException e) {
            System.out.println("Error en la ejecución...");
            e.printStackTrace();
        }
        return r;
    }

    /**
     * Método para insertar un registro nuevo en la tabla "Contacto" de la BD
     *
     * @param x Recive como parámetro un objeto Contacto
     */
    public static void insertaContacto(Contacto x) {
        String q = "INSERT INTO contacto VALUES ('" + x.getID_Contacto() + "','" + x.getNombre() + "','" + x.getA_Paterno() + "','" + x.getA_Materno() + "','" + x.getEdad() + "','" + x.getDomicilio() + "','" + x.getUsuario() + "')";
        ServiciosBD.ejecutarUpdate(q);

        JOptionPane.showMessageDialog(null, "Contacto Insertado...");

    }

    /**
     * Método para borrar un registro de la tabla "Contacto" de la BD
     *
     * @param id_Contacto Recive como parámetro el id de un Contacto
     */
    public static void borrarContacto(int id_Contacto) {
        String q = "DELETE FROM contacto WHERE ID_Contacto ='" + id_Contacto + "'";
        ServiciosBD.ejecutarUpdate(q);
        JOptionPane.showMessageDialog(null, "Contacto Borrado...");

    }

    /**
     * Método para modificar un registro de la tabla "Contacto" de la BD
     *
     * @param x Recive como parámetro un objeto Contacto
     */
    public static void modificarContacto(Contacto x) {
        String q = "UPDATE  Contacto  SET NOMBRE = '" + x.getNombre() + "'," + " A_PATERNO ='" + x.getA_Paterno() + "'," + " A_MATERNO ='" + x.getA_Materno() + "'," + " EDAD ='" + x.getEdad() + "'," + " DOMICILIO ='" + x.getDomicilio() + "' " + "WHERE ID_CONTACTO ='" + x.getID_Contacto() + "'";
        ServiciosBD.ejecutarUpdate(q);
        JOptionPane.showMessageDialog(null, "Contacto Modificado...");

    }

    /**
     * Método para buscar un registro por id en la tabla "Contacto" de la BD
     *
     * @param id_Contacto
     * @return r Retorna un registro de la tabla "Contacto"
     */
    public static Contacto buscarContacto(int id_Contacto) {
        Contacto r = null;
        String q = "SELECT *  FROM Contacto  " + "WHERE id_Contacto='" + id_Contacto + "'";
        ServiciosBD.ejecutarConsulta(q);
        r = dameUnContactoDelaBD();
        //JOptionPane.showMessageDialog(null, "Contacto Encontrado...");
        return r;
    }

    /**
     * Método para buscar un registro en la tabla "Contaco" de la BD donde el id
     * sea el registro maximo
     *
     * @return r Retorna un registro de la tabla "Contacto"
     */
    public static Contacto buscarContactoID_Contacto() {
        Contacto r = null;
        String q = "SELECT * FROM Contacto WHERE id_Contacto=(SELECT MAX(ID_Contacto) FROM Contacto)";
        ServiciosBD.ejecutarConsulta(q);
        r = dameUnContactoDelaBD();
        //JOptionPane.showMessageDialog(null, "Contacto Encontrado...");
        return r;
    }
}