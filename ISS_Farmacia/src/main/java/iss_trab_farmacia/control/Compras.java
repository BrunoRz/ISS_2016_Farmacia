/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.control;

import iss_trab_farmacia.entity.Compra;
import iss_trab_farmacia.entity.Produto;
import iss_trab_farmacia.util.ItemCompra;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;

/**
 *
 * @author guilherme
 */
class Compras extends BasicDAO<Compra, ObjectId> {
    
    public Compras(Datastore ds) {
        super(Compra.class, ds);
    }
    
    public ItemCompra ultimaCompra(Produto produto) {
        Query<Compra> query = this.getDs().createQuery(Compra.class);
        Compra compra = query.field("itensCompra.$.produto._id").equal(produto.getId()).order("dataCompra").get();
        return compra.inCompra(produto);
    }
}
