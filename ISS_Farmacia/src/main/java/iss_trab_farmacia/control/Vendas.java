/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.control;

import iss_trab_farmacia.entity.Pessoa;
import iss_trab_farmacia.entity.Produto;
import iss_trab_farmacia.entity.Venda;
import iss_trab_farmacia.util.ItemVenda;
import iss_trab_farmacia.util.SingletonBd;
import iss_trab_farmacia.util.Validador;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.validation.ConstraintViolation;
import org.bson.types.ObjectId;
import org.mongodb.morphia.dao.BasicDAO;

/**
 *
 * @author guilherme
 */
public class Vendas extends BasicDAO<Venda, ObjectId> {
    
    EstoqueControlador estoque = new EstoqueControlador();
    Validador<Venda> validador = new Validador<>();
      
    public Vendas() {
        super(Venda.class, SingletonBd.getInstance().getDs());
    }  
        
    public List<Venda> buscarCliente(Pessoa cliente) {
       return this.getDs().createQuery(Venda.class).field("Pessoa.nome").equal(cliente.getNome()).asList();
    }
    
    public void addProdutoVenda(Venda venda, Produto produto, int qnt){
        Produtos produtos = new Produtos();
        
        ItemVenda item = venda.inVenda(produto);
        if (venda.inVenda(produto) == null) {
            float valorVenda = produtos.sugestaoValor(produto);
            item = new ItemVenda(qnt, valorVenda, produto);
        }
        else {
            item.addQnt(qnt);
        }
        venda.addItemVenda(item);
    }
    public void salvarVenda(Venda venda) {
        Iterator<ItemVenda> itItens = venda.getListaProdutos().iterator();
        
        while(itItens.hasNext()) {
            ItemVenda iVenda = itItens.next();
            estoque.removerEstoque(iVenda.getProduto(), iVenda.getQnt());
        }
        
        this.save(venda);
    }
    
    public Set<ConstraintViolation<Venda>> constraintViolations(Venda venda) {
        return validador.constraintViolations(venda);
    }
}
