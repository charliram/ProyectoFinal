/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;

/**
 *
 * @author fer_o
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        jButtonCheckIN = new javax.swing.JButton();
        jButtoncheckOUT = new javax.swing.JButton();
        jButtonConsultas = new javax.swing.JButton();
        jButtonSALIR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonCheckIN.setText("CHECK IN");

        jButtoncheckOUT.setText("CHECK OUT");

        jButtonConsultas.setText("CONSULTAS");
        jButtonConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultasActionPerformed(evt);
            }
        });

        jButtonSALIR.setText("SALIR");
        jButtonSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSALIRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jButtonCheckIN)
                .addGap(40, 40, 40)
                .addComponent(jButtoncheckOUT)
                .addGap(28, 28, 28)
                .addComponent(jButtonConsultas)
                .addGap(45, 45, 45)
                .addComponent(jButtonSALIR)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCheckIN)
                    .addComponent(jButtoncheckOUT)
                    .addComponent(jButtonConsultas)
                    .addComponent(jButtonSALIR))
                .addContainerGap(285, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultasActionPerformed
        // TODO add your handling code here:
        new Consultas().setVisible(true);
        
    }//GEN-LAST:event_jButtonConsultasActionPerformed

    private void jButtonSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSALIRActionPerformed
        // TODO add your handling code here:
        System.exit(WIDTH);
    }//GEN-LAST:event_jButtonSALIRActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCheckIN;
    private javax.swing.JButton jButtonConsultas;
    private javax.swing.JButton jButtonSALIR;
    private javax.swing.JButton jButtoncheckOUT;
    // End of variables declaration//GEN-END:variables
}
