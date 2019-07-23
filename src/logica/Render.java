/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Gaia F. Braccia
 */
public class Render extends DefaultTableCellRenderer{
private final JComponent component= new JCheckBox();
    
public Render(){
    setOpaque(true);
}


@Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        boolean b= ((Boolean) value).booleanValue();
     ((JCheckBox) component).setSelected(b);
     return ((JCheckBox) component);
    }

    
    
    
}
