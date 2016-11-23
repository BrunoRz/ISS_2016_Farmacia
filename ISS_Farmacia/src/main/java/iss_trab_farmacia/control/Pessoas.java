/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.control;

import iss_trab_farmacia.entity.Pessoa;
import java.util.List;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;

/**
 *
 * @author guilherme
 */
public class Pessoas extends BasicDAO<Pessoa, ObjectId> {
    
    public Pessoas(Datastore ds) {
        super(Pessoa.class, ds);
    }
    
    /**
     *
     * @param nome Nome do cliente a ser buscado
     * @return
     */
    public List<Pessoa> buscarNome(String nome) {
        
        Query<Pessoa> query = this.getDs().createQuery(Pessoa.class);
 
        return query.field("nome").equal(nome).asList();
        
    }
}
