/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.util.table_models;

import iss_trab_farmacia.util.ItemVenda;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author guilherme
 */
public class ItemVendaTableModel extends DefaultTableModel{

    public ItemVendaTableModel(List<ItemVenda> itensVenda) {
        Iterator<ItemVenda> it = itensVenda.iterator();
        while (it.hasNext()) {
            this.addItemVenda(it.next());
        }
        
        this.addColumn(new Object[] {"Descrição", "Descrição", "Valor", "Sub-Total"});
    }
    
    public void addItemVenda(ItemVenda item) {
        this.addRow(item.toVector());
    }
    
}
