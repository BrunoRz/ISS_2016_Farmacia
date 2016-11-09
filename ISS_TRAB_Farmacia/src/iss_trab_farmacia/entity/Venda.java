/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.entity;

import com.sun.corba.se.spi.ior.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

/**
 *
 * @author guilherme
 */
@Entity("vendas")
public class Venda {
    
    @Id
    private ObjectId id;
    
    @Reference
    private final Cliente cliente;

    public Venda(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ObjectId getId() {
        return id;
    }
    
    
}
