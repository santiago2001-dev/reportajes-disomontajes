/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.perforacion;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.prefs.Preferences;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.BackingStoreException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import models.modelEvidencias;
import models.modelResumen;
import reportes.leePlantilla;

/**
 *
 * @author taesi
 */
public class resumenInspeccion extends javax.swing.JFrame {

    /**
     * Creates new form resumenInspeccion
     */
    public resumenInspeccion() {
        initComponents();
        getDatos();
    }

    ArrayList<modelResumen> data = new ArrayList();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descTXt = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        nextSystembtn = new javax.swing.JButton();
        saveSisbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableConfig = new javax.swing.JTable();
        fechadoc = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("resumen de inspeccion");

        jLabel2.setText("DESCRIPCIÓN");

        descTXt.setColumns(20);
        descTXt.setRows(5);
        jScrollPane1.setViewportView(descTXt);

        jLabel3.setText("FECHA");

        nextSystembtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.jpg"))); // NOI18N
        nextSystembtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextSystembtnActionPerformed(evt);
            }
        });

        saveSisbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/savedisk_floppydisk_guardar_1543.png"))); // NOI18N
        saveSisbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveSisbtnActionPerformed(evt);
            }
        });

        tableConfig = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        tableConfig.setModel(new javax.swing.table.DefaultTableModel(
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
        tableConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableConfigMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableConfig);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(saveSisbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(nextSystembtn)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(86, 86, 86))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(190, 190, 190))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fechadoc, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(61, 61, 61)))))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(fechadoc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveSisbtn)
                    .addComponent(nextSystembtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextSystembtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nextSystembtnActionPerformed

        if (!descTXt.getText().isEmpty()) {
            Date selectedDate = fechadoc.getDate();

            if (selectedDate != null) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                String formattedDate = dateFormat.format(selectedDate);
                data.add(new modelResumen(formattedDate, descTXt.getText()));

            }
        } else {
            JOptionPane.showMessageDialog(null, "campos obligatorios");

        }

        try {
            seeDataInTable(data);
        } catch (Exception e) {
            System.out.println("data null");
        }

        JOptionPane.showMessageDialog(null, "Datos Guardados");

    }
      private void getDatos() {
         Preferences resumen = Preferences.userNodeForPackage(resumenInspeccion.class);
        int size = Integer.parseInt(resumen.get("sizeResumen", "0"));
        if(size >0){
            ArrayList<modelResumen> data = new ArrayList();

        for (int i = 0; i < size; i++) {
            String name = "nameResumen" + i;
            String desc = "descResumen" + i;
            data.add(new modelResumen(resumen.get(name, " "), resumen.get(desc, " ")));
        }
          seeDataInTable(data);
        }
        
    }

    private void saveSisbtnActionPerformed(java.awt.event.ActionEvent evt) {

        Preferences preferencias = Preferences.userNodeForPackage(resumenInspeccion.class);
        for (int i = 0; i < data.size(); i++) {
            String name = "nameResumen" + i;
            String desc = "descResumen" + i;
            modelResumen info = data.get(i);
            preferencias.put(name, info.getName());
            preferencias.put(desc, info.getDesc());

        }
        preferencias.put("sizeResumen", String.valueOf(data.size()));

        //leePlantilla l = leePlantilla.obtenerInstancia().obtenerInstancia();
      //  l.llenadoTabla();

        JOptionPane.showMessageDialog(null, "Datos Guardados");

        this.setVisible(false);

    }

    private void tableConfigMouseClicked(java.awt.event.MouseEvent evt) {

        deleteRegistro();
    }

    private void seeDataInTable(ArrayList<modelResumen> dataOne) {
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Nombre");
        tableModel.addColumn("Descripcion");
        tableModel.addColumn("");

        Object Datos[] = new Object[3];

        for (modelResumen data : dataOne) {
            Datos[0] = data.getName();
            Datos[1] = data.getDesc();
            try {

                JButton botonDelete = new JButton("Eliminar");
                botonDelete.setPreferredSize(new Dimension(30, 30));
                botonDelete.setVisible(true);
                Datos[2] = botonDelete;
                tableConfig.repaint();

            } catch (Exception e) {
                Datos[2] = new JLabel("No image");
            }
            tableModel.addRow(Datos);

        }
        tableConfig.setModel(tableModel);
        tableConfig.getColumnModel().getColumn(2).setCellRenderer(new resumenInspeccion.RenderTabla());
        tableConfig.setRowHeight(60);
        tableConfig.getColumnModel().getColumn(0).setPreferredWidth(60);
        tableConfig.getColumnModel().getColumn(1).setPreferredWidth(60);
        tableConfig.getColumnModel().getColumn(2).setPreferredWidth(60);

    }

    public class RenderTabla extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
            if (o instanceof JButton) {
                JButton boton = (JButton) o;
                return boton;
            }
            return super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1);
        }

    }

    public void deleteRegistro() {
        tableConfig.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = tableConfig.rowAtPoint(e.getPoint());
                int col = tableConfig.columnAtPoint(e.getPoint());

                switch (col) {
                    case 2:
                        data.remove(row);

                        seeDataInTable(data);
                        break;

                }

                System.out.println("Se hizo clic en la celda en la fila " + row + " y la columna " + col);
            }
        });
    }

// GEN-LAST:event_tableConfigMouseClicked
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
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
            java.util.logging.Logger.getLogger(resumenInspeccion.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resumenInspeccion.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resumenInspeccion.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resumenInspeccion.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resumenInspeccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea descTXt;
    private com.toedter.calendar.JDateChooser fechadoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton nextSystembtn;
    private javax.swing.JButton saveSisbtn;
    private javax.swing.JTable tableConfig;
    // End of variables declaration//GEN-END:variables
}