/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.control;

import iss_trab_farmacia.entity.Pessoa;
import iss_trab_farmacia.entity.Venda;
import java.util.List;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;

/**
 *
 * @author guilherme
 */
public class Vendas extends BasicDAO<Venda, ObjectId> {
    
    public Vendas(Datastore ds) {
        super(Venda.class, ds);
    }
    
    public List<Venda> buscarCliente(Pessoa cliente) {
       return this.getDs().createQuery(Venda.class).field("Pessoa.nome").equal(cliente.getNome()).asList();
    }
}
