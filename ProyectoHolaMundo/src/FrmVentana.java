/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */

import javax.swing.JOptionPane;

public class FrmVentana extends javax.swing.JFrame {

    /**
     * Creates new form FrmVentana
     */
    public FrmVentana() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        lblMessage = new java.awt.Label();
        btnSaludar = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtSalida = new java.awt.TextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(480, 360));
        setResizable(false);
        setSize(new java.awt.Dimension(480, 360));
        getContentPane().setLayout(null);

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label1.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 153, 255));
        label1.setText("Hola mundo");
        getContentPane().add(label1);
        label1.setBounds(170, 10, 130, 70);

        lblMessage.setBackground(new java.awt.Color(0, 153, 255));
        lblMessage.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        getContentPane().add(lblMessage);
        lblMessage.setBounds(10, 180, 230, 40);

        btnSaludar.setBackground(new java.awt.Color(255, 51, 51));
        btnSaludar.setText("Saludar");
        btnSaludar.setBorder(null);
        btnSaludar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaludarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSaludar);
        btnSaludar.setBounds(40, 240, 120, 50);

        txtName.setBackground(new java.awt.Color(102, 102, 102));
        getContentPane().add(txtName);
        txtName.setBounds(20, 90, 110, 24);
        getContentPane().add(txtSalida);
        txtSalida.setBounds(270, 80, 190, 220);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaludarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaludarActionPerformed
        final String saludo = "Bienvenido(a)";
        String name = JOptionPane.showInputDialog(null, "??Cual es tu nombre?");
        byte edad = Byte.parseByte(JOptionPane.showInputDialog(null,"??Cual es tu edad?"));
        float estatura = Float.parseFloat(JOptionPane.showInputDialog(null,"??Cual es tu estatura"));
        edad = (byte)(edad*2);
        lblMessage.setText("Buenos dias "+name+" ** "+edad+" -- "+estatura);
        txtSalida.setText(saludo+"\nBuenos dias\n"+name+" \n"+edad+"\n "+estatura);
    }//GEN-LAST:event_btnSaludarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVentana().setVisible(true);
            }
        });
        
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaludar;
    private java.awt.Label label1;
    private java.awt.Label lblMessage;
    private javax.swing.JTextField txtName;
    private java.awt.TextArea txtSalida;
    // End of variables declaration//GEN-END:variables
}
