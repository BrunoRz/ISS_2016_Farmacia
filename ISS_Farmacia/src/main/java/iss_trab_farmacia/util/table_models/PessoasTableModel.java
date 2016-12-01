/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.util.table_models;

import iss_trab_farmacia.entity.Pessoa;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author guilherme
 */
public class PessoasTableModel extends DefaultTableModel {
    
    private final List<Pessoa> listPessoas;

    public PessoasTableModel(List<Pessoa> listPessoas) {
        this.listPessoas = listPessoas;
        this.addColumn("Nome");
        this.addColumn("RG");
        this.addColumn("CPF");
        this.addColumn("Data Nasc");
        Iterator<Pessoa> iterPessoas = this.listPessoas.iterator();
        while (iterPessoas.hasNext()) insertPessoa(iterPessoas.next());
    }
    
    private void insertPessoa(Pessoa pessoa) {
        this.addRow(pessoa.toVetor());
    }
}
