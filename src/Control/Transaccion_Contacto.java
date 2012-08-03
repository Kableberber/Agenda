package Control;

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

    public static void insertaContacto(Contacto x) {
        String q = "INSERT INTO contacto VALUES ('" + x.getID_Contacto() + "','" + x.getNombre() + "','" + x.getA_Paterno() + "','" + x.getA_Materno() + "','" + x.getEdad() + "','" + x.getDomicilio() + "','" + x.getUsuario() + "')";
        ServiciosBD.ejecutarUpdate(q);

        JOptionPane.showMessageDialog(null, "Contacto Insertado...");

    }

    public static void borrarContacto(int id_Contacto) {
        String q = "DELETE FROM contacto WHERE ID_Contacto ='" + id_Contacto + "'";
        ServiciosBD.ejecutarUpdate(q);
        JOptionPane.showMessageDialog(null, "Contacto Borrado...");

    }

    public static void modificarContacto(Contacto x) {
        String q = "UPDATE  Contacto  SET NOMBRE = '" + x.getNombre() + "'," + " A_PATERNO ='" + x.getA_Paterno() + "'," + " A_MATERNO ='" + x.getA_Materno() + "'," + " EDAD ='" + x.getEdad() + "'," + " DOMICILIO ='" + x.getDomicilio() + "' " + "WHERE ID_CONTACTO ='" + x.getID_Contacto() + "'";
        ServiciosBD.ejecutarUpdate(q);
        JOptionPane.showMessageDialog(null, "Contacto Modificado...");

    }

    public static Contacto buscarContacto(int id_Contacto) {
        Contacto r = null;
        String q = "SELECT *  FROM Contacto  " + "WHERE id_Contacto='" + id_Contacto + "'";
        ServiciosBD.ejecutarConsulta(q);
        r = dameUnContactoDelaBD();
        //JOptionPane.showMessageDialog(null, "Contacto Encontrado...");
        return r;
    }

    public static Contacto buscarContactoID_Contacto() {
        Contacto r = null;
        String q = "SELECT * FROM Contacto WHERE id_Contacto=(SELECT MAX(ID_Contacto) FROM Contacto)";
        ServiciosBD.ejecutarConsulta(q);
        r = dameUnContactoDelaBD();
        //JOptionPane.showMessageDialog(null, "Contacto Encontrado...");
        return r;
    }
    
}