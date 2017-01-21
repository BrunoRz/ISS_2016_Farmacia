/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.control;

import iss_trab_farmacia.entity.Compra;
import iss_trab_farmacia.entity.Produto;
import iss_trab_farmacia.util.ItemCompra;
import iss_trab_farmacia.util.SingletonBd;
import java.util.Iterator;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import org.bson.types.ObjectId;
import org.hibernate.validator.HibernateValidator;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;

/**
 *
 * @author guilherme
 */
public class Compras extends BasicDAO<Compra, ObjectId> {
    
    EstoqueControlador estoque = new EstoqueControlador();
    
    public Compras() {
        super(Compra.class, SingletonBd.getInstance().getDs());
    }
  
    public ItemCompra ultimaCompra(Produto produto) {
        Query<Compra> query = this.getDs().createQuery(Compra.class);
        Compra compra = query.field("itensCompra.$.produto._id").equal(produto.getId()).order("dataCompra").get();
        return compra.inCompra(produto);
    }
    
    public void salvarCompra(Compra compra) {
        Iterator<ItemCompra> itItens = compra.getItensCompra().iterator();
        
        while(itItens.hasNext()) {
            ItemCompra iCompra = itItens.next();
            estoque.inserirEstoque(iCompra.getProduto(), iCompra.getQnt());
        }
        
        this.save(compra);
        
    }
    
    public Set<ConstraintViolation<Compra>> constraintViolations(Compra compra) {
        Validator validator = Validation.byProvider(HibernateValidator.class)
                .configure()
                .buildValidatorFactory()
                .getValidator();
        return validator.validate(compra);
    }
}
