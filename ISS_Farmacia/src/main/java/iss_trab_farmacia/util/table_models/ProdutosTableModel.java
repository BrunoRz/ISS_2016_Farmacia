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
        this.addColumn("Id");
        this.addColumn("Descrição");
        this.addColumn("Categoria");
        this.addColumn("Marca");
        this.addColumn("Preço Unit");
        Iterator<Produto> iterProdutos = listProdutos.iterator();
        while(iterProdutos.hasNext())insertProduto(iterProdutos.next());
    }
    
    private void insertProduto(Produto produto){
        this.addRow(produto.toVetor());
    }
        
    @Override
    public boolean isCellEditable(int row, int column){
        return false;
    }

    public List<Produto> getListProdutos() {
        return listProdutos;
    }
    
    
}
