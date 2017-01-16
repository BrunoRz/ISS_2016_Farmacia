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

    List<ItemVenda> listItens;
    
    public ItemVendaTableModel(List<ItemVenda> itensVenda) {
        listItens = itensVenda;
        Iterator<ItemVenda> it = itensVenda.iterator();
        while (it.hasNext()) {
            this.addItemVenda(it.next());
        }
        
        this.addColumn("Descrição");
        this.addColumn("Quantidade");
        this.addColumn("Valor");
        this.addColumn("Sub-Total");
    }
    
    public void addItemVenda(ItemVenda item) {
        this.addRow(item.toVector());
    }
    
    public float getTotal() {
        float total = 0;
        Iterator<ItemVenda> iI = this.listItens.iterator();
        while(iI.hasNext()) {
            total += iI.next().subTotal();
        }
        return total;
    }
    
    @Override
    public boolean isCellEditable(int row, int column){
        return false;
    }
    
}
