/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;

import javax.swing.ImageIcon;
import misclases.Piso2;

/**
 *
 * @author fer_o
 */
public class Disponibilidad extends javax.swing.JFrame {
    int []dispo=new int[15];
    ImageIcon Imagen[]=new ImageIcon[16];
    ImageIcon Imagen2[]=new ImageIcon[16];
    /**
     * Creates new form Disponibilidad
     */
    
     public Disponibilidad() {
         
        initComponents();
        
        
    }
    
    public Disponibilidad(int hab[]) {
         this.dispo=hab;
         for (int i = 101; i < 116; i++) {
             Imagen[i-100]=new ImageIcon(getClass().getResource("/imagenes/Ocupado"+i+".jpg"));
            
        }
         for (int i = 101; i < 116; i++) {
             Imagen2[i-100]=new ImageIcon(getClass().getResource("/imagenes/Puerta "+i+".jpg"));
            
        }
         
         
        initComponents();
       this.jLabel101.setIcon(Imagen[1]);
       this.jLabel102.setIcon(Imagen[2]);
       this.jLabel103.setIcon(Imagen[3]);
       this.jLabel104.setIcon(Imagen[4]);
       this.jLabel105.setIcon(Imagen[5]);
       this.jLabel106.setIcon(Imagen[6]);
       this.jLabel107.setIcon(Imagen[7]);
       this.jLabel108.setIcon(Imagen[8]);
       this.jLabel109.setIcon(Imagen[9]);
       this.jLabel110.setIcon(Imagen[10]);
       this.jLabel111.setIcon(Imagen[11]);
       this.jLabel112.setIcon(Imagen[12]);
       this.jLabel113.setIcon(Imagen[13]);
       this.jLabel114.setIcon(Imagen[14]);
       this.jLabel115.setIcon(Imagen[15]);
        int aux;
        for (int i = 0; i < 15; i++) {
            aux=hab[i];
            System.out.println(aux);
            switch(aux){
                case 101:{
                    this.jLabel101.setIcon(Imagen2[1]);
                    
                    }
                    break;
                case 102:{
                    this.jLabel102.setIcon(Imagen2[2]);
                    }
                    break;
                case 103:{
                    this.jLabel103.setIcon(Imagen2[3]);
                    
                    }
                    break;
                case 104:{
                    this.jLabel104.setIcon(Imagen2[4]);
                    }
                    break;
                case 105:{
                    
                    this.jLabel105.setIcon(Imagen2[5]);
                    }
                    break;
                case 106:{
                    this.jLabel106.setIcon(Imagen2[6]);
                    }
                    break;
                case 107:{
                    this.jLabel107.setIcon(Imagen2[7]);
                    
                    }
                    break;
                case 108:{
                    System.out.println("ok");
                    this.jLabel108.setIcon(Imagen2[8]);
                    }
                    break;
                case 109:{
                    System.out.println("ok");
                    this.jLabel109.setIcon(Imagen2[9]);
                    }
                    break;
                case 110:{
                    this.jLabel110.setIcon(Imagen2[10]);
                    }
                    break;
                case 111:{
                    
                    this.jLabel111.setIcon(Imagen2[11]);
                    }
                    break;
                case 112:{
                    this.jLabel112.setIcon(Imagen2[12]);
                    }
                    break;
                case 113:{
                    
                    this.jLabel113.setIcon(Imagen2[13]);
                    }
                    break;
                case 114:{
                    this.jLabel114.setIcon(Imagen2[14]);
                    }
                    break;
                case 115:{
                    
                    this.jLabel115.setIcon(Imagen2[15]);
                    }
                    break;
                default:
                    break;
            }
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

        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Puerta 101.jpg"))); // NOI18N

        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Puerta 102.jpg"))); // NOI18N
        jLabel102.setText(" ");

        jLabel103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Puerta 103.jpg"))); // NOI18N
        jLabel103.setText(" ");

        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Puerta 104.jpg"))); // NOI18N
        jLabel104.setText(" ");

        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Puerta 105.jpg"))); // NOI18N
        jLabel105.setText(" ");

        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Puerta 106.jpg"))); // NOI18N
        jLabel106.setText(" ");

        jLabel107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Puerta 107.jpg"))); // NOI18N
        jLabel107.setText(" ");

        jLabel108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Puerta 108.jpg"))); // NOI18N
        jLabel108.setText(" ");

        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Puerta 110.jpg"))); // NOI18N
        jLabel110.setText(" ");

        jLabel111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Puerta 111.jpg"))); // NOI18N
        jLabel111.setText(" ");

        jLabel112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Puerta 112.jpg"))); // NOI18N
        jLabel112.setText(" ");

        jLabel113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Puerta 113.jpg"))); // NOI18N
        jLabel113.setText(" ");

        jLabel109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Puerta 109.jpg"))); // NOI18N
        jLabel109.setText(" ");

        jLabel114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Puerta 114.jpg"))); // NOI18N
        jLabel114.setText(" ");

        jLabel115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Puerta 115.jpg"))); // NOI18N
        jLabel115.setText(" ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PISO 1", "PISO 2" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jComboBox1MousePressed(evt);
            }
        });
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("REGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel101)))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel112, jLabel113, jLabel114, jLabel115});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel101)
                    .addComponent(jLabel102)
                    .addComponent(jLabel103)
                    .addComponent(jLabel104)
                    .addComponent(jLabel105))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel106)
                    .addComponent(jLabel107)
                    .addComponent(jLabel108)
                    .addComponent(jLabel109)
                    .addComponent(jLabel110))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel111)
                    .addComponent(jLabel112)
                    .addComponent(jLabel113)
                    .addComponent(jLabel114)
                    .addComponent(jLabel115))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel103, jLabel104, jLabel105, jLabel106, jLabel107, jLabel108, jLabel109, jLabel110, jLabel112, jLabel113, jLabel114, jLabel115});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here
       // dispose();
        
        //new Piso2().setVisible(true);
        
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Regresa al anterior jrfame
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
       //AQUI VIENE LA VALIDACION DEL PISO 2
        System.out.println("NUEVO");
        for (int i = 0; i < 15; i++) {
            System.out.println(dispo[i]);
        }
        new Piso2(dispo).setVisible(true);
        dispose();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1MousePressed

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
            java.util.logging.Logger.getLogger(Disponibilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Disponibilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Disponibilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Disponibilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Disponibilidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
