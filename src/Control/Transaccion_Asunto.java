package Control;

import Modelo.Asunto;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Transaccion_Asunto {

    static Asunto UsuntoPasado;
    static int id_Asunto;
    static String fecha = "";
    static String texto = "";
    static int usuario;

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

    public static void insertaAsunto(Asunto x) {
        String q = "INSERT INTO Asunto VALUES ('" + x.getID_Asunto() + "','" + x.getFecha() + "','" + x.getTexto() + "','" + x.getUsuario() + "')";
        ServiciosBD.ejecutarUpdate(q);

        JOptionPane.showMessageDialog(null, "Asunto Insertado...");

    }

    public static void borrarAsunto(int id_Asunto) {
        String q = "DELETE FROM Asunto WHERE ID_Asunto ='" + id_Asunto + "'";
        ServiciosBD.ejecutarUpdate(q);
        JOptionPane.showMessageDialog(null, "Asunto Borrado...");

    }

    public static void modificarAsunto(Asunto x) {
        String q = "UPDATE  Asunto  SET fecha = '" + x.getFecha() + "' ," + " texto ='" + x.getTexto() + "' " + "WHERE ID_Asunto ='" + x.getID_Asunto() + "'";
        ServiciosBD.ejecutarUpdate(q);
        JOptionPane.showMessageDialog(null, "Asunto Modificado...");

    }

    public static Asunto buscarAsunto(int id_Asunto) {
        Asunto r = null;
        String q = "SELECT *  FROM Asunto  " + "WHERE ID_Asunto='" + id_Asunto + "'";
        ServiciosBD.ejecutarConsulta(q);
        r = dameUnAsuntoDelaBD();
        //JOptionPane.showMessageDialog(null, "Asunto Encontrado...");
        return r;
    }

    public static Asunto buscarAsuntoPorIDyPASS(int id_Asunto, String password) {
        Asunto r = null;
        String q = "SELECT * FROM Asunto " + "WHERE ID_Asunto='" + id_Asunto + "' AND Password='" + password + "'";
        ServiciosBD.ejecutarConsulta(q);
        r = dameUnAsuntoDelaBD();
        //JOptionPane.showMessageDialog(null, "Asunto Encontrado...");
        return r;
    }

    public static Asunto buscarAsuntoID_Asunto() {
        Asunto r = null;
        String q = "SELECT * FROM asunto WHERE id_asunto=(SELECT MAX(id_asunto) FROM asunto)";
        ServiciosBD.ejecutarConsulta(q);
        r = dameUnAsuntoDelaBD();
        //JOptionPane.showMessageDialog(null, "Asunto Encontrado...");
        return r;
    }
}