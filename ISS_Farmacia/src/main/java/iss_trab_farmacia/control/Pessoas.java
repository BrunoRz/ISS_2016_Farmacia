/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.control;

import iss_trab_farmacia.entity.Pessoa;
import iss_trab_farmacia.util.SingletonBd;
import iss_trab_farmacia.util.Validador;
import org.mongodb.morphia.query.Query;
import java.util.List;
import java.util.Set;
import javax.validation.ConstraintViolation;
import org.bson.types.ObjectId;
import org.mongodb.morphia.dao.BasicDAO;

/**
 *
 * @author guilherme
 */
public class Pessoas extends BasicDAO<Pessoa, ObjectId> {
    
    Validador<Pessoa> validador = new Validador<>();

    public Validador<Pessoa> getValidador() {
        return validador;
    }
    
    public Pessoas() {
        super(Pessoa.class, SingletonBd.getInstance().getDs());
    }
    
    /**
     *
     * @param nome Nome do cliente a ser buscado
     * @return
     */
    public List<Pessoa> buscarNome(String nome) {
        
        Query<Pessoa> query = this.createQuery().field("nome").containsIgnoreCase(nome);
 
        return query.asList();
        
    }
    
    

    public List<Pessoa> buscarTodos() {
        Query<Pessoa> query = this.createQuery();
 
        return query.asList();
    }
    
    public Set<ConstraintViolation<Pessoa>> constraintViolation(Pessoa pessoa){
        return validador.constraintViolations(pessoa);
    }
}
