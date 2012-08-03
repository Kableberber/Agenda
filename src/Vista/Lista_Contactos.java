/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.ServiciosBD;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rhdtp
 */
public class Lista_Contactos extends javax.swing.JFrame {

    /**
     * Creates new form Lista_Contactos
     */
    Principal Prin;
    public static DefaultTableModel modelo = new DefaultTableModel();
    Object[] filas;
    Acceso A;
    int log = A.id_user;

    public Lista_Contactos() {
        initComponents();
        this.setLocation(300, 100);
        //Lista_Contactos.setDefaultLookAndFeelDecorated(true);
        jTextField1.setText("" + A.usuario);
        ServiciosBD.conectar();
        //getRootPane().setDefaultButton(jButton1);

        try {
            Class.forName("org.postgresql.Driver");
            Connection conne = (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5432/Agenda_J", "juanito", "123");

            Statement consulta = (Statement) conne.createStatement();
            ResultSet rs = consulta.executeQuery("select * from contacto where fk_usuario= '" + A.id_user + "'");

            modelo = new DefaultTableModel();
            jTable1.setModel(modelo);

            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido Paterno");
            modelo.addColumn("Apellido Materno");
            modelo.addColumn("Edad");
            modelo.addColumn("Domicilio");

            filas = new Object[modelo.getColumnCount()];

            while (rs.next()) {
                for (int i = 0; i < modelo.getColumnCount(); i++) {
                    filas[i] = rs.getObject(i + 1);
                }

                modelo.addRow(filas);
                jTable1.setModel(modelo);
                jTable1.getColumnModel().getColumn(0).setMaxWidth(50);
                jTable1.getColumnModel().getColumn(1).setMaxWidth(170);
                jTable1.getColumnModel().getColumn(2).setMaxWidth(170);
                jTable1.getColumnModel().getColumn(3).setMaxWidth(170);
                jTable1.getColumnModel().getColumn(4).setMaxWidth(40);
                jTable1.getColumnModel().getColumn(5).setMaxWidth(200);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error sql no se pueden leer datos");
            //error desconocido //por lo general no hay conexion con la base de datos
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error al leer la base de datos");

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda J - Lista de Contactos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 52, 728, -1));

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 482, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setText("Lista de Contactos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 12, -1, -1));

        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 17, -1, -1));

        jTextField1.setEditable(false);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 15, 166, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Prin = new Principal();
        this.setVisible(false);
        Prin.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Lista_Contactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lista_Contactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lista_Contactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lista_Contactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Lista_Contactos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}