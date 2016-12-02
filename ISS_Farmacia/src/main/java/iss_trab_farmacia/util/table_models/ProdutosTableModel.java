/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.util.table_models;

import iss_trab_farmacia.entity.Produto;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author guilherme
 */
public class ProdutosTableModel extends DefaultTableModel{
    private final List<Produto> listProdutos;
    
    public ProdutosTableModel(List<Produto> listProdutos) {
        this.listProdutos = listProdutos;
        this.addColumn("Descrição");
        this.addColumn("Valor Unit");
        this.addColumn("Qtd.");
        this.addColumn("Valor Total");
        Iterator<Produto> iterProdutos = listProdutos.iterator();
        while(iterProdutos.hasNext())insertProduto(iterProdutos.next());
    }
    
    private void insertProduto(Produto produto){
        this.addRow(produto.toVetor());
    }
}