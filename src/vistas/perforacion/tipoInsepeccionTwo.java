/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.perforacion;

import java.util.prefs.Preferences;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import reportes.leePlantilla;

/**
 *
 * @author User
 */
public class tipoInsepeccionTwo extends javax.swing.JFrame {

    /**
     * Creates new form tipoInspeccion
     */
    public tipoInsepeccionTwo() {
        initComponents();
        this.setLocationRelativeTo(null);
        getDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel13 = new javax.swing.JPanel();
        jLabel197 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        jLabel199 = new javax.swing.JLabel();
        jLabel200 = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        jLabel203 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        jLabel207 = new javax.swing.JLabel();
        jLabel208 = new javax.swing.JLabel();
        jLabel209 = new javax.swing.JLabel();
        nextbtn10 = new javax.swing.JButton();
        Wk4txt10 = new javax.swing.JCheckBox();
        Perf2txt10 = new javax.swing.JCheckBox();
        Perf4txt10 = new javax.swing.JCheckBox();
        Wk2txt10 = new javax.swing.JCheckBox();
        Perf1txt10 = new javax.swing.JCheckBox();
        Wk1txt10 = new javax.swing.JCheckBox();
        Perf3txt10 = new javax.swing.JCheckBox();
        Wk3txt11 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel197.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel197.setText("-INSPECCIÓN DE CUMPLIMIENTO, FUNCIONALIDAD Y RECIBO");
        jPanel13.add(jLabel197, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        jLabel198.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel198.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel198.setText("WK");
        jPanel13.add(jLabel198, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 40, 20));

        jLabel199.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel199.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel199.setText("PERF");
        jPanel13.add(jLabel199, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 40, 20));

        jLabel200.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel200.setText("CELULAR");
        jPanel13.add(jLabel200, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 229, 77, 0));

        jLabel202.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel202.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel202.setText("NIVEL DE INSPECCION");
        jPanel13.add(jLabel202, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 182, 32));

        jLabel203.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel203.setText("NACIONAL");
        jPanel13.add(jLabel203, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, 20));

        jLabel204.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel204.setText("-INSPECCIÓN VISUAL PARA SELECCIÓN DE EQUIPOS Y HERRAMIENTAS");
        jPanel13.add(jLabel204, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));

        jLabel207.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel207.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel207.setText("PERF");
        jPanel13.add(jLabel207, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 60, 20));

        jLabel208.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel208.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel208.setText("WK");
        jPanel13.add(jLabel208, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 40, 20));

        jLabel209.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel209.setText("INTERNACIONAL");
        jPanel13.add(jLabel209, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, 20));

        nextbtn10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/savedisk_floppydisk_guardar_1543.png"))); // NOI18N
        nextbtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtn1ActionPerformed(evt);
            }
        });
        jPanel13.add(nextbtn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, -1, -1));

        Wk4txt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Wk4txt1ActionPerformed(evt);
            }
        });
        jPanel13.add(Wk4txt10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, -1, -1));

        Perf2txt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Perf2txt1ActionPerformed(evt);
            }
        });
        jPanel13.add(Perf2txt10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, -1, -1));
        jPanel13.add(Perf4txt10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, -1, -1));

        Wk2txt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Wk2txt1ActionPerformed(evt);
            }
        });
        jPanel13.add(Wk2txt10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, -1, -1));

        Perf1txt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Perf1txt1ActionPerformed(evt);
            }
        });
        jPanel13.add(Perf1txt10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, -1));

        Wk1txt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Wk1txt1ActionPerformed(evt);
            }
        });
        jPanel13.add(Wk1txt10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        Perf3txt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Perf3txt10ActionPerformed(evt);
            }
        });
        jPanel13.add(Perf3txt10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, -1));

        Wk3txt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Wk3txt2ActionPerformed(evt);
            }
        });
        jPanel13.add(Wk3txt11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, -1, -1));

        jButton1.setText("Volver");
        jPanel13.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 711, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Wk3txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Wk3txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Wk3txt2ActionPerformed

    private void Wk1txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Wk1txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Wk1txt1ActionPerformed

    private void Perf1txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Perf1txt1ActionPerformed
    }//GEN-LAST:event_Perf1txt1ActionPerformed

    private void Wk2txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Wk2txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Wk2txt1ActionPerformed

    private void Perf2txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Perf2txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Perf2txt1ActionPerformed

    private void Wk4txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Wk4txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Wk4txt1ActionPerformed

    private void nextbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtn1ActionPerformed
        Preferences prefs = Preferences.userNodeForPackage(tipoInspeccion.class);

        int perf1, perf2, perf3, perf4, wk1, wk2, wk3, wk4;

        perf1 = (Perf1txt10.isSelected()) ? 1 : 0;
        System.out.println(perf1);
        perf2 = (Perf2txt10.isSelected()) ? 1 : 0;
        perf3 = (Perf3txt10.isSelected()) ? 1 : 0;
        perf4 = (Perf4txt10.isSelected()) ? 1 : 0;
        wk1 = (Wk1txt10.isSelected()) ? 1 : 0;
        wk2 = (Wk2txt10.isSelected()) ? 1 : 0;
        wk3 = (Wk3txt11.isSelected()) ? 1 : 0;
        wk4 = (Wk4txt10.isSelected()) ? 1 : 0;

        prefs.putInt("IVSEH1", perf1);
        prefs.putInt("IVSEH3", perf2);
        prefs.putInt("ICFR1", perf3);
        prefs.putInt("ICFR3", perf4);
        prefs.putInt("IVSEH2", wk1);
        prefs.putInt("IVSEH4", wk2);
        prefs.putInt("ICFR2", wk3);
        prefs.putInt("ICFR4", wk4);

        JOptionPane.showMessageDialog(null, "Datos Guardados");
        this.setVisible(false);
    }//GEN-LAST:event_nextbtn1ActionPerformed

    private void Perf3txt10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Perf3txt10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Perf3txt10ActionPerformed
    private void getDatos() {
        Preferences prefs = Preferences.userNodeForPackage(tipoInsepeccionTwo.class);
        selectedCheck(Perf1txt10, prefs.getInt("IVSEH1", 0));
        selectedCheck(Perf2txt10, prefs.getInt("IVSEH3", 0));
        selectedCheck(Perf3txt10, prefs.getInt("ICFR1", 0));
        selectedCheck(Perf4txt10, prefs.getInt("ICFR3", 0));
        selectedCheck(Wk1txt10, prefs.getInt("IVSEH2", 0));
        selectedCheck(Wk2txt10, prefs.getInt("IVSEH4", 0));
        selectedCheck(Wk3txt11, prefs.getInt("ICFR2", 0));
        selectedCheck(Wk4txt10, prefs.getInt("ICFR4", 0));

    }

    private void selectedCheck(JCheckBox j, int value) {
        if (value == 1) {
            j.setSelected(true);

        }
    }

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
            java.util.logging.Logger.getLogger(tipoInspeccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tipoInspeccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tipoInspeccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tipoInspeccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tipoInspeccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Perf1txt10;
    private javax.swing.JCheckBox Perf2txt10;
    private javax.swing.JCheckBox Perf3txt10;
    private javax.swing.JCheckBox Perf4txt10;
    private javax.swing.JCheckBox Wk1txt10;
    private javax.swing.JCheckBox Wk2txt10;
    private javax.swing.JCheckBox Wk3txt11;
    private javax.swing.JCheckBox Wk4txt10;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JButton nextbtn10;
    // End of variables declaration//GEN-END:variables
}
