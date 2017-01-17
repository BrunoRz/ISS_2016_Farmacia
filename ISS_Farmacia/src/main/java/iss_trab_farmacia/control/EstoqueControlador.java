/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.control;

import iss_trab_farmacia.entity.Estoque;
import iss_trab_farmacia.entity.Produto;
import iss_trab_farmacia.util.SingletonBd;
import java.util.List;
import org.bson.types.ObjectId;
import org.mongodb.morphia.dao.BasicDAO;

/**
 *
 * @author guilherme
 */
public class EstoqueControlador extends BasicDAO<Estoque, ObjectId>{
    
    public EstoqueControlador() {
        super(Estoque.class, SingletonBd.getInstance().getDs());
    }
    
    
    public void removerEstoque(Produto produto, int qnt) {
        this.save(new Estoque(produto, 2, qnt));
    }
    
    public void inserirEstoque(Produto produto, int qnt) {
        this.save(new Estoque(produto, 1, qnt));
    }
    
    public int getEstoque(Produto produto){
        int total = 0;
        List<Estoque> lE = this.createQuery().field("produto.id").equal(produto.getId()).asList();
        for(Estoque e: lE) {
            if (e.getTipoMovimento() == 1) {
                total += e.getQnt();
            }
            else total -= e.getQnt();
        }
        return total;
    }
}
