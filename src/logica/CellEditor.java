/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Gaia F. Braccia
 */
public class CellEditor extends DefaultCellEditor implements TableCellRenderer{
    private final JComponent component= new JCheckBox();
    private boolean value = false;
    public CellEditor() {
        super(new JCheckBox());
    }
    /**isbdwlijb
    @param table
    @param value
    @param isSelected
    @param row
    @param column               
    * @return */
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected,  int row, int column) {
        
     boolean b= ((Boolean) value).booleanValue();
     ((JCheckBox) component).setSelected(b);
     return ((JCheckBox) component);
    }
    
    @Override
    public boolean stopCellEditing(){
        value= ((Boolean)getCellEditorValue()).booleanValue();
        ((JCheckBox) component).setSelected(value);
        return super.stopCellEditing();
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row , int column){
        if (value ==null){
            return null;
        }
        return ((JCheckBox) component);
    }
}
