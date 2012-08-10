package Control;

/**
 * Clase para realizar la conexión entre la aplicación y la Base de Datos en
 * PostgreSQL
 *
 * @author Roberto Herrera Díaz
 * @version 1.0
 */
import java.sql.*;

/*
 * Construtor por defecto de ServiciosBD
 */
public class ServiciosBD {

    static Connection conexion;
    static Statement sentencia;
    static ResultSet resultado;
    static String query = "";

    /**
     * Método para realizar la conexion mediante el JDBC de Postgresql
     *
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static void conectar() {
        String ruta = "jdbc:postgresql://localhost:5432/Agenda_J";
        String usuario = "juanito";
        String password = "123";

        try {
            Class.forName("org.postgresql.Driver").newInstance();
            conexion = DriverManager.getConnection(ruta, usuario, password);
            sentencia = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println("Conexion a Postgresql Correcta!!!");
        } catch (InstantiationException e) {
            System.out.println("No Conecto Error 1!!!");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.out.println("No Conecto, Error 2!!!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("No Conecto, Error 3!!!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("No conecto, Error 4!!!");
            e.printStackTrace();
        }
    }

    /**
     * Método para ejecutar una consulta (Query) a la Base de Datos
     *
     * @param q String que se recibe como query, para ser ejecutado en la BD
     */
    public static void ejecutarConsulta(String q) {
        query = q;

        try {

            resultado = sentencia.executeQuery(query);
            System.out.println("Se Ejecuto Consulta...");

        } catch (SQLException e) {
            System.out.println("No lo Ejecuto, Error!!!");
            e.printStackTrace();
        }
    }

    /**
     * Método para ejecutar consultas a la Base de Datos que no regresan datos
     * como: INSERT, UPDATE, DELETE
     *
     * @param q String que se recibe como query, para ser ejecutado en la BD
     */
    public static void ejecutarUpdate(String q) {
        query = q;

        try {

            sentencia.executeUpdate(query);

        } catch (SQLException e) {
            System.out.println("No lo Ejecuto, Error!!!");
            e.printStackTrace();
        }
    }
}