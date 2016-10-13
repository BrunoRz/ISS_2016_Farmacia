/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.FindIterable;

/**
 *
 * @author guilherme
 * @param <T>
 * @param <PK>
 */
public class GenericDAO<T, PK> {
    
    private final MongoCollection<T> collection;

    public GenericDAO(String nome,MongoDatabase db, Class classe) {
        this.collection =  db.getCollection(nome, classe);
    }
    
    public FindIterable<T> buscarID(PK pk) {
        FindIterable<T> result;
        result = this.collection.find();
        return result;
    }
}
