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
    
    List<ItemCompra> listItens;

    public ItemCompraTableModel(List<ItemCompra> itensCompra) {
        listItens = itensCompra;
        Iterator<ItemCompra> it = itensCompra.iterator();
        while (it.hasNext()) this.addItemCompra(it.next());
        
        this.addColumn("Descrição");
        this.addColumn("Quantidade");
        this.addColumn("Valor");
        this.addColumn("Sub-Total");
    }
    
    
    public void addItemCompra(ItemCompra item) {
        this.addRow(item.toVector());
    }
    
    @Override
    public boolean isCellEditable(int row, int column){
        return false;
    }
    
    
    public float getTotal() {
        float total = 0;
        Iterator<ItemCompra> iI = this.listItens.iterator();
        while(iI.hasNext()) {
            total += iI.next().subTotal();
        }
        return total;
    }
}
