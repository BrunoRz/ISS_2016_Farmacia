/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.util.table_models;

import iss_trab_farmacia.util.ItemCompra;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author guilherme
 */
public class ItemCompraTableModel extends DefaultTableModel{

    public ItemCompraTableModel(List<ItemCompra> itensCompra) {
        Iterator<ItemCompra> it = itensCompra.iterator();
        while (it.hasNext()) this.addItemCompra(it.next());
        
        this.addRow(new Object[] {"Descrição", "Quantidade", "Valor", "Sub-Total"});
    }
    
    
    public void addItemCompra(ItemCompra item) {
        this.addRow(item.toVector());
    }
}
