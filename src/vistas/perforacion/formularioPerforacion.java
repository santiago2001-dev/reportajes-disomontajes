/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.perforacion;

import java.util.prefs.Preferences;
import javax.swing.JOptionPane;
import reportes.leePlantilla;
import vistas.login;

/**
 *
 * @author User
 */
public class formularioPerforacion extends javax.swing.JFrame {

    /**
     * Creates new form formularioPerforacion
     */
    public formularioPerforacion() {
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nombre1txt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        nombretxt2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        celulartxt3 = new javax.swing.JTextField();
        nombretxt3 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        depatxt = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        municipiotxt = new javax.swing.JTextField();
        siguienteUnoBtn = new javax.swing.JButton();
        correotxt = new javax.swing.JTextField();
        correotxt3 = new javax.swing.JTextField();
        celulart1txt = new javax.swing.JTextField();
        correotxt2 = new javax.swing.JTextField();
        celulartxt6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        equipoRiegtxt1 = new javax.swing.JTextField();
        pozotxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel7.setText("INFORMACION DE POZO");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, -1, -1));

        jLabel8.setText("CELULAR");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 60, 20));

        jLabel9.setText("NOMBRE");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 60, 20));

        jLabel10.setText("CORREO");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 60, 20));

        jLabel13.setText("NOMBRE");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 60, 20));

        nombre1txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre1txtActionPerformed(evt);
            }
        });
        jPanel2.add(nombre1txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 180, -1));

        jLabel14.setText("CELULAR");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 60, 20));

        jLabel15.setText("CORREO");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 70, 20));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("POZO");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 60, 20));

        jLabel17.setText("NOMBRE");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 60, 20));

        nombretxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombretxt2ActionPerformed(evt);
            }
        });
        jPanel2.add(nombretxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 180, -1));

        jLabel18.setText("CELULAR");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 60, 20));

        jLabel19.setText("CORREO");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 60, -1));

        celulartxt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celulartxt3ActionPerformed(evt);
            }
        });
        jPanel2.add(celulartxt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 140, -1));

        nombretxt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombretxt3ActionPerformed(evt);
            }
        });
        jPanel2.add(nombretxt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 180, -1));

        jLabel21.setText("EQUIPO RIEGO");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 103, 37));

        depatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depatxtActionPerformed(evt);
            }
        });
        jPanel2.add(depatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 117, -1));

        jLabel22.setText("DEPARTAMENTO");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, -1, -1));

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("MUNICIPIO");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 77, 20));

        municipiotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                municipiotxtActionPerformed(evt);
            }
        });
        jPanel2.add(municipiotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 117, -1));

        siguienteUnoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/savedisk_floppydisk_guardar_1543.png"))); // NOI18N
        siguienteUnoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteUnoBtnActionPerformed(evt);
            }
        });
        jPanel2.add(siguienteUnoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, -1, -1));

        correotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correotxtActionPerformed(evt);
            }
        });
        jPanel2.add(correotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 140, -1));

        correotxt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correotxt3ActionPerformed(evt);
            }
        });
        jPanel2.add(correotxt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 140, -1));

        celulart1txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celulart1txtActionPerformed(evt);
            }
        });
        jPanel2.add(celulart1txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 140, -1));

        correotxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correotxt2ActionPerformed(evt);
            }
        });
        jPanel2.add(correotxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 140, -1));

        celulartxt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celulartxt6ActionPerformed(evt);
            }
        });
        jPanel2.add(celulartxt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 140, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel11.setText("INFORMACION DE CONTACTO");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        equipoRiegtxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipoRiegtxt1ActionPerformed(evt);
            }
        });
        jPanel2.add(equipoRiegtxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 120, -1));

        pozotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pozotxtActionPerformed(evt);
            }
        });
        jPanel2.add(pozotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombre1txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre1txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre1txtActionPerformed

    private void nombretxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombretxt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombretxt2ActionPerformed

    private void celulartxt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celulartxt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celulartxt3ActionPerformed

    private void nombretxt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombretxt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombretxt3ActionPerformed

    //funcion para poner datos en los labels 
    private void getDatos() {
        Preferences prefs = Preferences.userNodeForPackage(formularioPerforacion.class);

        String equipoRieg = prefs.get("equipoRieg", " ");

        String nombre1 = prefs.get("nombre1", " ");
        String celular1 = prefs.get("celular1", " ");
        String correo1 = prefs.get("correo1", " ");

        String nombre2 = prefs.get("nombre2", " ");
        String celular2 = prefs.get("celular2", " ");
        String correo2 = prefs.get("correo2", " ");

        String nombre3 = prefs.get("nombre3", " ");
        String celular3 = prefs.get("celular3", " ");
        String correo3 = prefs.get("correo3", " ");
        String municipio = prefs.get("municipio", " ");
        String pozo = prefs.get("pozo", " ");
        String depa = prefs.get("depa", " ");

        pozotxt.setText(equipoRieg);

        nombre1txt.setText(nombre1);
        celulart1txt.setText(celular1);
        correotxt.setText(correo1);

        nombretxt2.setText(nombre2);
        correotxt.setText(celular2);
        celulartxt3.setText(correo2);

        nombretxt3.setText(nombre3);
        celulartxt3.setText(celular3);
        correotxt3.setText(correo3);
        municipiotxt.setText(municipio);
        pozotxt.setText(pozo);
        depatxt.setText(depa);
        
    }
    private void siguienteUnoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteUnoBtnActionPerformed

        Preferences prefs = Preferences.userNodeForPackage(formularioPerforacion.class);
       // System.out.println(jdcFecha.getDate());
        prefs.put("equipoRieg", equipoRiegtxt1.getText());

        prefs.put("nombre1", nombre1txt.getText());
        prefs.put("celular1", celulart1txt.getText());
        prefs.put("correo1", correotxt.getText());

        prefs.put("nombre2", nombretxt2.getText());
        prefs.put("celular2", correotxt.getText());
        prefs.put("correo2", celulartxt3.getText());

        prefs.put("nombre3", nombretxt3.getText());
        prefs.put("celular3", celulartxt3.getText());
        prefs.put("correo3", correotxt3.getText());
        prefs.put("municipio", municipiotxt.getText());
        prefs.put("pozo", pozotxt.getText());
        prefs.put("depa", depatxt.getText());

        JOptionPane.showMessageDialog(null, "Datos Guardados");
        
        this.setVisible(false);

        presenteadoA p = new presenteadoA();
        p.setVisible(true);


    }//GEN-LAST:event_siguienteUnoBtnActionPerformed

    private void depatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depatxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depatxtActionPerformed

    private void municipiotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_municipiotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_municipiotxtActionPerformed

    private void correotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correotxtActionPerformed

    private void correotxt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correotxt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correotxt3ActionPerformed

    private void celulart1txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celulart1txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celulart1txtActionPerformed

    private void correotxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correotxt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correotxt2ActionPerformed

    private void celulartxt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celulartxt6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celulartxt6ActionPerformed

    private void equipoRiegtxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipoRiegtxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equipoRiegtxt1ActionPerformed

    private void pozotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pozotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pozotxtActionPerformed

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
            java.util.logging.Logger.getLogger(formularioPerforacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formularioPerforacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formularioPerforacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formularioPerforacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formularioPerforacion().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField celulart1txt;
    private javax.swing.JTextField celulartxt3;
    private javax.swing.JTextField celulartxt6;
    private javax.swing.JTextField correotxt;
    private javax.swing.JTextField correotxt2;
    private javax.swing.JTextField correotxt3;
    private javax.swing.JTextField depatxt;
    private javax.swing.JTextField equipoRiegtxt1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField municipiotxt;
    private javax.swing.JTextField nombre1txt;
    private javax.swing.JTextField nombretxt2;
    private javax.swing.JTextField nombretxt3;
    private javax.swing.JTextField pozotxt;
    private javax.swing.JButton siguienteUnoBtn;
    // End of variables declaration//GEN-END:variables
}
