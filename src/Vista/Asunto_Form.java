/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.Transaccion_Asunto;
import Modelo.Asunto;

/**
 *
 * @author rhdtp
 */
public class Asunto_Form extends javax.swing.JFrame {

    /**
     * Creates new form Asunto_Form
     */
    Principal Prin;
    Acceso A;
    int log = A.id_user;

    public Asunto_Form() {
        initComponents();
        this.setLocation(300, 100);
        jTextField2.setText("" + A.usuario);
        asuntoID();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda J - Asunto");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setText("Asunto:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 12, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 222, 288, 146));

        jLabel2.setText("Fecha:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 154, -1, -1));

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 384, 99, -1));

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 427, 99, -1));

        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 470, -1, -1));

        jTextField2.setEditable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 50, 226, -1));

        jLabel5.setText("Usuario:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 154, 110, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 154, 60, -1));

        jLabel3.setText("Hora:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 154, -1, -1));

        jLabel4.setText("ID Asunto:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 124, -1, -1));

        jTextField3.setEditable(false);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 124, 50, -1));

        jButton4.setText("Modificar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 384, -1, -1));

        jButton5.setText("Eliminar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 384, 100, -1));

        jButton6.setText("Buscar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 87, -1, 20));

        jLabel6.setText("Fecha/Hora:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 191, -1, -1));

        jTextField4.setEditable(false);
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 191, 195, -1));

        jLabel7.setText("Buscar Asunto:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 88, 57, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarCampos(){
        jTextField1.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jDateChooser1.setDateFormatString("");
        jTextArea1.setText("");
        asuntoID();
    }
    
    private void asuntoID(){
        
        Asunto Y = Transaccion_Asunto.buscarAsuntoID_Asunto();

        if (Y == null) {
        javax.swing.JOptionPane.showMessageDialog(this, "No se encontraron asuntos... ");
        } else {
        jTextField3.setText(Integer.toString(Y.getID_Asunto()+1));
        }
        
    }
    
    public Asunto armeAsuntodelaVentana() {

        Asunto r = null;
        int id_Asunto = Integer.parseInt(jTextField3.getText());
        String fecha = jTextField4.getText();
        String texto = jTextArea1.getText();
        int usuario = log;

        r = new Asunto(id_Asunto, fecha, texto, usuario);

        return r;
    }

    public void muevaloalaventana(Asunto x) {

        jTextField3.setText(x.getID_Asunto() + "");
        jTextField4.setText(x.getFecha() + "");
        jTextArea1.setText(x.getTexto() + "");

    }

    public void muevaloalaventanaClienteID(Asunto x) {

        int resultado;

        resultado = x.getID_Asunto() + 1;

        jTextField1.setText(Integer.toString(resultado));

    }

    public Asunto ArmaAsunto() {
        Asunto r = null;
        int id_Asunto = Integer.parseInt(jTextField3.getText());
        String fecha = jTextField4.getText();
        String texto = jTextArea1.getText();
        int usuario = log;

        r = new Asunto(id_Asunto, fecha, texto, usuario);
        return r;
    }

    public Asunto ArmeAsunto() {

        Asunto r = null;
        int id_Asunto = Integer.parseInt(jTextField3.getText());
        String fecha = jTextField4.getText();
        String texto = jTextArea1.getText();
        int usuario = log;

        r = new Asunto(id_Asunto, fecha, texto, usuario);
        return r;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTextField3.getText().isEmpty() || jTextField4.getText().isEmpty() || jTextArea1.getText().isEmpty() ) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debes completar los datos... ");
        } else {
            Asunto x = null;
            x = armeAsuntodelaVentana();
            Transaccion_Asunto.insertaAsunto(x);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Prin = new Principal();
        this.setVisible(false);
        Prin.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (jTextField3.getText().isEmpty() || jTextField4.getText().isEmpty() || jTextArea1.getText().isEmpty() ) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debes buscar un asunto... ");
        } else {
            Asunto x = null;
            x = armeAsuntodelaVentana();
            Transaccion_Asunto.modificarAsunto(x);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        String año = Integer.toString(jDateChooser1.getCalendar().get(java.util.Calendar.YEAR));
        String mes = Integer.toString(jDateChooser1.getCalendar().get(java.util.Calendar.MONTH) + 1);
        String dia = Integer.toString(jDateChooser1.getCalendar().get(java.util.Calendar.DATE));
        String hora = jTextField1.getText();
        jTextField4.setText(año + "-" + mes + "-" + dia + " " + hora);
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        if (jTextField5.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debes ingresar un ID de Asunto... ");
        } else {
            int id_Asunto = Integer.parseInt(jTextField5.getText());
            Asunto r = Transaccion_Asunto.buscarAsunto(id_Asunto);

            if (r == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "No se encontro el Asunto... ");
                limpiarCampos();
            } else {
                muevaloalaventana(r);
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        if (jTextField3.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debes buscar un asunto... ");
        } else {

            int confirmado = javax.swing.JOptionPane.showConfirmDialog(this, "¿Estas seguro?");

            if (javax.swing.JOptionPane.OK_OPTION == confirmado) {
                int id_asunto = Integer.parseInt(jTextField3.getText());
                Transaccion_Asunto.borrarAsunto(id_asunto);
                limpiarCampos();
            } else {
                System.out.println("Cancelado por el usuario...");
            }


        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Asunto_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Asunto_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Asunto_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Asunto_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Asunto_Form().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
