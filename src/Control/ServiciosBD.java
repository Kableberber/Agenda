package Control;

import java.sql.*;

public class ServiciosBD {

    static Connection conexion;
    static Statement sentencia;
    static ResultSet resultado;
    static String query = "";

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

    public static void ejecutarUpdate(String q) {
        query = q;

        try {

            sentencia.executeUpdate(query);

        } catch (SQLException e) {
            System.out.println("No lo Ejecuto, Error!!!");
            e.printStackTrace();
        }
    }

    public static void ConsultaArticulos(String q) {

        query = q;

        try {
            ResultSet rs = sentencia.executeQuery(query);
            System.out.println("Se Ejecuto Consulta...");

        } catch (SQLException e) {
            System.out.println("No lo Ejecuto, Error!!!");
            e.printStackTrace();
        }

    }
}