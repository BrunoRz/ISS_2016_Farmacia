/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.util.table_models;

import iss_trab_farmacia.control.Caixa2;
import iss_trab_farmacia.entity.Caixa;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author guilherme
 */
public class CaixaTableModel extends DefaultTableModel{
    
    List<Caixa> listCaixa;
    
    public CaixaTableModel(List<Caixa> caixa) {
        listCaixa = caixa;
        Iterator<Caixa> caix = caixa.iterator();
        while (caix.hasNext()) this.addMovimentacao(caix.next());
        this.addColumn("Tipo");
        this.addColumn("Valor");
    }
    
    
    public void addMovimentacao(Caixa caixa) {
        this.addRow(caixa.toVector());
    }
    
    
    @Override
    public boolean isCellEditable(int row, int column){
        return false;
    }
    
    

}
