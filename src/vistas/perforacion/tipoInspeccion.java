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
public class tipoInspeccion extends javax.swing.JFrame {

    /**
     * Creates new form tipoInspeccion
     */
    public tipoInspeccion() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        nextbtn = new javax.swing.JButton();
        Wk4txt = new javax.swing.JCheckBox();
        Perf2txt = new javax.swing.JCheckBox();
        Perf4txt = new javax.swing.JCheckBox();
        Wk2txt = new javax.swing.JCheckBox();
        Perf1txt = new javax.swing.JCheckBox();
        Wk1txt = new javax.swing.JCheckBox();
        Perf3txt = new javax.swing.JCheckBox();
        Wk3txt1 = new javax.swing.JCheckBox();
        jLabel35 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        Perf4txt1 = new javax.swing.JCheckBox();
        Perf4txt2 = new javax.swing.JCheckBox();
        Wk4txt1 = new javax.swing.JCheckBox();
        Perf2txt1 = new javax.swing.JCheckBox();
        Perf2txt2 = new javax.swing.JCheckBox();
        Perf2txt3 = new javax.swing.JCheckBox();
        Perf2txt4 = new javax.swing.JCheckBox();
        jLabel23 = new javax.swing.JLabel();
        Wk1txt1 = new javax.swing.JCheckBox();
        Wk1txt2 = new javax.swing.JCheckBox();
        Wk1txt3 = new javax.swing.JCheckBox();
        Wk1txt4 = new javax.swing.JCheckBox();
        Wk1txt5 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel8.setText("PERF");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 30, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("-EVALUACIÓN DE RIESGO E INVESTIGACION Y ACCIDENTES ");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, 32));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("WK");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 20, 31));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("PERF");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 77, 31));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("CELULAR");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 229, 77, 0));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("TIPO DE INSPECCIÓN");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 38, 182, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("NACIONAL");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, 32));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("-INSPECCION AUDITORIA CUMPLIMIENITO");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 32));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("INTERNACIONAL");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, -1, 32));

        nextbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/savedisk_floppydisk_guardar_1543.png"))); // NOI18N
        nextbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtnActionPerformed(evt);
            }
        });
        jPanel2.add(nextbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, -1, -1));

        Wk4txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Wk4txtActionPerformed(evt);
            }
        });
        jPanel2.add(Wk4txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, -1, -1));

        Perf2txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Perf2txtActionPerformed(evt);
            }
        });
        jPanel2.add(Perf2txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, -1, -1));
        jPanel2.add(Perf4txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, -1, -1));

        Wk2txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Wk2txtActionPerformed(evt);
            }
        });
        jPanel2.add(Wk2txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, -1, -1));

        Perf1txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Perf1txtActionPerformed(evt);
            }
        });
        jPanel2.add(Perf1txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        Wk1txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Wk1txtActionPerformed(evt);
            }
        });
        jPanel2.add(Wk1txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, -1, -1));

        Perf3txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Perf3txtActionPerformed(evt);
            }
        });
        jPanel2.add(Perf3txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, -1, -1));

        Wk3txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Wk3txt1ActionPerformed(evt);
            }
        });
        jPanel2.add(Wk3txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, -1, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("NIVEL DE INSPECCIÓN");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 182, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("-INSPECCIÓN DE SISTEMA DE CAIDA DE OBJETOS  Y LEVANTAMIENTOS DE CARGA");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 32));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("-INSPECCION VISUAL PARA SELECCION DE EQUIPOS Y HERRAMIENTAS  ");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, 32));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("-INSPECCION DE CUMPLIMIENTO, FUNCIONALIDAD Y RECIBO");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 32));
        jPanel2.add(Perf4txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, -1));
        jPanel2.add(Perf4txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, -1, -1));

        Wk4txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Wk4txt1ActionPerformed(evt);
            }
        });
        jPanel2.add(Wk4txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, -1, -1));

        Perf2txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Perf2txt1ActionPerformed(evt);
            }
        });
        jPanel2.add(Perf2txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, -1, -1));

        Perf2txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Perf2txt2ActionPerformed(evt);
            }
        });
        jPanel2.add(Perf2txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, -1, -1));

        Perf2txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Perf2txt3ActionPerformed(evt);
            }
        });
        jPanel2.add(Perf2txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, -1, -1));

        Perf2txt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Perf2txt4ActionPerformed(evt);
            }
        });
        jPanel2.add(Perf2txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("WK");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 20, 31));

        Wk1txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Wk1txt1ActionPerformed(evt);
            }
        });
        jPanel2.add(Wk1txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));

        Wk1txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Wk1txt2ActionPerformed(evt);
            }
        });
        jPanel2.add(Wk1txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, -1, -1));

        Wk1txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Wk1txt3ActionPerformed(evt);
            }
        });
        jPanel2.add(Wk1txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, -1, -1));

        Wk1txt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Wk1txt4ActionPerformed(evt);
            }
        });
        jPanel2.add(Wk1txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, -1, -1));

        Wk1txt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Wk1txt5ActionPerformed(evt);
            }
        });
        jPanel2.add(Wk1txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, -1, -1));

        jButton1.setText("volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void wkInter1TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wkInter1TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wkInter1TxtActionPerformed

    private void perNac1txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perNac1txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perNac1txtActionPerformed

    private void perInter1TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perInter1TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perInter1TxtActionPerformed

    private void wkNAci2TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wkNAci2TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wkNAci2TxtActionPerformed

    private void perNAci2TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perNAci2TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perNAci2TxtActionPerformed

    private void wkNacio1TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wkNacio1TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wkNacio1TxtActionPerformed

    private void wkInter2txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wkInter2txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wkInter2txtActionPerformed

    private void perfInter2txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfInter2txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perfInter2txtActionPerformed
    private void getDatos() {
        Preferences prefs = Preferences.userNodeForPackage(tipoInspeccion.class);
        selectedCheck(Perf1txt, prefs.getInt("perf1", 0));
        selectedCheck(Perf2txt, prefs.getInt("perf2", 0));
        selectedCheck(Perf3txt, prefs.getInt("perf3", 0));
        selectedCheck(Perf4txt, prefs.getInt("perf4", 0));
        selectedCheck(Wk1txt, prefs.getInt("wk1", 0));
        selectedCheck(Wk2txt, prefs.getInt("wk2", 0));
        selectedCheck(Wk3txt1, prefs.getInt("wk3", 0));
        selectedCheck(Wk4txt, prefs.getInt("wk4", 0));

    }

    private void selectedCheck(JCheckBox j, int value) {
        if (value == 1) {
            j.setSelected(true);

        }
    }


    private void nextbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtnActionPerformed
        Preferences prefs = Preferences.userNodeForPackage(tipoInspeccion.class);

        int perf1, perf2, perf3, perf4, wk1, wk2, wk3, wk4;

        perf1 = (Perf1txt.isSelected()) ? 1 : 0;
        perf2 = (Perf2txt.isSelected()) ? 1 : 0;
        perf3 = (Perf3txt.isSelected()) ? 1 : 0;
        perf4 = (Perf4txt.isSelected()) ? 1 : 0;
        wk1 = (Wk1txt.isSelected()) ? 1 : 0;
        wk2 = (Wk2txt.isSelected()) ? 1 : 0;
        wk3 = (Wk3txt1.isSelected()) ? 1 : 0;
        wk4 = (Wk4txt.isSelected()) ? 1 : 0;

        prefs.putInt("perf1", perf1);
        prefs.putInt("perf2", perf2);
        prefs.putInt("perf3", perf3);
        prefs.putInt("perf4", perf4);
        prefs.putInt("wk1", wk1);
        prefs.putInt("wk2", wk2);
        prefs.putInt("wk3", wk3);
        prefs.putInt("wk4", wk4);


        JOptionPane.showMessageDialog(null, "Datos Guardados");
        this.setVisible(false);


    }//GEN-LAST:event_nextbtnActionPerformed

    private void Wk4txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Wk4txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Wk4txtActionPerformed

    private void Perf2txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Perf2txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Perf2txtActionPerformed

    private void Wk2txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Wk2txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Wk2txtActionPerformed

    private void Wk1txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Wk1txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Wk1txtActionPerformed

    private void Wk3txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Wk3txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Wk3txt1ActionPerformed

    private void Perf1txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Perf1txtActionPerformed
        System.out.println("me selecciono");
    }//GEN-LAST:event_Perf1txtActionPerformed

    private void Perf3txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Perf3txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Perf3txtActionPerformed

    private void Wk4txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Wk4txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Wk4txt1ActionPerformed

    private void Perf2txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Perf2txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Perf2txt1ActionPerformed

    private void Perf2txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Perf2txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Perf2txt2ActionPerformed

    private void Perf2txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Perf2txt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Perf2txt3ActionPerformed

    private void Perf2txt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Perf2txt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Perf2txt4ActionPerformed

    private void Wk1txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Wk1txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Wk1txt1ActionPerformed

    private void Wk1txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Wk1txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Wk1txt2ActionPerformed

    private void Wk1txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Wk1txt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Wk1txt3ActionPerformed

    private void Wk1txt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Wk1txt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Wk1txt4ActionPerformed

    private void Wk1txt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Wk1txt5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Wk1txt5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        infoPerforacion p = new infoPerforacion();
        p.setVisible(true);
        this.setVisible(false);
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
    private javax.swing.JCheckBox Perf1txt;
    private javax.swing.JCheckBox Perf2txt;
    private javax.swing.JCheckBox Perf2txt1;
    private javax.swing.JCheckBox Perf2txt2;
    private javax.swing.JCheckBox Perf2txt3;
    private javax.swing.JCheckBox Perf2txt4;
    private javax.swing.JCheckBox Perf3txt;
    private javax.swing.JCheckBox Perf4txt;
    private javax.swing.JCheckBox Perf4txt1;
    private javax.swing.JCheckBox Perf4txt2;
    private javax.swing.JCheckBox Wk1txt;
    private javax.swing.JCheckBox Wk1txt1;
    private javax.swing.JCheckBox Wk1txt2;
    private javax.swing.JCheckBox Wk1txt3;
    private javax.swing.JCheckBox Wk1txt4;
    private javax.swing.JCheckBox Wk1txt5;
    private javax.swing.JCheckBox Wk2txt;
    private javax.swing.JCheckBox Wk3txt1;
    private javax.swing.JCheckBox Wk4txt;
    private javax.swing.JCheckBox Wk4txt1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton nextbtn;
    // End of variables declaration//GEN-END:variables
}
