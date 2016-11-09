/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.control;

import iss_trab_farmacia.entity.Cliente;
import java.util.List;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;

/**
 *
 * @author guilherme
 */
public class Clientes extends BasicDAO<Cliente, ObjectId> {
    
    public Clientes(Datastore ds) {
        super(Cliente.class, ds);
    }
    
    /**
     *
     * @param nome Nome do cliente a ser buscado
     * @return
     */
    public List buscarNome(String nome) {
        
        Query<Cliente> query = this.getDs().createQuery(Cliente.class);
 
        return query.field("nome").equal(nome).asList();
        
    }
}
