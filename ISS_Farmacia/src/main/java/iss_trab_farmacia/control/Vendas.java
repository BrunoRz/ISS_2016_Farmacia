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
import java.util.List;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;

/**
 *
 * @author guilherme
 */
public class Vendas extends BasicDAO<Venda, ObjectId> {
    
    private final Produtos produtos;
    
    public Vendas(Datastore ds) {
        super(Venda.class, ds);
        this.produtos = new Produtos(ds);
    }

    private Produtos getProdutos() {
        return produtos;
    }
    
    public List<Venda> buscarCliente(Pessoa cliente) {
       return this.getDs().createQuery(Venda.class).field("Pessoa.nome").equal(cliente.getNome()).asList();
    }
    
    public void addProdutoVenda(Venda venda, Produto produto, int qnt){
        ItemVenda item = venda.inVenda(produto);
        if (venda.inVenda(produto) == null) {
            float valorVenda = this.getProdutos().sugestaoValor(produto);
            float custo = this.getProdutos().custo(produto);
            item = new ItemVenda(qnt, valorVenda, custo, produto);
        }
        else {
            item.addQnt(qnt);
        }
        venda.addItemVenda(item);
    }
}
