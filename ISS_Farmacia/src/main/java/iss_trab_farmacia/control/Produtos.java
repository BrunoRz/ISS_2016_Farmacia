/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.control;

import iss_trab_farmacia.entity.Produto;
import iss_trab_farmacia.util.ItemCompra;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;

/**
 *
 * @author guilherme
 */
public class Produtos extends BasicDAO<Produto, ObjectId>{
    
    private final Compras compras = new Compras(this.getDs());
    private final Vendas vendas = new Vendas(this.getDs());
    
    public Produtos(Datastore ds) {
        super(Produto.class, ds);
    }

    private Compras getCompras() {
        return compras;
    }

    private Vendas getVendas() {
        return vendas;
    }
    
    public float custo(Produto produto) {        
        ItemCompra item = this.getCompras().ultimaCompra(produto);
        
        return item.getPreco();
    }
    
    public float sugestaoValor(Produto produto) {
        return (float) (this.custo(produto) * 1.5);
    }
}