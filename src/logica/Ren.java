/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Gaia F. Braccia
 */
public class Ren extends DefaultTableCellRenderer {
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            JButton but= (JButton) value;
        boolean b= ((Boolean) value).booleanValue();
     if(isSelected){
         but.setForeground(table.getSelectionForeground());
         but.setBackground(table.getSelectionBackground());
     }else{
         but.setForeground(table.getForeground());
         but.setBackground(UIManager.getColor("Button.background"));
     }
        
//        ((JCheckBox) component).setSelected(b);
  return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    
    }
    
}
