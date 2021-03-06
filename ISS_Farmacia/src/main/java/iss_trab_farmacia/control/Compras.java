/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.control;

import iss_trab_farmacia.entity.Caixa;
import iss_trab_farmacia.entity.Compra;
import iss_trab_farmacia.entity.Produto;
import iss_trab_farmacia.util.ItemCompra;
import iss_trab_farmacia.util.SingletonBd;
import iss_trab_farmacia.util.Validador;
import java.util.Iterator;
import java.util.Set;
import javax.validation.ConstraintViolation;
import org.bson.types.ObjectId;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;

/**
 *
 * @author guilherme
 */
public class Compras extends BasicDAO<Compra, ObjectId>{
    
    EstoqueControlador estoque = new EstoqueControlador();
    Validador<Compra> validador = new Validador<>();
    
    public Compras() {
        super(Compra.class, SingletonBd.getInstance().getDs());
    }
  
    public ItemCompra ultimaCompra(Produto produto) {
        Query<Compra> query = this.createQuery();
        Compra compra = query.field("itensCompra.$.produto._id").equal(produto.getId()).order("dataCompra").get();
        return compra.inCompra(produto);
    }
    
    public void salvarCompra(Compra compra) {
        Iterator<ItemCompra> itItens = compra.getItensCompra().iterator();
        
        while(itItens.hasNext()) {
            ItemCompra iCompra = itItens.next();
            estoque.inserirEstoque(iCompra.getProduto(), iCompra.getQnt());
        }
        
        Caixa2 caixa = new Caixa2();
        caixa.save(new Caixa(compra));
        
        this.save(compra);
        
    }
    
    public Set<ConstraintViolation<Compra>> constraintViolations(Compra compra) {
        return validador.constraintViolations(compra);
    }
}
