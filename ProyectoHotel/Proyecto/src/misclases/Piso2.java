/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;

import javax.swing.ImageIcon;

/**
 *
 * @author fer_o
 */
public class Piso2 extends javax.swing.JFrame {
    ImageIcon Imagen[]=new ImageIcon[16];
    ImageIcon Imagen2[]=new ImageIcon[16];
    /**
     * Creates new form Piso2
     */
    public Piso2() {
     
        initComponents();
    }
    public Piso2(int hab[]) {
         
         for (int i = 201; i < 216; i++) {
             Imagen[i-200]=new ImageIcon(getClass().getResource("/imagenes/Ocupado "+i+".jpg"));
            
        }
         for (int i = 201; i < 216; i++) {
             Imagen2[i-200]=new ImageIcon(getClass().getResource("/imagenes/Puerta "+i+".jpg"));
            
        }
        System.out.println("aqui todavia jala");
        initComponents();
       this.jLabel201.setIcon(Imagen[1]);
       this.jLabel202.setIcon(Imagen[2]);
       this.jLabel203.setIcon(Imagen[3]);
       this.jLabel204.setIcon(Imagen[4]);
       this.jLabel205.setIcon(Imagen[5]);
       this.jLabel206.setIcon(Imagen[6]);
       this.jLabel207.setIcon(Imagen[7]);
       this.jLabel208.setIcon(Imagen[8]);
       this.jLabel209.setIcon(Imagen[9]);
       this.jLabel210.setIcon(Imagen[10]);
       this.jLabel211.setIcon(Imagen[11]);
       this.jLabel212.setIcon(Imagen[12]);
       this.jLabel213.setIcon(Imagen[13]);
       this.jLabel214.setIcon(Imagen[14]);
       this.jLabel215.setIcon(Imagen[15]);
        System.out.println("salio del false");
       int aux;
        for (int i = 0; i < 15; i++) {
            aux=hab[i];
            System.out.println(aux);
            switch(aux){
                case 201:{
                    
                    this.jLabel201.setIcon(Imagen2[1]);
                    
                    }
                    break;
                case 202:{
                    this.jLabel202.setIcon(Imagen2[2]);
                    }
                    break;
                case 203:{
                    this.jLabel203.setIcon(Imagen2[3]);
                    
                    }
                    break;
                case 204:{
                    this.jLabel204.setIcon(Imagen2[4]);
                    }
                    break;
                case 205:{
                    
                    this.jLabel205.setIcon(Imagen2[5]);
                    }
                    break;
                case 206:{
                    this.jLabel206.setIcon(Imagen2[6]);
                    }
                    break;
                case 207:{
                    this.jLabel207.setIcon(Imagen2[7]);
                    
                    }
                    break;
                case 208:{
                    System.out.println("ok");
                    this.jLabel208.setIcon(Imagen2[8]);
                    }
                    break;
                case 209:{
                    System.out.println("ok");
                    this.jLabel209.setIcon(Imagen2[9]);
                    }
                    break;
                case 210:{
                    this.jLabel210.setIcon(Imagen2[10]);
                    }
                    break;
                case 211:{
                    
                    this.jLabel211.setIcon(Imagen2[11]);
                    }
                    break;
                case 212:{
                    this.jLabel212.setIcon(Imagen2[12]);
                    }
                    break;
                case 213:{
                    
                    this.jLabel213.setIcon(Imagen2[13]);
                    }
                    break;
                case 214:{
                    this.jLabel214.setIcon(Imagen2[14]);
                    }
                    break;
                case 215:{
                    
                    this.jLabel215.setIcon(Imagen2[15]);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel201 = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        jLabel203 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        jLabel205 = new javax.swing.JLabel();
        jLabel206 = new javax.swing.JLabel();
        jLabel207 = new javax.swing.JLabel();
        jLabel208 = new javax.swing.JLabel();
        jLabel209 = new javax.swing.JLabel();
        jLabel210 = new javax.swing.JLabel();
        jLabel211 = new javax.swing.JLabel();
        jLabel212 = new javax.swing.JLabel();
        jLabel213 = new javax.swing.JLabel();
        jLabel214 = new javax.swing.JLabel();
        jLabel215 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("PISO 2");

        jButton1.setText("REGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel201.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Puerta 201.jpg"))); // NOI18N
        jLabel201.setText(" ");

        jLabel202.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Puerta 202.jpg"))); // NOI18N

        jLabel203.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Puerta 203.jpg"))); // NOI18N
        jLabel203.setText(" ");

        jLabel204.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Puerta 204.jpg"))); // NOI18N
        jLabel204.setText(" ");

        jLabel205.setBackground(new java.awt.Color(51, 51, 51));
        jLabel205.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Puerta 205.jpg"))); // NOI18N
        jLabel205.setText(" ");

        jLabel206.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Puerta 206.jpg"))); // NOI18N
        jLabel206.setText(" ");

        jLabel207.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Puerta 207.jpg"))); // NOI18N
        jLabel207.setText(" ");

        jLabel208.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Puerta 208.jpg"))); // NOI18N
        jLabel208.setText(" ");

        jLabel209.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Puerta 209.jpg"))); // NOI18N
        jLabel209.setText(" ");

        jLabel210.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Puerta 210.jpg"))); // NOI18N
        jLabel210.setText(" ");

        jLabel211.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Puerta 211.jpg"))); // NOI18N
        jLabel211.setText(" ");

        jLabel212.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Puerta 212.jpg"))); // NOI18N
        jLabel212.setText(" ");

        jLabel213.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Puerta 213.jpg"))); // NOI18N
        jLabel213.setText(" ");

        jLabel214.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Puerta 214.jpg"))); // NOI18N
        jLabel214.setText(" ");

        jLabel215.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Puerta 215.jpg"))); // NOI18N
        jLabel215.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel211, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel206, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel201, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel202)
                    .addComponent(jLabel207, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel212, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel203, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel213, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel208, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(115, 115, 115))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel210, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel204, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel209, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel214, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel215, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel205, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(99, 99, 99))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel202, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel201)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel203)
                        .addComponent(jLabel204)
                        .addComponent(jLabel205)))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel206)
                    .addComponent(jLabel207)
                    .addComponent(jLabel208)
                    .addComponent(jLabel209)
                    .addComponent(jLabel210))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel211)
                    .addComponent(jLabel212)
                    .addComponent(jLabel213)
                    .addComponent(jLabel214)
                    .addComponent(jLabel215))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
       
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Piso2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Piso2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Piso2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Piso2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Piso2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}