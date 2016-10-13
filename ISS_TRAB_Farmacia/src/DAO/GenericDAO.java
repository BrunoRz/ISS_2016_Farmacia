/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.BasicBSONObject;

/**
 *
 * @author guilherme
 * @param <PK>
 */
public class GenericDAO<PK> {
    
    private final MongoCollection collection;

    public GenericDAO(String nome,MongoDatabase db, BasicBSONObject schema) {
        try {
            db.getCollection(nome, BasicBSONObject.class);
        }
        catch(Exception e) {
            db.createCollection(nome, new BasicBSONObject().append("validator", schema));
        }
        
        this.collection = db.getCollection(nome, BasicBSONObject.class);
    }
}
