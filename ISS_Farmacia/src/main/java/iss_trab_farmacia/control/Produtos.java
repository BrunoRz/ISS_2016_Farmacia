/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.control;

import iss_trab_farmacia.entity.Produto;
import iss_trab_farmacia.util.ItemCompra;
import iss_trab_farmacia.util.SingletonBd;
import java.util.List;
import org.bson.types.ObjectId;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;

/**
 *
 * @author guilherme
 */
public class Produtos extends BasicDAO<Produto, ObjectId>{
    
    public Produtos() {
        super(Produto.class, SingletonBd.getInstance().getDs());
    }


    public float custo(Produto produto) {
        Compras compras = new Compras();
        ItemCompra item = compras.ultimaCompra(produto);
        
        return item.getPreco();
    }
    
    public float sugestaoValor(Produto produto) {
        return (float) (this.custo(produto) * 1.5);
    }
    
    public void buscaProduto(int coid){
        
    }
    
    public List<Produto> buscarTodos() {
        Query<Produto> q = this.getDs().createQuery(Produto.class);
        System.out.println(q.asList().size());
        return q.asList();
    }
    
    public List<Produto> buscarMarca(String marca) {
        Query<Produto> q = this.getDs().createQuery(Produto.class).field("marca").containsIgnoreCase(marca);
        return q.asList();
    }
    
    public List<Produto> buscarDescricao(String descricao) {
        Query<Produto> q = this.getDs().createQuery(Produto.class).field("descricao").containsIgnoreCase(descricao);
        
        return q.asList();
    }
}
