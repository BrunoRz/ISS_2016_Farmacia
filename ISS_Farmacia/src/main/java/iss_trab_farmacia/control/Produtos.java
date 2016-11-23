/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.control;

import iss_trab_farmacia.entity.Produto;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;

/**
 *
 * @author guilherme
 */
public class Produtos extends BasicDAO<Produto, ObjectId>{
    
    public Produtos(Datastore ds) {
        super(Produto.class, ds);
    }
    
    public float custo(Produto produto) {
        float valor = 0;
        
        
        
        return valor;
    }
    
    public float sugestaoValor(Produto produto) {
        float valor = 0;
        return valor;
    }
}
