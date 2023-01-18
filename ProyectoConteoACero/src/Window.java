/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge Eduardo Escobar Bugarini
 */
import javax.swing.JOptionPane;

public class Window extends java.awt.Frame {

    public Window() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new java.awt.Label();
        txtTable = new java.awt.TextArea();
        btnForCicle = new java.awt.Button();
        btnWhileCicle = new java.awt.Button();
        btnDoWhileCicle = new java.awt.Button();
        lblAuthorName = new java.awt.Label();

        setBackground(new java.awt.Color(0, 204, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        lblTitle.setAlignment(java.awt.Label.CENTER);
        lblTitle.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblTitle.setText("Contador a Cero");

        txtTable.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTable.setEditable(false);
        txtTable.setName(""); // NOI18N

        btnForCicle.setLabel("Ciclo For");
        btnForCicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForCicleActionPerformed(evt);
            }
        });

        btnWhileCicle.setLabel("Ciclo While");
        btnWhileCicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWhileCicleActionPerformed(evt);
            }
        });

        btnDoWhileCicle.setLabel("Ciclo Do While");
        btnDoWhileCicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoWhileCicleActionPerformed(evt);
            }
        });

        lblAuthorName.setAlignment(java.awt.Label.CENTER);
        lblAuthorName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblAuthorName.setText("Jorge Eduardo Escobar Bugarini ISC-A");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnDoWhileCicle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnForCicle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnWhileCicle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblAuthorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(txtTable, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTable, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(42, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnForCicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnWhileCicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btnDoWhileCicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAuthorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void btnForCicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForCicleActionPerformed
        //Definir numero que irá hasta cero.
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero con el cual contaras hasta cero"));
        String message = "El numero seleccionado es: " + n + "\n";
        for (int i = n; i >= 0; i--) {
            message+=(i + "\n");
        }
        txtTable.setText(message);
    }//GEN-LAST:event_btnForCicleActionPerformed


    private void btnWhileCicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWhileCicleActionPerformed
        //Definir numero que irá hasta cero.
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero con el cual contaras hasta cero"));
        String message = "El numero seleccionado es: " + n + "\n";
        while (n >= 0) {
            message += n + "\n";
            n--;
        }
        txtTable.setText(message);
    }//GEN-LAST:event_btnWhileCicleActionPerformed

    private void btnDoWhileCicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoWhileCicleActionPerformed
        //Definir numero que irá hasta cero.
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero con el cual contaras hasta cero"));
        String message = "El numero seleccionado es: " + n + "\n";
        do {
            message += n + "\n";
            n--;
        } while (n >= 0);
        txtTable.setText(message);
    }//GEN-LAST:event_btnDoWhileCicleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnDoWhileCicle;
    private java.awt.Button btnForCicle;
    private java.awt.Button btnWhileCicle;
    private java.awt.Label lblAuthorName;
    private java.awt.Label lblTitle;
    private java.awt.TextArea txtTable;
    // End of variables declaration//GEN-END:variables
}
