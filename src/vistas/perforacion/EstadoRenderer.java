/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.perforacion;

/**
 *
 * @author taesi
 */
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class EstadoRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Cambiar el color de fondo de la celda dependiendo del estado
        String estado = (String) value;
        if (estado != null) {
            if (estado.equals("CRÍTICO/EJECUCIÓN INMEDIATA")) {
                cellComponent.setBackground(Color.RED);
            } else if (estado.equals("MAYOR/EJECUCIÓN DURANTE OPERACIÓN")) {
                cellComponent.setBackground(Color.YELLOW);
            } else if (estado.equals("MENOR")) {
                cellComponent.setBackground(Color.GREEN);
            } else if (estado.equals("EN BUEN ESTADO")) {
                cellComponent.setBackground(Color.GREEN);

            } else {
                // Color predeterminado para cualquier otro estado
                cellComponent.setBackground(table.getBackground());
            }
        } else {
            // Color predeterminado si el estado es null
            cellComponent.setBackground(table.getBackground());
        }

        return cellComponent;
    }
}
