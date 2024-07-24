/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.perforacion;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author User
 */
public class EstadoCertificadoRender extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Cambiar el color de fondo de la celda dependiendo del estado
        String estado = (String) value;
        switch (estado) {
            case "NO CONFORME":
                cellComponent.setBackground(Color.RED);
                break; 
                
            case "ENTREGADO-PENDIENTE POR REVISAR": 
                 cellComponent.setBackground(Color.YELLOW);
                break;
                
             case "APROBADO": 
                 cellComponent.setBackground(Color.BLUE);
                break;
                
              case "SIN ENTREGAR": 
                cellComponent.setBackground(table.getBackground());
                break;

            default:
                cellComponent.setBackground(table.getBackground());
                break;

        }

        return cellComponent;
    }

}
